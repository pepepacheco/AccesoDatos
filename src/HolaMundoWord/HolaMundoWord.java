/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HolaMundoWord;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.util.Units;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

/**
 *
 * @author matinal
 */
public class HolaMundoWord {
    private XWPFDocument documento;

    public HolaMundoWord() {
        this.documento =  new XWPFDocument();
    }
    
    
    private void testDoc(){
        XWPFParagraph p1 = documento.createParagraph();
        for (int i = 0; i < 10; i++) {
        XWPFRun r1 = p1.createRun();
        r1.setText("Hola Mundo Word \n");               
        }
        XWPFRun r2 = p1.createRun();
        /*XWPFTable tabla = documento.createTable(10,10);
        for (int i = 0; i < 10; i++) {
            XWPFTableRow fila = tabla.createRow();
            for (int j = 0; j < 10; j++) {
                XWPFTableCell celda = fila.createCell();
            }
        }*/
        
        try {
            r2.addPicture(new FileInputStream(new File("logo.png")), XWPFDocument.PICTURE_TYPE_PNG, "logo.png", Units.toEMU(200),Units.toEMU(200) );
            FileOutputStream out = new FileOutputStream(new File("hola_mundo.docx"));
            documento.write(out);
            out.close();
            }catch (IOException ex) {
            Logger.getLogger(HolaMundoWord.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidFormatException ex) {
            Logger.getLogger(HolaMundoWord.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) {
        HolaMundoWord documento = new HolaMundoWord();
        documento.testDoc();
    }
}
