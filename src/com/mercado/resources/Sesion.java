package com.mercado.resources;
// Generated 29-nov-2018 14:58:44 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Sesion generated by hbm2java
 */
public class Sesion  implements java.io.Serializable {


     private int idSesion;
     private Empleado empleado;
     private Date fechaHoraInicio;
     private Date fechaHoraFin;
     private Set contratos = new HashSet(0);

    public Sesion() {
    }

	
    public Sesion(int idSesion, Empleado empleado) {
        this.idSesion = idSesion;
        this.empleado = empleado;
    }
    public Sesion(int idSesion, Empleado empleado, Date fechaHoraInicio, Date fechaHoraFin, Set contratos) {
       this.idSesion = idSesion;
       this.empleado = empleado;
       this.fechaHoraInicio = fechaHoraInicio;
       this.fechaHoraFin = fechaHoraFin;
       this.contratos = contratos;
    }
   
    public int getIdSesion() {
        return this.idSesion;
    }
    
    public void setIdSesion(int idSesion) {
        this.idSesion = idSesion;
    }
    public Empleado getEmpleado() {
        return this.empleado;
    }
    
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    public Date getFechaHoraInicio() {
        return this.fechaHoraInicio;
    }
    
    public void setFechaHoraInicio(Date fechaHoraInicio) {
        this.fechaHoraInicio = fechaHoraInicio;
    }
    public Date getFechaHoraFin() {
        return this.fechaHoraFin;
    }
    
    public void setFechaHoraFin(Date fechaHoraFin) {
        this.fechaHoraFin = fechaHoraFin;
    }
    public Set getContratos() {
        return this.contratos;
    }
    
    public void setContratos(Set contratos) {
        this.contratos = contratos;
    }




}


