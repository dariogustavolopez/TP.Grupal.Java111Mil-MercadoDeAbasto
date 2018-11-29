package com.mercado.resources;
// Generated 29-nov-2018 14:41:32 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Dimension generated by hbm2java
 */
public class Dimension  implements java.io.Serializable {


     private int idDimension;
     private double ancho;
     private Double largo;
     private String nombre;
     private Set precioalquilers = new HashSet(0);

    public Dimension() {
    }

	
    public Dimension(int idDimension, double ancho) {
        this.idDimension = idDimension;
        this.ancho = ancho;
    }
    public Dimension(int idDimension, double ancho, Double largo, String nombre, Set precioalquilers) {
       this.idDimension = idDimension;
       this.ancho = ancho;
       this.largo = largo;
       this.nombre = nombre;
       this.precioalquilers = precioalquilers;
    }
   
    public int getIdDimension() {
        return this.idDimension;
    }
    
    public void setIdDimension(int idDimension) {
        this.idDimension = idDimension;
    }
    public double getAncho() {
        return this.ancho;
    }
    
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
    public Double getLargo() {
        return this.largo;
    }
    
    public void setLargo(Double largo) {
        this.largo = largo;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set getPrecioalquilers() {
        return this.precioalquilers;
    }
    
    public void setPrecioalquilers(Set precioalquilers) {
        this.precioalquilers = precioalquilers;
    }




}


