package com.mercado.resources;
// Generated 27-nov-2018 15:59:57 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Contrato generated by hbm2java
 */
public class Contrato  implements java.io.Serializable {


     private int numero;
     private Cliente cliente;
     private Empleado empleado;
     private Sesion sesion;
     private BigDecimal montoMensual;
     private Date fechaInicioContrato;
     private Date fechaFinContrato;
     private Date fechaCancelacion;
     private Set lecturas = new HashSet(0);

    public Contrato() {
    }

	
    public Contrato(int numero, Cliente cliente, Empleado empleado, Sesion sesion) {
        this.numero = numero;
        this.cliente = cliente;
        this.empleado = empleado;
        this.sesion = sesion;
    }
    public Contrato(int numero, Cliente cliente, Empleado empleado, Sesion sesion, BigDecimal montoMensual, Date fechaInicioContrato, Date fechaFinContrato, Date fechaCancelacion, Set lecturas) {
       this.numero = numero;
       this.cliente = cliente;
       this.empleado = empleado;
       this.sesion = sesion;
       this.montoMensual = montoMensual;
       this.fechaInicioContrato = fechaInicioContrato;
       this.fechaFinContrato = fechaFinContrato;
       this.fechaCancelacion = fechaCancelacion;
       this.lecturas = lecturas;
    }
   
    public int getNumero() {
        return this.numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Empleado getEmpleado() {
        return this.empleado;
    }
    
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    public Sesion getSesion() {
        return this.sesion;
    }
    
    public void setSesion(Sesion sesion) {
        this.sesion = sesion;
    }
    public BigDecimal getMontoMensual() {
        return this.montoMensual;
    }
    
    public void setMontoMensual(BigDecimal montoMensual) {
        this.montoMensual = montoMensual;
    }
    public Date getFechaInicioContrato() {
        return this.fechaInicioContrato;
    }
    
    public void setFechaInicioContrato(Date fechaInicioContrato) {
        this.fechaInicioContrato = fechaInicioContrato;
    }
    public Date getFechaFinContrato() {
        return this.fechaFinContrato;
    }
    
    public void setFechaFinContrato(Date fechaFinContrato) {
        this.fechaFinContrato = fechaFinContrato;
    }
    public Date getFechaCancelacion() {
        return this.fechaCancelacion;
    }
    
    public void setFechaCancelacion(Date fechaCancelacion) {
        this.fechaCancelacion = fechaCancelacion;
    }
    public Set getLecturas() {
        return this.lecturas;
    }
    
    public void setLecturas(Set lecturas) {
        this.lecturas = lecturas;
    }




}


