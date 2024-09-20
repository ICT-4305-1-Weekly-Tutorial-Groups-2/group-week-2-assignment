
package edu.du.java.dateconversions;


import java.time.LocalDate;

public class ConvertJulianToDate {

    private int julianValue ;
    private LocalDate date ;
    private boolean isJulianValueSet = false ;
    
    public ConvertJulianToDate() {
        
    }
    
    
    public void setDate(int julianValue) {
        
        int l,n,i,j;
        int month;
        int year;
        int day;
        
        this.julianValue = julianValue ;
        setIsJulianValueSet();
        
        if( this.isJulianValueSet ) {
        
            l = this.julianValue + 68569;
            n = ( 4 * l ) / 146097 ;
            l = l - ( 146097 * n + 3 ) / 4 ;
            i = ( 4000 * ( l + 1 ) ) / 1461001 ;
            l = l - ( 1461 * i ) / 4 + 31 ;
            j = ( 80 * l ) / 2447 ;
            day = l - ( 2447 * j ) / 80 ;
            l = j / 11 ;
            month = j + 2 - ( 12 * l ) ;
            year = 100 * ( n - 49 ) + i + l ;

            this.date = LocalDate.of(year, month, day); 
        }
    }
    
    public LocalDate getDate () {
        return this.date;
    }
    
    private void setIsJulianValueSet(){

        this.isJulianValueSet = this.julianValue > 0;
       
    }
    
    @Override
    public String toString() {
        
        String msg ;
        
        if( this.isJulianValueSet ) {
            msg = "Date: " + this.date + "\n" +
               "Julian value: " + this.julianValue;
        } else {
            msg = "No julian value entered!" ;
        }
        
        return msg ;
    }
    
}
