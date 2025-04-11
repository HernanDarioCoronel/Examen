package examen;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

public class TestConcecionario {
    static Empleado gerente;
    static Concesionario concesionario;
    @BeforeAll
    static void inicialize(){
        gerente = new Empleado("carlos","1234", "43121", "Gerente");
        concesionario = new Concesionario("examen", "calle 123", gerente);
    }

    @Test
    void testCreation(){
        Assertions.assertEquals("examen", concesionario.getNombre());
    }

    @Test
    void testNotNullCreation(){
        Assertions.assertNotNull(concesionario);
    }
}
