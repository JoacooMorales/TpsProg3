package Ejercicio5;



import static java.lang.Character.toLowerCase;
import java.util.ArrayList;
import java.util.List;

public class Arbol {

    private static boolean esVocal(char c) {
        c = toLowerCase(c); // Por si viene en mayúscula
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void recorrer(Nodo raiz, String palabraActual, int vocales, int N, List<String> resultado){
        if(raiz == null){
            return ;
        }

        char letra = raiz.valor;
        palabraActual +=letra;

        if(esVocal(letra)){
            vocales++;
        }

        //si es hoja
        if(raiz.izq == null && raiz.der == null){
            if(vocales==N){
                resultado.add(palabraActual);
            }
        }

        recorrer(raiz.izq,palabraActual,vocales,N,resultado);
        recorrer(raiz.der,palabraActual,vocales,N,resultado);

    }

    public static List<String> buscarPalabrasConNVocales(Nodo raiz,int N){
        List <String > resultado = new ArrayList<>();
        recorrer(raiz, "", 0, N, resultado);
        return resultado;
    }
}
