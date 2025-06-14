
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Configuracion config = LeerArchivo.leerConfiguracion("C:\\Users\\joaco\\OneDrive\\Escritorio\\tpProg3\\piezas.txt");

        Backtracking.backtracking(0, new ArrayList<>(), config.piezasTotales, config.maquinas);

        if (Backtracking.mejorSolucion != null) {
            Backtracking.mejorSolucion.mostrar();
            System.out.println("Estados generados: " + Backtracking.estadosGenerados);
        } else {
            System.out.println("No se encontró solución.");
        }

    }
}
