import java.io.*;

/**
 * <h1>Serializer </h1>
 * Permite hacer la inscripcion de objetos en un documento de salida para mantener la persistencia de datos
 * @author Armando Aquino and Kevin Ariel Merino Peña
 * @version 1
 */
public class Serializer {

    public void escribeTXT(Object object, String path){
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter(path);
            pw = new PrintWriter(fichero);
            pw.println(object);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fichero)
                    fichero.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

    }

}
