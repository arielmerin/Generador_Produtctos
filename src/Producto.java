/**
 * <h1>Producto </h1>
 *
 * Permite modelar la estructura de un producto para un supermercado, son 3 requerimientos para la creación de éstos
 * y están pensados para emplearse en un proyecto final de cierta materia jiji
 * @author  Ariel Merino
 * @version 1.1
 */
public class Producto {

    /**
     * Costo del prodcto
     */
    private double precio;

    /**
     * Nombre que recibe el producto
     */
    private String nombre;

    /**
     * Cantidad de existencias que debe haber en el almacen
     */
    private int cantidad;


    /**
     * Constructor único que permite la creación de productos con todos sus requisitos
     * @param cantidad número de existencias en algún almacen
     * @param nombre cómo se llama el producto a agregar
     * @param precio cuál es el precio de dicho artículo
     */
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
