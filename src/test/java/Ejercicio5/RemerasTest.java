package Ejercicio5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemerasTest {
    @Test
    public void testCalcularPrecioNacional() {
        Nacionales remeraNacional = new Nacionales(100.0);
        double precioCalculado = remeraNacional.calcularPrecio(); // 100 + 1.5 - 20 = 81.5 * 1.15 = 93.725
        assertEquals(93.725, precioCalculado);
    }

    @Test
    public void testCalcularPrecioImportada() {
        Importadas remeraImportada = new Importadas(100.0);
        double precioCalculado = remeraImportada.calcularPrecio();// (100 + 3 + 5) * 1.25 = 135.0
        assertEquals(135, precioCalculado);
    }


}