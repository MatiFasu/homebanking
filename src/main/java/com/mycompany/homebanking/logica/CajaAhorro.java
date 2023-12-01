
package com.mycompany.homebanking.logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;

@Entity
public class CajaAhorro extends Cuenta implements Serializable{
    

    public CajaAhorro() {
    }

    public CajaAhorro(int id, String cbu, String alias, float saldo, Cliente unCliente, List<Transferencia> transferencias) {
        super(id, cbu, alias, saldo, unCliente, transferencias);
    }
    
    
}
