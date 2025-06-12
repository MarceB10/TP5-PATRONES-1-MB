package Ejercicio2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ProyectoScrumTest {

    @Test
    void test1(){
        var proyecto1 = new ProyectoScrum("Proyecto 1");
        var historia1 = new HistoriaDeUsuario("Historia de usuario 1");
        var tarea1 = new Tarea("Tarea 1", 5.0);
        var tarea2 = new Tarea("Tarea 2", 3.0);

        var tareaAnalisis1 = new Spike("Spike 1", 4.0);
        var tareaAnalisis2 = new Spike("Spike 2", 1.0);

        historia1.agregarItem(tarea1);
        historia1.agregarItem(tarea2);

        proyecto1.agregarItemProyecto(historia1);
        proyecto1.agregarItemProyecto(tareaAnalisis1);
        proyecto1.agregarItemProyecto(tareaAnalisis2);

        double duracionTotal = proyecto1.calcularDuracionTotal();
        assertEquals(13.0, duracionTotal);
    }

    @Test
    void test2(){
        var proyecto2 = new ProyectoScrum("Proyecto 2");
        var historia2 = new HistoriaDeUsuario("Historia de usuario 2");
        var tarea3 = new Tarea("Tarea 3", 2.0);
        var tarea4 = new Tarea("Tarea 4", 6.0);
        var tarea5 = new Tarea("Tarea 5", 4.0);
        var tarea6 = new Tarea("Tarea 6", 1.0);

        var tareaAnalisis1 = new Spike("Spike 3", 3.0);
        var tareaAnalisis2 = new Spike("Spike 4", 5.0);
        var tareaAnalisis3 = new Spike("Spike 4", 5.0);
        var tareaAnalisis4 = new Spike("Spike 4", 5.0);
        var tareaAnalisis5 = new Spike("Spike 4", 5.0);

        historia2.agregarItem(tarea3);
        historia2.agregarItem(tarea4);
        historia2.agregarItem(tarea5);
        historia2.agregarItem(tarea6);
        proyecto2.agregarItemProyecto(tareaAnalisis1);
        proyecto2.agregarItemProyecto(tareaAnalisis2);
        proyecto2.agregarItemProyecto(tareaAnalisis3);
        proyecto2.agregarItemProyecto(tareaAnalisis4);
        proyecto2.agregarItemProyecto(tareaAnalisis5);
        proyecto2.agregarItemProyecto(historia2);

        double duracionTotal = proyecto2.calcularDuracionTotal();
        assertEquals(36.0, duracionTotal);

    }

    @Test
    void test3Vacio(){
        var proyecto3 = new ProyectoScrum("Proyecto 3");
        var historia3 = new HistoriaDeUsuario("Historia de usuario 3");
        double totalDuracion = proyecto3.calcularDuracionTotal();
        assertEquals(0.0, totalDuracion);
    }


}