package Ejercicio5;

public class Nacionales extends Remeras {
    public static final double RECARGO_TRANSPORTE = 0.015;
    public static final double BONIFICACION = 0.2;
    public static final double RECARGO_COMERCIO = 0.15;

    public Nacionales(double precioUnitario) {
        super(precioUnitario);
    }

    @Override
    protected boolean esImportada() {
        return false;
    }

    @Override
    protected double calcularPrecioImportacion() {
        return 0;
    }

    @Override
    protected double calcularPrecioNacional() {
        return (precioUnitario + (precioUnitario * RECARGO_TRANSPORTE)
                - (precioUnitario * BONIFICACION))
                * (1 + RECARGO_COMERCIO);
    }
}
