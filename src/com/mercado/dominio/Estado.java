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
class Estado {

    private boolean alquilado;
    private boolean disponible;

    public Estado() {
    }

    public Estado(boolean alquilado, boolean disponible) {
        this.alquilado = alquilado;
        this.disponible = disponible;
    }

    public boolean isAlquilado() {
        return alquilado;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

}
