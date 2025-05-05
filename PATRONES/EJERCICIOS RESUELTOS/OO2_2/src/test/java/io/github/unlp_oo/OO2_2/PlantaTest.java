package io.github.unlp_oo.OO2_2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlantaTest {
    private Personal empCasadoSinHijos;
    private Personal empCasadoConHijos;
    private Personal empSolteroSinHijos;
    private Personal empSolteroConHijos;

    @BeforeEach
    public void setUp() throws Exception {
        empCasadoSinHijos = new Planta(true, 0, 1); 
        empCasadoConHijos = new Planta(true, 1, 1);  
        empSolteroSinHijos = new Planta(false, 0, 1);
        empSolteroConHijos = new Planta(false, 1, 1);
    }

    @Test
    public void testSueldoBasico() {
        assertEquals(50000, empCasadoSinHijos.basico());
        assertEquals(50000, empCasadoConHijos.basico());
        assertEquals(50000, empSolteroSinHijos.basico());
        assertEquals(50000, empSolteroConHijos.basico());
    }

    @Test
    public void testCalcularAdicionales() {
        assertEquals(7000, empCasadoSinHijos.adicional()); 
        assertEquals(9000, empCasadoConHijos.adicional());
        assertEquals(2000, empSolteroSinHijos.adicional());
        assertEquals(4000, empSolteroConHijos.adicional());
    }

    @Test
    public void testCalcularDescuentos() {
        assertEquals(6850, empCasadoSinHijos.descuentos()); 
        assertEquals(6950, empCasadoConHijos.descuentos());  
        assertEquals(6600, empSolteroSinHijos.descuentos());
        assertEquals(6700, empSolteroConHijos.descuentos()); 
    }

    @Test
    public void testSueldo() {
        assertEquals(50150, empCasadoSinHijos.sueldo());  
        assertEquals(52050, empCasadoConHijos.sueldo());  
        assertEquals(45400, empSolteroSinHijos.sueldo()); 
        assertEquals(47300, empSolteroConHijos.sueldo());
    }
}
