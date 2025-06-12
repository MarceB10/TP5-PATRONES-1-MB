package Ejercicio5;

public class Importadas extends Remeras{
    public static final double RECARGO_IMPORTACION = 0.03;
    public static final double RECARGO_ADUANERO = 0.05;
    public static final double RECARGO_COMERCIO = 1.25;

    public Importadas(double precioUnitario) {
        super(precioUnitario);
    }

    @Override
    protected boolean esImportada() {
        return true;
    }

    @Override
    protected double calcularPrecioImportacion() {
        return (this.precioUnitario + (this.precioUnitario * RECARGO_IMPORTACION)
                + (this.precioUnitario * RECARGO_ADUANERO)) * RECARGO_COMERCIO; // Asumiendo un 25% de recargo por importación
    }



    @Override
    protected double calcularPrecioNacional() {
        return 0;
    }


}
