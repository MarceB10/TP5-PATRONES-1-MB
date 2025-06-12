package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class HistoriaDeUsuario implements ItemDeProyecto{
    private List<ItemDeProyecto> items;
    private String nombre;

    public HistoriaDeUsuario(String nombre) {
//        checkNombre(nombre);
//        checkDuracion(duracion);
        this.nombre = nombre;
        this.items = new ArrayList<>();
    }

    public String miNombreHistoria() {
        return this.nombre;
    }

    public void agregarItem(ItemDeProyecto item) {
        if (item != null) {
            items.add(item);
        }
    }

    @Override
    public double calcularDuracion() {
        double totalDuracion = 0.0;
        for (ItemDeProyecto item : items) {
            totalDuracion += item.calcularDuracion();
        }
        return totalDuracion;
    }
}
