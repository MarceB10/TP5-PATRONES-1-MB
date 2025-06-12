package Ejercicio4;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CalculadorTest {

    @Test
    void calcularJubiladoEnPromocion() {
        var calculadorJubilado = new CalculadorJubilado(LocalDate.now().getMonthValue());
        double total = calculadorJubilado.calcularPrecio(100);// = total * 0.00
        assertEquals(100,total);
    }

    @Test
    void calcularJubiladoSinPromocion() {
        var calculadorJubilado = new CalculadorJubilado(LocalDate.now().getMonthValue() - 1);
        double total = calculadorJubilado.calcularPrecio(100);//total * 0.1
        assertEquals(110,total);
    }


    /// //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @Test
    void calcularNoJubiladoEnPromocion() {
        var calculadorNoJubilado = new CalculadorNoJubilado(LocalDate.now().getMonthValue());
        double total = calculadorNoJubilado.calcularPrecio(100);//total * 0.15
        assertEquals(115,total);
    }

    @Test
    void calcularNoJubiladoSinPromocion() {
        var calculadorNoJubilado = new CalculadorNoJubilado(LocalDate.now().getMonthValue() - 1);
        double total = calculadorNoJubilado.calcularPrecio(100);//total * 0.21
        assertEquals(121,total);
    }

}