package Ejercicio4;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public class CalculadorNoJubilado extends Calculador {
    public static final double IVA_SIN_PROMOCION = 0.21;
    public static final double IVA_CON_PROMOCION = 0.15;

    public CalculadorNoJubilado( int mesEnPromocion) {
        super(mesEnPromocion);
    }

    @Override
    public double tasaPromocion() {
        return IVA_CON_PROMOCION;
    }

    @Override
    public double tasaSinPromocion() {
        return IVA_SIN_PROMOCION;

    }

}
