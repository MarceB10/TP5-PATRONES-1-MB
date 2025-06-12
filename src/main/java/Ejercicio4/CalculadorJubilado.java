package Ejercicio4;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public class CalculadorJubilado extends Calculador {

    public CalculadorJubilado(int mesEnPromocion) {
        super(mesEnPromocion);
    }

    @Override
    public double tasaPromocion() {
        return 0.00;
    }

    @Override
    public double tasaSinPromocion() {
        return 0.1;
    }

}