package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Director implements Empleado {
    private String nombre;
    private double salarioBase;//lo dejo como salario base, porque no hay un calculo especifico
    private List<Empleado> subordinados;

    public Director(String nombre, double salarioBase) {
//        checkNombre(nombre); implementar ambos
//        checkSalarioBase(salarioBase);
        this.nombre= nombre;
        this.salarioBase = salarioBase;
        this.subordinados = new ArrayList<>();
    }

    public void agregarSubordinado(Empleado empleado) {
        this.subordinados.add(empleado);
    }

    @Override
    public double calcularSalario() {
        double total = this.salarioBase;
        for(Empleado empleado : subordinados){
            total += empleado.calcularSalario();
        }
        return total;
    }
}
