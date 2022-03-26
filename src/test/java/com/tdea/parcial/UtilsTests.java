package com.tdea.parcial;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class UtilsTests {

    @Test
    public void horaDiaTransformarTextoNight() {
        int hora = 4;

        String result = Utils.getTimeOfDay(hora);
        assertEquals("Night", result);
    }

    @Test
    public void horaDiaTransformarTextoMorning() {
        int hora = 8;

        String result = Utils.getTimeOfDay(hora);
        assertEquals("Morning", result);
    }

    @Test
    public void horaDiaTransformarTextoAfternon() {
        int hora = 16;

        String result = Utils.getTimeOfDay(hora);
        assertEquals("Afternoon", result);
    }

    @Test
    public void horaDiaTransformarTextoEvening() {
        int hora = 22;

        String result = Utils.getTimeOfDay(hora);
        assertEquals("Evening", result);
    }

    @Test
    public void horaDiaTransformarTextoInvalido() {
        int hora = 28;

        boolean result = Utils.isValidHour(hora);
        assertFalse(result);
    }

}