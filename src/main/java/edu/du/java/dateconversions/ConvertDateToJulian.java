
package edu.du.java.dateconversions;

import java.time.LocalDate;

public class ConvertDateToJulian {
    
    private LocalDate date ; 
    private int julianDate ;
    private boolean isDateSet = false ;
    
    public ConvertDateToJulian() {
    
    }
    
    public void setJulianDate(LocalDate date) {
        
        this.date = date ;
        setIsDateSet();
        
        if( this.isDateSet ) {
        
            int month = this.date.getMonthValue();
            int year = this.date.getYear();
            int day = this.date.getDayOfMonth();

            this.julianDate = (1461 * (year + 4800 + (month - 14) / 12)) / 4
                       + (367 * (month - 2 - 12 * ((month - 14) / 12))) / 12
                       - (3 * ((year + 4900 + (month - 14) / 12) / 100)) / 4
                       + day 
                       - 32075;
        
        }
        
    }
    
    public int getJulianDate() {
        
        return this.julianDate;
        
    }
    
    private void setIsDateSet(){
        this.isDateSet = this.date != null;
    }
    
    @Override
    public String toString() {
        
        String msg ;
        
        if( this.isDateSet ) {
            msg = "Date: " + this.date + "\n" +
               "Julian value: " + this.julianDate;
        } else {
            msg = "Date not set!";
            
        }
        
        return msg ;
    }
        
}
