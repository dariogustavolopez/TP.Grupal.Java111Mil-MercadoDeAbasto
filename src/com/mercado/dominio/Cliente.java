/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mercado.dominio;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Juan
 */
public class Cliente implements Comparable<Cliente> {

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
        List<Contrato> periodo = new ArrayList();
        for (Contrato c : contratos) {
            if (c.getFechaCancelacion() != null && c.getFechaCancelacion().before(c.getFechaFinContrato())) {
                if (c.getFechaCancelacion().after(desde) && c.getFechaCancelacion().before(hasta)) {
                    periodo.add(c);
                }
            } else {
                if (c.getFechaFinContrato().after(desde) && c.getFechaFinContrato().before(hasta)) {
                    periodo.add(c);
                }
            }
        }
        return periodo;
    }

    public int cuantosPuestosAlquila() {
        return contratos.size();
    }

    public boolean existeCliente(Cliente c) {
        return this.equals(c);
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
        boolean aviso = false;
        for (Contrato c : contratos) {
            if (c.estaVigente()) {
                aviso = true;
            }
        }
        return aviso;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.cuit, other.cuit)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Cliente o) {
        return cuit.compareTo(o.cuit);
    }
}
