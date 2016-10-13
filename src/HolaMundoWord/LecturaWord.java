/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HolaMundoWord;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

/**
 *
 * @author matinal
 */
public class LecturaWord {
    public static void main(String[] args) {
        try {
            FileInputStream in = new FileInputStream("hola_mundo.docx");
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LecturaWord.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
