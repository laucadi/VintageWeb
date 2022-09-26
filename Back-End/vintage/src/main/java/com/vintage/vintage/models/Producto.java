package com.vintage.vintage.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Producto {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idProducto;
    public String nombreProducto;
    public String descripcionProducto;
    public String imagenProducto;

    //Constructores


    public Producto() {
    }

    public Producto(String nombreProducto, String descripcionProducto, String imagenProducto) {
        this.idProducto = null;
        this.nombreProducto = nombreProducto;
        this.descripcionProducto = descripcionProducto;
        this.imagenProducto = imagenProducto;
    }

    //Getters and setters
    public Long getIdProducto() {
        return idProducto;
    }
    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }
    public String getNombreProducto() {
        return nombreProducto;
    }
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    public String getDescripcionProducto() {
        return descripcionProducto;
    }
    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }
    public String getImagenProducto() {
        return imagenProducto;
    }
    public void setImagenProducto(String imagenProducto) {
        this.imagenProducto = imagenProducto;
    }

    //To-String
}
