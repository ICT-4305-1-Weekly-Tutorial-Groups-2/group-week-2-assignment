package edu.du.java.dateconversions;


import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class ConvertDateToJulianTest {

    /**
     * Test cases:
     * 5 Jan 0050 = 1739327 -- done
     * 1 Feb 1957 = 2435871
     * 15 March 1492 = 2266076
     * 25 December 2050 = 2470166
     */

    @Test
    public void testConvertDateToJulian_5_1_0050_is_1739327() {
        var subject = new ConvertDateToJulian();
        var date = LocalDate.of(50, 1, 5);
        var expected = 1739327;

        subject.setJulianDate(date);

        assertEquals(expected, subject.getJulianDate());
    }

    @Test
    public void testToStringWithNoDate() {
        var subject = new ConvertDateToJulian();
        var expected = "Date not set!";

        assertEquals(expected, subject.toString());
    }

}