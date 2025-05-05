package io.github.unlp_oo.OO2_2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PasanteTest {
    private Personal empSinExamenes;
    private Personal empConUnExamen;
    private Personal empConDosExamenes;

    @BeforeEach
    public void setUp() throws Exception {
        empSinExamenes = new Pasante(0);   
        empConUnExamen = new Pasante(1);   
        empConDosExamenes = new Pasante(2); 
    }

    @Test
    public void testSueldoBasico() {
        assertEquals(20000, empSinExamenes.basico());
        assertEquals(20000, empConUnExamen.basico());
        assertEquals(20000, empConDosExamenes.basico());
    }

    @Test
    public void testCalcularAdicionales() {
        assertEquals(0, empSinExamenes.adicional());   
        assertEquals(2000, empConUnExamen.adicional());
        assertEquals(4000, empConDosExamenes.adicional()); 
    }

    @Test
    public void testCalcularDescuentos() {
        assertEquals(2600, empSinExamenes.descuentos());   
        assertEquals(2700, empConUnExamen.descuentos());  
        assertEquals(2800, empConDosExamenes.descuentos());
    }

    @Test
    public void testSueldo() {
        assertEquals(17400, empSinExamenes.sueldo());   
        assertEquals(19300, empConUnExamen.sueldo());    
        assertEquals(21200, empConDosExamenes.sueldo()); 
    }
}
