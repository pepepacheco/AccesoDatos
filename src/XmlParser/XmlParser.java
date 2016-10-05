/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XmlParser;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/**
 *
 * @author matinal
 */
public class XmlParser {
    public static void main(String[] args) {
        Document doc = null;
            try {
                doc = DomUtil.parse("productos.xml", false);  
                RecursiveWalker raiz = new RecursiveWalker(doc);
                System.out.println(raiz.toString());
            } catch (ParserConfigurationException | IOException | SAXException ex) {
                System.err.println("ERROR : " + ex.getLocalizedMessage());
            }
            
            
        
    }
}
