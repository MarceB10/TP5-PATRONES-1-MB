package Ejercicio5;

public abstract class Remeras {
    protected double precioUnitario;

    public Remeras(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public final double calcularPrecio() {
        double precioTotal = precioUnitario;
        if (esImportada()) {
            precioTotal =  calcularPrecioImportacion();
        }else{
            precioTotal =  calcularPrecioNacional();
        }
        return precioTotal;
    }


    protected abstract boolean esImportada();

    protected abstract double calcularPrecioImportacion();

    protected abstract double calcularPrecioNacional();

}
