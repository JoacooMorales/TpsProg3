
import java.util.*;

public class Backtracking {

    public static Solucion mejorSolucion = null; // se guarda la mejor (menos máquinas usadas)

    public static int estadosGenerados = 0;

    public static void backtracking(int piezasActuales, List<String> usadas,
            int piezasTotales, Map<String, Integer> maquinas) {
        estadosGenerados++;
        if (piezasActuales == piezasTotales) {
            if (mejorSolucion == null || usadas.size() < mejorSolucion.cantidadPuestasEnMarcha) {
                mejorSolucion = new Solucion(usadas);
            }
            return;
        }

        // para no pasarnos
        if (piezasActuales > piezasTotales) {
            return;
        }

        if (mejorSolucion != null && usadas.size() >= mejorSolucion.cantidadPuestasEnMarcha) {
            return; //poda
        }

        // Recorremos maquinas posibles
        for (String nombre : maquinas.keySet()) {
            int cantidad = maquinas.get(nombre);
            usadas.add(nombre); // usamos una máquina
            backtracking(piezasActuales + cantidad, usadas, piezasTotales, maquinas); // llamada recursiva
            usadas.remove(usadas.size() - 1); // deshacemos la ultima maquina (backtracking)
        }
    }
}
