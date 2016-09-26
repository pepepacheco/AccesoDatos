/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProductoMarshalling;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 *
 * @author matinal
 */
@XmlRootElement(name = "productos")
@XmlAccessorType(XmlAccessType.FIELD)
public class Productos {
    @XmlElement(name = "producto")
    List<Producto> productos;

     public Productos() {
         this.productos = new ArrayList();
    }
     
    public Productos(List<Producto> producto) {
        this.productos = producto;
    }

    public List<Producto> getProducto() {
        return productos;
    }

    public void setProducto(List<Producto> producto) {
        this.productos = producto;
    }
    
    public void addProducto (Producto p){
        this.productos.add(p);
    }
    
}
