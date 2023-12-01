
package com.mycompany.homebanking.logica;

import com.mycompany.homebanking.persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Controladora {
    
    ControladoraPersistencia controlPersis;

    public Controladora() {
        controlPersis = new ControladoraPersistencia();
    }

    public Usuario validarUsuario(String nombreUsu, String contrasenia) {
        Usuario usu = null;
        List<Usuario> usuarios = controlPersis.traerUsuarios();
        
        for(Usuario u: usuarios) {
            if( u.getNombreUsuario().equals(nombreUsu) ) {
                if( u.getContrasenia().equals(contrasenia) ) {
                    usu = u;
                }
            }
        }
        
        return usu;
    }

    public void crearCliente(String nombre, String apellido, String dni, String usuario, String pass) {
        
        Usuario usu = new Usuario();
        usu.setNombreUsuario(usuario);
        usu.setContrasenia(pass);
        usu.setRol("cliente");
        
        controlPersis.crearUsuario(usu);
        
        List<Cuenta> cuentas = new ArrayList<Cuenta>();
        List<Tarjeta> tarjetas = new ArrayList<Tarjeta>();
        
        Cliente cliente = new Cliente();
        cliente.setNombre(nombre);
        cliente.setApellido(apellido);
        cliente.setDni(dni);
        cliente.setUnUsuario(usu);
        cliente.setCuentas(cuentas);
        cliente.setTarjetas(tarjetas);
        
        controlPersis.crearCliente(cliente);
        
    }

    public List<Cliente> traerClientes() {
        return controlPersis.traerClientes();
    }

    public Cliente traerCliente(int id_cliente) {
        return controlPersis.traerCliente(id_cliente);
    }

    public void editarCliente(int id_cliente, String nombre, String apellido, String dni, String nombreUsu, String pass) {
        
        Cliente c = controlPersis.traerCliente(id_cliente);
        
        Usuario usu = c.getUnUsuario();
        usu.setNombreUsuario(nombreUsu);
        usu.setContrasenia(pass);
         
        c.setNombre(nombre);
        c.setApellido(apellido);
        c.setDni(dni);
        c.setUnUsuario(usu);
        
        controlPersis.editarCliente(c);
        controlPersis.editarUsuario(usu);

    }

    public void borrarCliente(int id_cliente) {
        Cliente c = controlPersis.traerCliente(id_cliente);
        Usuario u = controlPersis.traerUsuario(c.getUnUsuario().getId());
        controlPersis.borrarCliente(id_cliente);
        controlPersis.borrarUsuario(u.getId());
    }

    public List<Cuenta> traerCuentas() {
        return controlPersis.traerCuentas();
    }

    public void crearCtaCte(int id_cliente) {
        
        Cliente c = controlPersis.traerCliente(id_cliente);
        String esCtaCte = "001";
        
        String cbu = generarCbu(esCtaCte);
        List<Transferencia> transferencias = new ArrayList<Transferencia>();
        
        CuentaCorriente cc = new CuentaCorriente();
        cc.setCbu(cbu);
        cc.setAlias(c.getNombre() + ".alias");
        cc.setSaldo(0);
        cc.setTransferencias(transferencias);
        cc.setUnCliente(c);
        cc.setComisionMensual(0);
        
        controlPersis.crearCtaCte(cc);
    }

    public void crearCajaAhorro(int id_cliente) {
        
        Cliente c = controlPersis.traerCliente(id_cliente);
        String esCajaAhorro = "002";
        
        String cbu = generarCbu(esCajaAhorro);
        List<Transferencia> transferencias = new ArrayList<Transferencia>();
        
        CajaAhorro ca = new CajaAhorro();
        ca.setCbu(cbu);
        ca.setAlias(c.getNombre() + ".alias");
        ca.setSaldo(0);
        ca.setTransferencias(transferencias);
        ca.setUnCliente(c);
        
        controlPersis.crearCajaAhorro(ca);
        
    }

    private String generarCbu(String tipoDeCuenta) {
        
        String cbu = tipoDeCuenta;
        
        for(int i=0; i<7; i++) {
            int numero = (int)(Math.random()*10+1);
            cbu += String.valueOf(numero);
        }
        
        return cbu;
    }

    public boolean borrarCuenta(int id_cuenta, String cbu) {
        
        boolean borrarCuenta = false;
        
        String tipoCuenta = cbu.substring(0, 3);
        
        //Cta Cte
        if(tipoCuenta.equals("001")) {
            CuentaCorriente cc = controlPersis.traerCuentaCte(id_cuenta);
            controlPersis.borrarCuentaCte(cc.getId());
            borrarCuenta = true;
        }
        
        //Caja Ahorro
        if(tipoCuenta.equals("002")) {
            CajaAhorro ca = controlPersis.traerCajaAhorro(id_cuenta);
            controlPersis.borrarCajaAhorro(ca.getId());
            borrarCuenta = true;
        }
        
        return borrarCuenta; 
    }

    public CuentaCorriente traerCtaCte(int id_cue) {
        return controlPersis.traerCtaCte(id_cue);
    }

    public CajaAhorro traerCajaAhorro(int id_cue) {
        return controlPersis.traerCajaAhorro(id_cue);
    }

    public Cuenta traerCuentaCbu(String cbu) {
        Cuenta cuenta = null;
        
        List<Cuenta> cuentas = controlPersis.traerCuentas();
        for(Cuenta c: cuentas) {
            if( c.getCbu().equals(cbu)) {
                cuenta = c;
            }
        }
        
        return cuenta;
    }

    public void transferir(Cuenta cuentaOri, String tipoTransferencia, String dni, float m, String tipo) {
        
        Cliente c = traerClienteDni(dni);
        
        Date fecha = new Date();
        
        Cuenta cuentaDes = null;
        
        if(tipo.equals("Id")) {
            
            int id = Integer.parseInt(tipoTransferencia);  
            List<Cuenta> cuentas = controlPersis.traerCuentas();
            for(Cuenta cu: cuentas) {
                if( cu.getId()==id ) {
                    cuentaDes = cu;
                }
            }
        }
        
        if(tipo.equals("Cbu")) {
            String cbu = tipoTransferencia;
            List<Cuenta> cuentas = controlPersis.traerCuentas();
            for(Cuenta cu: cuentas) {
                if( cu.getCbu().equals(cbu) ) {
                    cuentaDes = cu;
                }
            }
        }
        
        if(tipo.equals("Alias")) {
            String alias = tipoTransferencia;
            List<Cuenta> cuentas = controlPersis.traerCuentas();
            for(Cuenta cu: cuentas) {
                if( cu.getAlias().equals(alias) ) {
                    cuentaDes = cu;
                }
            }
        }
         
        Transferencia t = new Transferencia();
        t.setCuentaOrigen(cuentaOri);
        t.setCuentaDestino(cuentaDes);
        t.setBeneficiario(c);
        t.setFecha(fecha);
        t.setValor(m);

        controlPersis.transferir(t);

        cuentaOri.setSaldo(cuentaOri.getSaldo()-m);
        List<Transferencia> trans = cuentaOri.getTransferencias();
        trans.add(t);
        cuentaOri.setTransferencias(trans);

        controlPersis.modificarCuenta(cuentaOri);

        //-------------------------------------------------

        cuentaDes.setSaldo(cuentaDes.getSaldo()+m);

        controlPersis.modificarCuenta(cuentaDes); 
         
    }

    private Cliente traerClienteDni(String dni) {
        Cliente cliente = null;
        
        List<Cliente> clientes = controlPersis.traerClientes();
        for(Cliente c: clientes) {
            if( c.getDni().equals(dni) ) {
                cliente = c;
            }
        }
        
        return cliente;
    }

    public List<Transferencia> traerTransferencias() {
        return controlPersis.traerTransferencias();
    }

    public void editarAlias(int id_cuenta, String alias, Cliente cli) {
        Cuenta cuenta = null;
        List<Cuenta> cuentas = cli.getCuentas();
        for(Cuenta c: cuentas) {
            if(c.getId()==id_cuenta) {
                cuenta = c;
            }
        }
        
        cuenta.setAlias(alias);
        controlPersis.editarAlias(cuenta);
    }

    public void crearTarjeta(int id_cliente, String tipoTarjeta, String plan) {
        
        Cliente c = controlPersis.traerCliente(id_cliente);
        
        float saldoAPagar = (plan.equals("Bronce"))?1000:(plan.equals("Plata"))?1500:
                (plan.equals("Oro"))?2000:(plan.equals("Platino"))?2500:3000;
        
        
        Tarjeta t = new Tarjeta();
        t.setDisponible(0);
        t.setSaldoPagar(saldoAPagar);
        t.setTipoTarjeta(tipoTarjeta+" "+plan);
        t.setUnCliente(c);
        
        controlPersis.crearTarjeta(t);
    }

    public List<Tarjeta> traerTarjetas() {
        return controlPersis.traerTarjetas();
    }

    public void borrarTarjeta(int id_tarjeta) {
        controlPersis.borrarTarjeta(id_tarjeta);
    }

    public void editarTarjeta(int id_tarjeta, String tipoTarjeta, String plan, float disponible) {
        
        float saldoAPagar = (plan.equals("Bronce"))?1000:(plan.equals("Plata"))?1500:
                (plan.equals("Oro"))?2000:(plan.equals("Platino"))?2500:3000;
        
        Tarjeta t = controlPersis.traerTarjetas(id_tarjeta);
        t.setDisponible(disponible);
        t.setSaldoPagar(saldoAPagar);
        t.setTipoTarjeta(tipoTarjeta+" "+plan);
        
        controlPersis.editarTarjeta(t);
    }

    
    
    
    
    
    
}
