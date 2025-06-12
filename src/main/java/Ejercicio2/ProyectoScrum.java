package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class ProyectoScrum{
    private String nombre;
    private List<ItemDeProyecto> itemsProyecto;

    public ProyectoScrum(String nombre) {
//        checkNombre(nombre);
//        checkDuracion(duracion);
        this.nombre = nombre;
        this.itemsProyecto = new ArrayList<>();
    }

    public void agregarItemProyecto(ItemDeProyecto item) {
        if (item != null) {
            itemsProyecto.add(item);
        }
    }

    public String miNombreProyectoScrum() {
        return nombre;
    }

    public double calcularDuracionTotal() {
        double totalDuracion = 0.0;
        for (ItemDeProyecto item : itemsProyecto) {
            totalDuracion += item.calcularDuracion();
        }
        return totalDuracion;
    }
}
