package Ejercicio1;

import java.util.List;

public class Main {
    public static void main(String[] args){
        var empresa = new Empresa("Laser x");

        // creamos empleados
        var director = new Director("Director1",10000);
        var gerente1 = new Gerente("Gerente1", 5000);
        var gerente2 = new Gerente("Gerente2", 5000);
        var mando1 = new MandoMedio("Mando1",4000);
        var mando2 = new MandoMedio("Mando2",4000);
        var lider1 = new LiderDeProyecto("Lider1",3000);
        var lider2 = new LiderDeProyecto("Lider2",3000);
        var empleado1 = new EmpleadoRegular("Empleado1", 2000);
        var empleado2 = new EmpleadoRegular("Empleado2", 2000);
        var empleado3 = new EmpleadoRegular("Empleado3", 2000);
        //el total seria 40000

        lider2.agregarSubordinado(empleado1);
        lider2.agregarSubordinado(empleado2);
        lider1.agregarSubordinado(empleado3);

        mando2.agregarSubordinado(lider2);
        mando1.agregarSubordinado(lider1);

        gerente2.agregarSubordinado(mando2);
        gerente1.agregarSubordinado(mando1);

        director.agregarSubordinado(gerente2);
        director.agregarSubordinado(gerente1);

        empresa.agregarEmpleado(director);

        System.out.println("Monto total salarial de la empresa: " + empresa.calcularMontoTotalSalarial());

    }
}
