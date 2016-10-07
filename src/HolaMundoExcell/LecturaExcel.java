/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HolaMundoExcell;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.streaming.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/**
 *
 * @author matinal
 */
public class LecturaExcel {
    public static void main(String[] args) {
        FileInputStream in;
        XSSFWorkbook wb;
        Sheet sh;
        Row row;
        Cell cell;
        try {
            in = new FileInputStream("lecturaExcel.xlsx");
            wb = new XSSFWorkbook(in);
            //Bucle para las hojas
            for (int i = 0; i < wb.getNumberOfSheets(); i++) {
                sh = wb.getSheetAt(i);
                System.out.print("\n##Hoja: " + sh.getSheetName());
                //Bucle para las filas
                for (int j = 0; j <= sh.getLastRowNum(); j++) {
                    row = sh.getRow(j);
                    System.out.print("\n");
                    //Bucle para las celdas
                    for (int k = 0; k < row.getLastCellNum(); k++) {
                        cell = row.getCell(k);
                        System.out.print(cell.getAddress().formatAsString() + "=" + cell+" ");
                    }
                }
            }
            in.close();
        } catch (IOException ex) {
            Logger.getLogger(LecturaExcel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
