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
class Sesion {
    private Date fechaFin;
    private Date fechaInicio;
    private Date horaFin;
    private Date horaInicio;
    private Empleado empleado;

    public Sesion() {
    }

    public Sesion(Date fechaFin, Date fechaInicio, Date horaFin, Date horaInicio, Empleado empleado) {
        this.fechaFin = fechaFin;
        this.fechaInicio = fechaInicio;
        this.horaFin = horaFin;
        this.horaInicio = horaInicio;
        this.empleado = empleado;
    }
    
    private boolean estaAbierto(){
        return false;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Date horaFin) {
        this.horaFin = horaFin;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    
    
}
