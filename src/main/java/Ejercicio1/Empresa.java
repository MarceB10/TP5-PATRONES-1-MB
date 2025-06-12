package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private double montoTotalSalarial;
    private List<Empleado> empleados;

    public Empresa(String nombre){
        //checknombre(nombre);
        this.nombre = nombre;
        this.montoTotalSalarial = 0.0;
        this.empleados= new ArrayList<>();
    }
    
    public void agregarEmpleado(Empleado empleado) {
        if (empleado != null) {
            empleados.add(empleado);
            montoTotalSalarial += empleado.calcularSalario();
        }
    }
    
    public double calcularMontoTotalSalarial(){
        double total = 0.0;
        for (Empleado empleado : empleados){
            total += empleado.calcularSalario();
        }
        this.actualizarMontoTotalSalarial(total);
        return total;
    }

    private void actualizarMontoTotalSalarial(double total) {
        this.montoTotalSalarial = total;
    }

}
