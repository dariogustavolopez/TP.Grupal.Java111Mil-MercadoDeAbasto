/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mercado.dominio;

/**
 *
 * @author Juan
 */
class Dimension {

    private float ancho;
    private float largo;
    private String nombre;

    public Dimension() {
    }

    public Dimension(float ancho, float largo, String nombre) {
        this.ancho = ancho;
        this.largo = largo;
        this.nombre = nombre;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float calcularMetroscuadrados() {
        return largo * ancho;
    }
}
