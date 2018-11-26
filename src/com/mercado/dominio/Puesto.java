/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mercado.dominio;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Juan
 */
class Puesto {

    private int numero;
    private Estado estado;
    private List<Lectura> lecturas;
    private List<PrecioAlquiler> precios;

    public Puesto() {
    }

    public Puesto(int numero, Estado estado, List<Lectura> lecturas, List<PrecioAlquiler> precios) {
        this.numero = numero;
        this.estado = estado;
        this.lecturas = lecturas;
        this.precios = precios;
    }

    public void alquilar() {
        estado.setAlquilado(true);
    }

    public void cancelarAlquiler() {
        estado.setAlquilado(false);
    }

//    public void darBaja() {
//
//    }

    public boolean estaDisponible() {
        return estado.isDisponible();
    }

//    public boolean estaDisponibleEnFechas() {
//        return false;
//    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public List<Lectura> getLecturas() {
        return lecturas;
    }

    public void setLecturas(List<Lectura> lecturas) {
        this.lecturas = lecturas;
    }

    public List<PrecioAlquiler> getPrecios() {
        return precios;
    }

    public void setPrecios(List<PrecioAlquiler> precios) {
        this.precios = precios;
    }

    public void habilitar() {
        estado.setDisponible(true);
    }

    public void inhabilitar() {
        estado.setDisponible(false);
    }

    public String mostrarDatosPuesto() {
        if (precios.isEmpty()) {
            return "El puesto no tiene precio.";
        } else {
            PrecioAlquiler precio = precios.get(precios.size() - 1);
            return "Tipo de puesto: " + precio.getTipoPuesto().getNombre()
                    + "\nSector: " + precio.getSector().getNombre()
                    + "\nDimension: " + precio.getDimension().calcularMetroscuadrados() + " m2";
        }
    }

    public Date obtenerFechaUltimaLectura() {
        if (lecturas.isEmpty()) {
            return null;
        } else {
            return lecturas.get(lecturas.size() - 1).getFechaCaptura();
        }
    }

    public float obtenerPrecioVigente() {
        PrecioAlquiler pa = null;
        if (precios.isEmpty()) {
            return 0;
        } else {
            for (PrecioAlquiler p : precios) {
                if (p.estaVigente()) {
                    pa = p;
                }
            }
        }
        if (pa == null) {
            return 0;
        } else {
            return pa.getPrecio();
        }
    }

    public String obtenerUltimaLectura() {
        if (lecturas.isEmpty()) {
            return null;
        } else {
            return lecturas.get(lecturas.size() - 1).getLectura();
        }
    }

//    public void obtenerUltimaLecturaMedidor() {
//
//    }
}
