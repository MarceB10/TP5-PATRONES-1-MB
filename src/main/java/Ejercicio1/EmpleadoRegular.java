package Ejercicio1;

public class EmpleadoRegular implements Empleado{
    private String nombre;
    private double salarioBase;

    public EmpleadoRegular(String nombre, double salarioBase) {
        // checkNombre(nombre); implementar ambos
        // checkSalarioBase(salarioBase);
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalario() {
        return this.salarioBase;
    }
}
