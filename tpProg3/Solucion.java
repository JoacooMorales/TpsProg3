
import java.util.ArrayList;
import java.util.List;

public class Solucion {

    public List<String> secuencia;
    public int cantidadPuestasEnMarcha;

    public Solucion(List<String> secuencia) {
        this.secuencia = new ArrayList<>(secuencia);
        this.cantidadPuestasEnMarcha = secuencia.size();
    }

    public void mostrar() {
        System.out.println("Maquinas utilizadas: " + secuencia);
        System.out.println("Total de puestas en marcha: " + cantidadPuestasEnMarcha);
    }
}
