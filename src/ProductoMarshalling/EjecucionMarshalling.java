/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProductoMarshalling;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author matinal
 */
public class EjecucionMarshalling {
    public static void main(String[] args) {
        Producto p;
        Productos ps;
        
        p = new Producto(0, "nombre", "categoria", "descripcion", 0, "unidadMedida", 0);
        ps = new Productos();
        ps.addProducto(p);
        
        p = new Producto(1, "nombre1", "categoria1", "descripcion1", 1, "unidadMedida1", 1);
        ps.addProducto(p);
        try { 

            JAXBContext jaxbContext = JAXBContext.newInstance(ps.getClass());
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(ps, new File("productos.xml"));
        } catch (JAXBException ex) {
            Logger.getLogger(EjecucionMarshalling.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
