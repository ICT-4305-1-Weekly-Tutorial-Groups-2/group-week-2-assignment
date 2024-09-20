package edu.du.java.dateconversions;


import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class ConvertJulianToDateTest {
    /**
     * Test cases:
     * 5 Jan 0050 = 1739327 -- done
     * 1 Feb 1957 = 2435871
     * 15 March 1492 = 2266076
     * 25 December 2050 = 2470166
     */

    @Test
    public void testConvertDateToJulian_1739327_is_5_1_0050() {
        var subject = new ConvertJulianToDate();
        var date = 1739327;
        var expected = LocalDate.of(50, 1, 5);

        subject.setDate(date);

        assertEquals(expected, subject.getDate());
    }

    @Test
    public void toStringWithNoDate() {
        var subject = new ConvertJulianToDate();
        var expected = "No julian value entered!";

        assertEquals(expected, subject.toString());
    }
}