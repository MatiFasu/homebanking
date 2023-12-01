
package com.mycompany.homebanking.persistencia;

import com.mycompany.homebanking.logica.CajaAhorro;
import com.mycompany.homebanking.logica.Cliente;
import com.mycompany.homebanking.logica.Cuenta;
import com.mycompany.homebanking.logica.CuentaCorriente;
import com.mycompany.homebanking.logica.Tarjeta;
import com.mycompany.homebanking.logica.Transferencia;
import com.mycompany.homebanking.logica.Usuario;
import com.mycompany.homebanking.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    
    ClienteJpaController clienteJpa = new ClienteJpaController();
    AdminJpaController adminJpa = new AdminJpaController();
    CuentaJpaController cuentaJpa = new CuentaJpaController();
    TarjetaJpaController tarjetaJpa = new TarjetaJpaController();
    TransferenciaJpaController transfJpa = new TransferenciaJpaController();
    UsuarioJpaController usuJpa = new UsuarioJpaController();
    CajaAhorroJpaController cajaAhJpa = new CajaAhorroJpaController();
    CuentaCorrienteJpaController ctaCteJpa = new CuentaCorrienteJpaController();

    public List<Usuario> traerUsuarios() {
        return usuJpa.findUsuarioEntities();
    }

    public void crearCliente(Cliente cliente) {
        clienteJpa.create(cliente);
    }

    public void crearUsuario(Usuario usu) {
        usuJpa.create(usu);
    }

    public List<Cliente> traerClientes() {
        return clienteJpa.findClienteEntities();
    }

    public Cliente traerCliente(int id_cliente) {
        return clienteJpa.findCliente(id_cliente);
    }

    public void editarCliente(Cliente c) {
        try {
            clienteJpa.edit(c);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarUsuario(Usuario usu) {
        try {
            usuJpa.edit(usu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void borrarCliente(int id_cliente) {
        try {
            clienteJpa.destroy(id_cliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void borrarUsuario(int id) {
        try {
            usuJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Usuario traerUsuario(int id) {
        return usuJpa.findUsuario(id);
    }

    public List<Cuenta> traerCuentas() {
        return cuentaJpa.findCuentaEntities();
    }

    public void crearCtaCte(CuentaCorriente cc) {
        ctaCteJpa.create(cc);
    }

    public void crearCajaAhorro(CajaAhorro ca) {
        cajaAhJpa.create(ca);
    }

    public CuentaCorriente traerCuentaCte(int id_cuenta) {
        return ctaCteJpa.findCuentaCorriente(id_cuenta);        
    }

    public void borrarCuentaCte(int id) {
        try {
            ctaCteJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public CajaAhorro traerCajaAhorro(int id_cuenta) {
        return cajaAhJpa.findCajaAhorro(id_cuenta);
    }

    public void borrarCajaAhorro(int id) {
        try {
            cajaAhJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public CuentaCorriente traerCtaCte(int id_cue) {
        return ctaCteJpa.findCuentaCorriente(id_cue);
    }

    public void transferir(Transferencia t) {
        transfJpa.create(t);
    }

    public void modificarCuenta(Cuenta cuenta) {
        try {
            cuentaJpa.edit(cuenta);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Transferencia> traerTransferencias() {
        return transfJpa.findTransferenciaEntities();
    }

    public Cuenta traerCuenta(int id_cuenta) {
        return cuentaJpa.findCuenta(id_cuenta);
    }

    public void editarAlias(Cuenta cuenta) {
        try {
            cuentaJpa.edit(cuenta);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Tarjeta> traerTarjetas() {
        return tarjetaJpa.findTarjetaEntities();
    }

    public void crearTarjeta(Tarjeta t) {
        tarjetaJpa.create(t);
    }

    public void borrarTarjeta(int id_tarjeta) {
        try {
            tarjetaJpa.destroy(id_tarjeta);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Tarjeta traerTarjetas(int id_tarjeta) {
        return tarjetaJpa.findTarjeta(id_tarjeta);
    }

    public void editarTarjeta(Tarjeta t) {
        try {
            tarjetaJpa.edit(t);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    
    
    
    
}
