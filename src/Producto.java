public class Producto {

    private double precio;

    private String nombre;

    private int cantidad;


    public Producto(int cantidad, String nombre, double precio){
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return String.format("%d, %s, %.2f\n", cantidad, nombre, precio);
    }
}
