package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class MandoMedio implements Empleado{
    private String nombre;
    private double salarioBase;
    private List<Empleado> subordinados;

    public MandoMedio(String nombre,double salarioBase){
        // checkNombre(nombre); implementar ambos
        // checkSalarioBase(salarioBase);
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.subordinados = new ArrayList<>();
    }

    @Override
    public double calcularSalario() {
        double total = this.salarioBase;
        for(Empleado empleado : subordinados){
            total += empleado.calcularSalario();
        }
        return total;
    }

    public void agregarSubordinado(Empleado lider2) {
        this.subordinados.add(lider2);
    }
}
