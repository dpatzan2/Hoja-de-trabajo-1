package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void encenderRadio() {
        Radio radio = new Radio();
        assertFalse(radio.getEstadoRadio());

        radio.encenderRadio();
        assertTrue(radio.getEstadoRadio());
    }

    @Test
    void apagarRadio() {
        Radio radio = new Radio();
        radio.encenderRadio();

        assertTrue(radio.getEstadoRadio());

        radio.apagarRadio();
        assertFalse(radio.getEstadoRadio());
    }


    @Test
    void cambiarTipoRadio() {
        Radio radio = new Radio();
        assertFalse(radio.isTipoRadio());
        radio.encenderRadio();
        radio.cambiarTipoRadio();
        assertTrue(radio.isTipoRadio());
    }

    @Test
    void cambiarFrecuencia() {
        Radio radio = new Radio();
        radio.encenderRadio();

        double frecuenciaInicial = radio.getFrecuencia();
        radio.cambiarFrecuencia(1);

        assertTrue(radio.getFrecuencia() > frecuenciaInicial);
    }

    @org.junit.jupiter.api.Test
    void estaciones() {
    }

    @org.junit.jupiter.api.Test
    void guardarEstacion() {
    }

    @org.junit.jupiter.api.Test
    void seleccionarEstacion() {
    }

    @Test
    void getEstadoRadio() {
        Radio radio = new Radio();
        assertFalse(radio.getEstadoRadio());

        radio.encenderRadio();
        assertTrue(radio.getEstadoRadio());
    }


    @Test
    void isTipoRadio() {
        Radio radio = new Radio();
        assertFalse(radio.isTipoRadio());

        radio.cambiarTipoRadio();
        assertTrue(radio.isTipoRadio());
    }

    @Test
    void getFrecuencia() {
        Radio radio = new Radio();
        double frecuenciaInicial = radio.getFrecuencia();
        radio.encenderRadio();
        radio.cambiarFrecuencia(1);
        assertTrue(radio.getFrecuencia() > frecuenciaInicial);
    }
}