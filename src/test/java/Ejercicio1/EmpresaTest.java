package Ejercicio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {

    @Test
    void test1(){
        Empresa empresa = new Empresa("TechLab");

        // Crear empleados
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

        double monto = empresa.calcularMontoTotalSalarial();
        assertEquals(40000,monto);
    }

    @Test
    void test2(){
        Empresa empresa = new Empresa("TechLab");

        // Crear empleados
        var director = new Director("Director1",10000);
        var gerente1 = new Gerente("Gerente1", 5000);
        var mando1 = new MandoMedio("Mando1",4000);
        var lider1 = new LiderDeProyecto("Lider1",3000);
        var empleado1 = new EmpleadoRegular("Empleado1", 2000);
        var empleado3 = new EmpleadoRegular("Empleado3", 2000);
        //el total seria 26000

        lider1.agregarSubordinado(empleado1);
        lider1.agregarSubordinado(empleado3);

        mando1.agregarSubordinado(lider1);

        gerente1.agregarSubordinado(mando1);

        director.agregarSubordinado(gerente1);

        empresa.agregarEmpleado(director);

        double monto = empresa.calcularMontoTotalSalarial();
        assertEquals(26000,monto);
    }


    @Test
    void agregarEmpleado() {
        Empresa empresa = new Empresa("Tech Solutions");
        Gerente gerente = new Gerente("Alice", 5000);
        MandoMedio mandoMedio = new MandoMedio("Bob", 3000);

        empresa.agregarEmpleado(gerente);
        empresa.agregarEmpleado(mandoMedio);

        assertEquals(8000, empresa.calcularMontoTotalSalarial(), "El monto total salarial debe ser 8000");
    }

    @Test
    void calcularMontoTotalSalarial() {
        Empresa empresa = new Empresa("Tech Solutions");
        Gerente gerente = new Gerente("Alice", 5000);
        MandoMedio mandoMedio = new MandoMedio("Bob", 3000);
        EmpleadoRegular empleadoRegular = new EmpleadoRegular("Charlie", 2000);

        gerente.agregarSubordinado(mandoMedio);
        mandoMedio.agregarSubordinado(empleadoRegular);
        empresa.agregarEmpleado(gerente);

        double totalSalarial = empresa.calcularMontoTotalSalarial();
        assertEquals(10000, totalSalarial, "El monto total salarial debe ser 10000");
    }
}