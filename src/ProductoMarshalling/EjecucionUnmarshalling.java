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
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author matinal
 */
public class EjecucionUnmarshalling {
    public static void main(String[] args) {
        Productos ps = new Productos();
        try { 

            JAXBContext jaxbContext = JAXBContext.newInstance(ps.getClass());
            Unmarshaller jaxbMarshaller = jaxbContext.createUnmarshaller();
            
            ps =  (Productos) jaxbMarshaller.unmarshal(new File("productos.xml"));
            for (Producto p : ps.getProducto()){
                System.out.println(p.getNombre());
            }
        } catch (JAXBException ex) {
            Logger.getLogger(EjecucionMarshalling.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
