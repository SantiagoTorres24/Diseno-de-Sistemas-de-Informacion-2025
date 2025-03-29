package Domain.tests;

import Domain.personas.Pasajero;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class PasajeroTest {

    @Test
    @DisplayName("Test para obtener el nombre completo de una Persona")
    public void obtenerNombreCompleto(){
        Pasajero pasajero = new Pasajero(); // rompe pq le tengo que setear mas atributos pero esta bien
        pasajero.setNombre("Santiago");
        pasajero.setApellido("Torres");

        Assertions.assertEquals("Santiago Torres", pasajero.obtenerNombreCompleto());

        //Assertions.assertTrue(condicion); para ver si la condicion es verdadera
    }
}