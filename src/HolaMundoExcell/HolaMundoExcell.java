/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HolaMundoExcell;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.streaming.*;
/**
 *
 * @author matinal
 */
public class HolaMundoExcell {
    public static void main(String[] args) {
    SXSSFWorkbook wb = new SXSSFWorkbook(50);
    Sheet sh = wb.createSheet("HOLA MUNDO");
    char fila = 'A';
        for (int i = 0; i < 25; i++) {
            Row row = sh.createRow(i);
            fila='A';
            for (int j = 0; j < 10; j++) {
                Cell cell = row.createCell(j);
                cell.setCellValue(fila+""+(i+1));
                fila++;
            }            
        }
        try {
            FileOutputStream out = new FileOutputStream(new File("hola_mundo.xlsx"));
            wb.write(out);
            out.close();
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(HolaMundoExcell.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error "+ex.getLocalizedMessage());
        } catch (IOException ex) {
            System.out.println("Error "+ ex.getLocalizedMessage());
        }finally{
            wb.dispose();
        }
    }
}
