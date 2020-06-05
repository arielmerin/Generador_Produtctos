

public class Main {
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
