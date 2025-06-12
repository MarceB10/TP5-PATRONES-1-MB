package Ejercicio2;

public class Tarea implements ItemDeProyecto{
    private String nombre;
    private double duracion;

    public Tarea(String nombre, double duracion) {
        // checkNombre(nombre);
        // checkDuracion(duracion);
        this.nombre = nombre;
        this.duracion = duracion;
    }
    public String miNombreTarea() {
        return nombre;
    }
    @Override
    public double calcularDuracion() {
        return this.duracion;
    }
}
