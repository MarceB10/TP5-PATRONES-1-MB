package Ejercicio2;

public class Spike implements ItemDeProyecto{
    private String nombre;
    private double duracion;

    public Spike(String nombre, double duracion) {
//        checkNombre(nombre);
//        checkDuracion(duracion);
        this.nombre = nombre;
        this.duracion = duracion;
    }
    public String miNombreSpike() {
        return nombre;
    }

    @Override
    public double calcularDuracion() {
        return this.duracion;
    }
}
