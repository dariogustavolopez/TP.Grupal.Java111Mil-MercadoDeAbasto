/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mercado.dominio;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Juan
 */
class Contrato {

    private Date fechaCancelacion;
    private Date fechaFinContrato;
    private Date fechaInicioContrato;
    private float montoMensual;
    private int numero;
    private Sesion registro;
    private Empleado responsableMercado;
    private Puesto puesto;
    private Lectura ultimaLecturaMedidor;

    public Contrato() {
    }

    public Contrato(Date fechaCancelacion, Date fechafinContrato, Date fechaInicioContrato, float montoMensual, int numero, Sesion registro, Empleado responsableMercado, Puesto puesto, Lectura ultimaLecturaMedidor) {
        this.fechaCancelacion = fechaCancelacion;
        this.fechaFinContrato = fechafinContrato;
        this.fechaInicioContrato = fechaInicioContrato;
        this.montoMensual = montoMensual;
        this.numero = numero;
        this.registro = registro;
        this.responsableMercado = responsableMercado;
        this.puesto = puesto;
        this.ultimaLecturaMedidor = ultimaLecturaMedidor;
    }

    public float calcularMontoTotalContrato() {
        return puesto.obtenerPrecioVigente();
    }

    public void cancelar() {
        fechaCancelacion = Calendar.getInstance().getTime();
    }

//    public boolean estaPuestoEnPeriodo() {
//        return false;
//    }

    public boolean estaVigente() {
         if (fechaCancelacion != null && fechaCancelacion.before(fechaFinContrato)) {
                if (fechaCancelacion.after(Calendar.getInstance().getTime())) {
                    return true;
                }
            } else {
                if (fechaFinContrato.after(Calendar.getInstance().getTime())) {
                    return true;
                }
            }
         return false;
    }

//    public Date obtenerFechaRegistro() {
//        return null;
//    }

    public Date getFechaCancelacion() {
        return fechaCancelacion;
    }

    public void setFechaCancelacion(Date fechaCancelacion) {
        this.fechaCancelacion = fechaCancelacion;
    }

    public Date getFechaFinContrato() {
        return fechaFinContrato;
    }

    public void setFechaFinContrato(Date fechaFinContrato) {
        this.fechaFinContrato = fechaFinContrato;
    }

    public Date getFechaInicioContrato() {
        return fechaInicioContrato;
    }

    public void setFechaInicioContrato(Date fechaInicioContrato) {
        this.fechaInicioContrato = fechaInicioContrato;
    }

    public float getMontoMensual() {
        return montoMensual;
    }

    public void setMontoMensual(float montoMensual) {
        this.montoMensual = montoMensual;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Sesion getRegistro() {
        return registro;
    }

    public void setRegistro(Sesion registro) {
        this.registro = registro;
    }

    public Empleado getResponsableMercado() {
        return responsableMercado;
    }

    public void setResponsableMercado(Empleado responsableMercado) {
        this.responsableMercado = responsableMercado;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    public Lectura getUltimaLecturaMedidor() {
        return ultimaLecturaMedidor;
    }

    public void setUltimaLecturaMedidor(Lectura ultimaLecturaMedidor) {
        this.ultimaLecturaMedidor = ultimaLecturaMedidor;
    }
}
