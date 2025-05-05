package io.github.unlp_oo.OO2_7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

	private Calculadora c;
	
    @BeforeEach
    public void setUp() {
        c = new Calculadora();
    }

    @Test
    public void testEstadoInicial() {
        assertEquals("0.0", c.getResultado());
        c.setValor(42.5);
        assertEquals("42.5", c.getResultado());
    }

    @Test
    public void testSumaCorrecta() {
        c.setValor(10);
        c.mas();
        c.setValor(5);
        assertEquals("15.0", c.getResultado());
    }

    @Test
    public void testRestaCorrecta() {
        c.setValor(10);
        c.menos();
        c.setValor(3);
        assertEquals("7.0", c.getResultado());
    }

    @Test
    public void testMultiplicacionCorrecta() {
        c.setValor(4);
        c.por();
        c.setValor(5);
        assertEquals("20.0", c.getResultado());
    }

    @Test
    public void testDivisionCorrecta() {
        c.setValor(15);
        c.dividido();
        c.setValor(3);
        assertEquals("5.0", c.getResultado());
    }

    @Test
    public void testDivisionPorCero() {
        c.setValor(10);
        c.dividido();
        c.setValor(0);
        assertEquals("Error", c.getResultado());
    }

    @Test
    public void testOperacionIncompletaSuma() {
        c.setValor(10);
        c.mas();
        assertEquals("Error", c.getResultado());
    }

    @Test
    public void testOperacionIncompletaResta() {
        c.setValor(10);
        c.menos();
        assertEquals("Error", c.getResultado());
    }

    @Test
    public void testOperacionIncompletaMultiplicacion() {
        c.setValor(10);
        c.por();
        assertEquals("Error", c.getResultado());
    }

    @Test
    public void testOperacionIncompletaDivision() {
        c.setValor(10);
        c.dividido();
        assertEquals("Error", c.getResultado());
    }

    @Test
    public void testMensajeNoPermitidoEnSumando() {
        c.setValor(10);
        c.mas();
        c.menos(); // Mensaje no permitido
        assertEquals("Error", c.getResultado());
    }

    @Test
    public void testMensajeNoPermitidoEnRestando() {
        c.setValor(10);
        c.menos();
        c.por(); // Mensaje no permitido
        assertEquals("Error", c.getResultado());
    }

    @Test
    public void testMensajeNoPermitidoEnMultiplicando() {
        c.setValor(10);
        c.por();
        c.dividido(); // Mensaje no permitido
        assertEquals("Error", c.getResultado());
    }

    @Test
    public void testMensajeNoPermitidoEnDividiendo() {
        c.setValor(10);
        c.dividido();
        c.mas(); // Mensaje no permitido
        assertEquals("Error", c.getResultado());
    }

    @Test
    public void testBorrarEnEstadoInicial() {
        c.setValor(100);
        c.borrar();
        assertEquals("0.0", c.getResultado());
    }

    @Test
    public void testBorrarEnEstadoOperando() {
        c.setValor(10);
        c.mas();
        c.borrar();
        assertEquals("0.0", c.getResultado());
    }

    @Test
    public void testBorrarEnEstadoError() {
        c.setValor(10);
        c.dividido();
        c.setValor(0); // Estado Error
        c.borrar();
        assertEquals("0.0", c.getResultado());
    }

    @Test
    public void testOperacionesEncadenadas() {
        c.setValor(10);
        c.mas();
        c.setValor(5); // 15
        c.por();
        c.setValor(2); // 30
        assertEquals("30.0", c.getResultado());
    }

    @Test
    public void testEstadoErrorIgnoraOperaciones() {
        c.setValor(10);
        c.dividido();
        c.setValor(0); // Estado Error
        c.mas();
        c.setValor(5);
        assertEquals("Error", c.getResultado());
    }
}
