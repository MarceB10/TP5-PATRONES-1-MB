package Ejercicio3;

public class SeguroAutomovil implements Seguro {
    private String nombre;
    private double costoBase;

    public SeguroAutomovil(String nombre, double costoBase) {
//        checkNombre(nombre);
//        checkCostoBase(costoBase);
        this.nombre = nombre;
        this.costoBase = costoBase;
    }

    public String miNombre() {
        return this.nombre;
    }


    @Override
    public double costoIndividual() {
        return this.costoBase;
    }
}
