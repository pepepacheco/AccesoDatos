/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProductoMarshalling;

import javax.xml.bind.annotation.*;

/**
 *
 * @author matinal
 */
@XmlRootElement(name = "producto")
@XmlAccessorType(XmlAccessType.FIELD)
public class Producto {
    @XmlAttribute
    private int id;
    @XmlElement
    private String nombre;
    @XmlElement
    private String categoria;
    @XmlElement
    private String descripcion;
    @XmlElement
    private double precio;
    @XmlElement
    private String unidadMedida;
    @XmlElement
    private double unidadPrecio;

    public Producto() {
    }
    
    public Producto(int id, String nombre, String categoria, String descripcion, double precio, String unidadMedida, double unidadPrecio) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.precio = precio;
        this.unidadMedida = unidadMedida;
        this.unidadPrecio = unidadPrecio;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public double getUnidadPrecio() {
        return unidadPrecio;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public void setUnidadPrecio(double unidadPrecio) {
        this.unidadPrecio = unidadPrecio;
    }
    
}
