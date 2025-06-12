package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class PaqueteSeguro implements Seguro{
    private String nombre;
    private List<Seguro> seguros;

    public PaqueteSeguro(String nombre) {
//        checkNombre(nombre);
        this.nombre = nombre;
        this.seguros = new ArrayList<>();
    }

    public double calcularCostoPaquete() {
        double costoTotalPaquete = 0.0;
        for (Seguro seguro : seguros) {
            costoTotalPaquete += seguro.costoIndividual();
        }
        double descuento = seguros.size() * 0.05; // 5% adicional por cada seguro
        return costoTotalPaquete * (1- descuento);
    }

    @Override
    public double costoIndividual() {
        double costoTotal = 0.0;
        int posicion = 0;
        for (Seguro seguro : seguros){
            costoTotal += seguro.costoIndividual() * Math.pow(0.95, posicion);
            posicion++;
        }
        return costoTotal;

    }
}
