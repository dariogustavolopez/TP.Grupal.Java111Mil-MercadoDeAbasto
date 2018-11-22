/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mercado.dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Juan
 */
public class Cliente {

    private String cuit;
    private String domicilio;
    private String razonSocial;
    private List<Contrato> contratos;

    public Cliente() {
    }

    public Cliente(String cuit, String domicilio, String razonSocial) {
        this.cuit = cuit;
        this.domicilio = domicilio;
        this.razonSocial = razonSocial;
        contratos = new ArrayList();
    }

    public Contrato crearContrato(Date fechaCancelacion, Date fechaFinContrato,
            Date fechaInicioContrato, float montoMensual, int numero, Sesion registro,
            Empleado responsableMercado, Puesto puesto, Lectura ultimaLecturaMedidor) {
        Contrato c = new Contrato(fechaCancelacion, fechaFinContrato, fechaInicioContrato,
                montoMensual, numero, registro, responsableMercado, puesto, ultimaLecturaMedidor);
        contratos.add(c);
        return c;
    }

    public List<Contrato> cuantosContratosPeriodo(Date desde, Date hasta) {
        return null;
    }

    public int cuantosPuestosAlquila() {
        return contratos.size();
    }

    public boolean existeCliente() {
        return false;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public List<Integer> quePuestosAlquila() {
        List<Integer> puestos = new ArrayList();
        for (Contrato c : contratos) {
            puestos.add(c.getPuesto().getNumero());
        }
        return puestos;
    }

    public boolean tieneContratoVigente() {
        return false;
    }
}
