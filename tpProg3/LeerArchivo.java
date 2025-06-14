
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class LeerArchivo {

    public static Configuracion leerConfiguracion(String rutaArchivo) {
        int piezasTotales = 0;
        Map<String, Integer> maquinas = new HashMap<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));

            //primer linea del archivo de texto (cant piezas)
            String linea = br.readLine();
            if (linea != null) {
                //parseInt convierte el primer numero del archivo txt (que es un caracter (12)) a un int
                //.trim utilizado para quitar espacios
                piezasTotales = Integer.parseInt(linea.trim());
            }
            // leer las siguientes lineas del archivo txt
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 2) {
                    String nombre = partes[0].trim();
                    int piezas = Integer.parseInt(partes[1].trim());
                    maquinas.put(nombre, piezas);
                }
            }

        } catch (Exception e) {
            System.out.println("error");
        }

        System.out.println("Piezas totales :" + piezasTotales);
        for (String nombre : maquinas.keySet()) {
            System.out.println(nombre + ": " + maquinas.get(nombre));
        }

        return new Configuracion(piezasTotales, maquinas);
    }
}
