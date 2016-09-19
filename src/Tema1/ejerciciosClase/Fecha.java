/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema1.ejerciciosClase;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author matinal
 */
public class Fecha {
    public static void main(String[] args) {
    Date today = Calendar.getInstance().getTime();
    System.out.printf("Hoy es  %1$td de %1$tB, %1tY%n",today);    
    }
}
