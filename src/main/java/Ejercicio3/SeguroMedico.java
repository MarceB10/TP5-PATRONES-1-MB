package Ejercicio3;

public class SeguroMedico implements Seguro{
    private String nombre;
    private double costoBase;

    public SeguroMedico(String nombre, double costoBase){
//        checkNombre(nombre);
//        checkCostoBase(costoBase);
        this.nombre = nombre;
        this.costoBase = costoBase;
    }

    public String miNombre() {
        return nombre;
    }


    @Override
    public double costoIndividual() {
        return this.costoBase;
    }
}
