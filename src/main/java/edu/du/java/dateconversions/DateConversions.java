/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package edu.du.java.dateconversions;
import java.time.LocalDate ;
import java.time.Month;


public class DateConversions {

    public static void main(String[] args) {
        
        //LocalDate date = null; 
        LocalDate date = LocalDate.of(2024, 8, 1) ;
        
        ConvertDateToJulian dt = new ConvertDateToJulian() ;
        
        dt.setJulianDate(date);
        
        System.out.println( dt.toString() );
        
        
        ConvertJulianToDate julianDt = new ConvertJulianToDate();
        //int julianValue = 2435871;
        int julianValue = 2435871;
        
        julianDt.setDate(julianValue);
        System.out.println( julianDt.toString());
        
    }
}
