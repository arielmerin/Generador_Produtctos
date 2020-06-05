/**
 * <h1>Main</h1>
 * Clase principal
 */
public class Main {
    /**
     * Método principal en todo el programa, genera 100 lineas en el documento txt
     * @param args
     */
    public static void main(String[] args) {
        Serializer serializer = new Serializer();

        ProductoBuilder productoBuilder = new ProductoBuilder();
        Lista<String> textos = new Lista<>();
        for (int i = 0; i < 10000; i++) {
            textos.agregar(String.valueOf(productoBuilder.next()));
        }
        serializer.escribeTXT(textos,"prodctos.txt");

    }
}
