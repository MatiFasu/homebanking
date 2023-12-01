
package com.mycompany.homebanking.logica;

import java.util.List;
import javax.persistence.Entity;

@Entity
public class CuentaCorriente extends Cuenta
{

    private float comisionMensual;
    
    public CuentaCorriente() {
    }

    public CuentaCorriente(int id, String cbu, String alias, float saldo, Cliente unCliente, List<Transferencia> transferencias
    , float comisionMensual) {
        super(id, cbu, alias, saldo, unCliente, transferencias);
        this.comisionMensual = comisionMensual;
    }

    public float getComisionMensual() {
        return comisionMensual;
    }

    public void setComisionMensual(float comisionMensual) {
        this.comisionMensual = comisionMensual;
    }
    
    
    
    
    
}
