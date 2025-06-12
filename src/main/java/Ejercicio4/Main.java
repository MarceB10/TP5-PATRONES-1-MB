package Ejercicio4;

public class Main {
    public static void main(String[] args) {
        var calculadorNoJubilado = new CalculadorNoJubilado(6);//mes promocion
        var calculadorNoJubilado1 = new CalculadorNoJubilado(5);//mes no promocion
        var calculadorJubilado = new CalculadorJubilado(5);//mes no promocion
        var calculadorJubilado1 = new CalculadorJubilado(6);//mes promocion
        System.out.println(calculadorJubilado.calcularPrecio(100));
        System.out.println(calculadorJubilado1.calcularPrecio(100));
        System.out.println(calculadorNoJubilado.calcularPrecio(100));
        System.out.println(calculadorNoJubilado1.calcularPrecio(100));
    }
}
