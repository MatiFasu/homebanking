
package com.mycompany.homebanking.logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Tarjeta implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String tipoTarjeta;
    @ManyToOne
    @JoinColumn(name="id_tarjeta")
    private Cliente unCliente;
    private float disponible;
    private float saldoPagar;

    public Tarjeta() {
    }

    public Tarjeta(int id, String tipoTarjeta, Cliente unCliente, float disponible, float saldoPagar) {
        this.id = id;
        this.tipoTarjeta = tipoTarjeta;
        this.unCliente = unCliente;
        this.disponible = disponible;
        this.saldoPagar = saldoPagar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    public Cliente getUnCliente() {
        return unCliente;
    }

    public void setUnCliente(Cliente unCliente) {
        this.unCliente = unCliente;
    }

    public float getDisponible() {
        return disponible;
    }

    public void setDisponible(float disponible) {
        this.disponible = disponible;
    }

    public float getSaldoPagar() {
        return saldoPagar;
    }

    public void setSaldoPagar(float saldoPagar) {
        this.saldoPagar = saldoPagar;
    }

    

    
    
    
    
    
}
