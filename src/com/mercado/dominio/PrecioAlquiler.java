/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mercado.dominio;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Juan
 */
class PrecioAlquiler {

    private Date fechaVigencia;
    private float precio;
    private TipoPuesto tipoPuesto;
    private Sector sector;
    private Dimension dimension;

    public PrecioAlquiler() {
    }

    public PrecioAlquiler(Date fechaVigencia, float precio, TipoPuesto tipoPuesto, Sector sector, Dimension dimension) {
        this.fechaVigencia = fechaVigencia;
        this.precio = precio;
        this.tipoPuesto = tipoPuesto;
        this.sector = sector;
        this.dimension = dimension;
    }

    public boolean estaVigente() {
        return Calendar.getInstance().getTime().before(fechaVigencia);
    }

    public Date getFechaVigencia() {
        return fechaVigencia;
    }

    public void setFechaVigencia(Date fechaVigencia) {
        this.fechaVigencia = fechaVigencia;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public TipoPuesto getTipoPuesto() {
        return tipoPuesto;
    }

    public void setTipoPuesto(TipoPuesto tipoPuesto) {
        this.tipoPuesto = tipoPuesto;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }
}
