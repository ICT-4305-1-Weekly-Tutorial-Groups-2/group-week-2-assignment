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
    public void testConvertDateToJulian_1_2_1957_is_2435871() {
        var subject = new ConvertDateToJulian();
        var date = LocalDate.of(1957, 2, 1);
        var expected = 2435871;

        subject.setJulianDate(date);

        assertEquals(expected, subject.getJulianDate());
    }

    @Test
    public void testConvertDateToJulian_15_3_1942_is_2266076() {
        var subject = new ConvertDateToJulian();
        var date = LocalDate.of(1492, 3, 15);
        var expected = 2266076;

        subject.setJulianDate(date);

        assertEquals(expected, subject.getJulianDate());
    }

    @Test
    public void testConvertDateToJulian_25_12_2050_is_2470166() {
        var subject = new ConvertDateToJulian();
        var date = LocalDate.of(2050, 12, 25);
        var expected = 2470166;

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