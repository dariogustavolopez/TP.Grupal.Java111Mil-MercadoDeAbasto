/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mercado.dominio;

import java.util.Date;

/**
 *
 * @author Juan
 */
class Lectura {

    private Date fechaCaptura;
    private String lectura;

    public Lectura() {
    }

    public Lectura(Date fechaCaptura, String lectura) {
        this.fechaCaptura = fechaCaptura;
        this.lectura = lectura;
    }

    public Date getFechaCaptura() {
        return fechaCaptura;
    }

    public void setFechaCaptura(Date fechaCaptura) {
        this.fechaCaptura = fechaCaptura;
    }

    public String getLectura() {
        return lectura;
    }

    public void setLectura(String lectura) {
        this.lectura = lectura;
    }
}
