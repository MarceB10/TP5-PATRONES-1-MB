package Ejercicio4;
import static java.time.LocalDate.now;
import static java.time.Month.of;


abstract class Calculador {
    private int mesEnPromocion;
    private LogTransaction log;

    public Calculador(int mesEnPromocion) {
        this.mesEnPromocion = mesEnPromocion;
        this.log = new LogTransaction();
    }


    public final double calcularPrecio(double precioProducto) {
        double precioTotal = precioProducto;
        if (of(mesEnPromocion).equals(now().getMonth())) {
            precioTotal += precioProducto * tasaPromocion();
        } else {
            precioTotal += precioProducto * tasaSinPromocion();
        }
        log.log(this.getClass().getName());//en este caso se puede usar porque nos da el nombre de la clase
        return precioTotal;
    }

    public int mesEnPromocion() {
        return mesEnPromocion;
    }
    public abstract double tasaPromocion();

    public abstract double tasaSinPromocion();

}