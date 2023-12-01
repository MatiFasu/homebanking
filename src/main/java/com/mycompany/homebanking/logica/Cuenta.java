
package com.mycompany.homebanking.logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Cuenta implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String cbu;
    private String alias;
    private float saldo;
    @ManyToOne
    @JoinColumn(name="id_cuenta")
    private Cliente unCliente2;
    @OneToMany(mappedBy = "cuentaOrigen")
    private List<Transferencia> transferencias;
    
    public Cuenta() {
    }

    public Cuenta(int id, String cbu, String alias, float saldo, Cliente unCliente, List<Transferencia> transferencias) {
        this.id = id;
        this.cbu = cbu;
        this.alias = alias;
        this.saldo = saldo;
        this.unCliente2 = unCliente;
        this.transferencias = transferencias;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCbu() {
        return cbu;
    }

    public void setCbu(String cbu) {
        this.cbu = cbu;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Cliente getUnCliente() {
        return unCliente2;
    }

    public void setUnCliente(Cliente unCliente) {
        this.unCliente2 = unCliente;
    }

    public List<Transferencia> getTransferencias() {
        return transferencias;
    }

    public void setTransferencias(List<Transferencia> transferencias) {
        this.transferencias = transferencias;
    }
    
    
    
    
    
}
