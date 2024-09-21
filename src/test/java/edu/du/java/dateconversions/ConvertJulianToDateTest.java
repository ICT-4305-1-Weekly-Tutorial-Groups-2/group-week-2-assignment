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
    public void testConvertJulianToDate_1739327_is_5_1_0050() {
        var subject = new ConvertJulianToDate();
        var date = 1739327;
        var expected = LocalDate.of(50, 1, 5);

        subject.setDate(date);

        assertEquals(expected, subject.getDate());
    }

    @Test
    public void testConvertJulianToDate_2435871_is_1_2_1957() {
        var subject = new ConvertJulianToDate();
        var date = 2435871;
        var expected = LocalDate.of(1957, 2, 1);  // 1 February 1957

        subject.setDate(date);

        assertEquals(expected, subject.getDate());
    }

    @Test
    public void testConvertJulianToDate_2266076_is_15_3_1492() {
        var subject = new ConvertJulianToDate();
        var date = 2266076;
        var expected = LocalDate.of(1492, 3, 15);  // 15 March 1492

        subject.setDate(date);

        assertEquals(expected, subject.getDate());
    }

    @Test
    public void testConvertJulianToDate_2470166_is_25_12_2050() {
        var subject = new ConvertJulianToDate();
        var date = 2470166;
        var expected = LocalDate.of(2050, 12, 25);  // 25 December 2050

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