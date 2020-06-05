import java.util.Iterator;
import java.util.Random;

/**
 * <h1> Constructor de Productos </h1>
 * En esta clase se presentan las funciones que permitirán crear productos de manera aleatoria
 * @autor Ariel Merino
 * @version  1.0
 */
public class ProductoBuilder implements Iterator<Producto> {


    /**
     * Conjunto de nombres de productos muestra
     */
    private final String[] nombres = {"Manzana", "Pera", "Papaya", "Mango", "Mandarina", "Camote",
            "Calabaza", "Arroz", "Sopa", "Pasta", "Spaghetti", "Salsa de soya", "Vinagre de Arroz", "Harina de trigo",
            "Harina de garbanzo", "Harina de avena", "Harina integral", "Harina de quinoa", "Avena", "Quinoa", "Habas",
            "Frijoles", "Garbanzos", "Alubias", "Lentejas", "Limones", "Chiles secos", "Almendras", "Nueces", "Café",
            "Splenda", "Cereales", "Pan", "Ezekiel", "Jabón de baño", "Edamames", "Chicharos", "Chayotes", "Pepino"};

    /**
     * Conjunto de complemento para lo nombres de productos muestras
     */
    private final String[] complementos = {" integral", " orgánico", " de baño", " gluten free", " con jarabe de agave",
            " vegan", " veggie", " con aceite de coco", " bolsa grande"};


    /**
     * Permite la creación de un número positivo aleatorio en algun intervalo positivo
     * @param k la cota superior de valores obtenidos
     * @return entero aleatorio generado
     */
    private static int random(int k){
        Random rdm = new Random();
        int i = rdm.nextInt();
        i = i < 0 ? -i : i;
        return i % k;
    }

    /**
     * Proporciona un double aleatorio positivo en un rango
     * @param k cota superior de la parte decimal
     * @return parte decimal de algun número
     */
    private static double randomD(int k){
        Random rdm = new Random();
        double i = rdm.nextDouble();
        i = i < 0 ? -i : i;
        return i % k;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Producto next() {
        return new Producto(random(984),nombres[random(nombres.length)] + complementos[random(complementos.length)], randomD(9) + random(1900));
    }
}
