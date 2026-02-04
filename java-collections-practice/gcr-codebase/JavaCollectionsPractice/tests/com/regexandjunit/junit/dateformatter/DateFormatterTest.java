package com.regexandjunit.junit.dateformatter;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DateFormatterTest {

    @Test
    void testValidDateFormat() {
        DateFormatter formatter = new DateFormatter();
        assertEquals("15-02-2024", formatter.formatDate("2024-02-15"));
    }

    @Test
    void testInvalidDateFormat() {
        DateFormatter formatter = new DateFormatter();

        assertThrows(IllegalArgumentException.class, () -> {
            formatter.formatDate("15/02/2024");
        });
    }

    @Test
    void testInvalidDateValue() {
        DateFormatter formatter = new DateFormatter();

        assertThrows(IllegalArgumentException.class, () -> {
            formatter.formatDate("2024-13-40");
        });
    }
}
