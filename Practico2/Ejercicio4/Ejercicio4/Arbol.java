package Ejercicio4;

public class Arbol {

    public static void imprimir(Nodo raiz) {
        if (raiz == null)
            return;
        System.out.println(raiz.valor);
        imprimir(raiz.izq);
        imprimir(raiz.der);
    }

    public static int procesar(Nodo raiz) {
        if (raiz == null) {
            return 0;
        }
        if (raiz.der == null && raiz.izq == null) {
            return raiz.valor;
        }

        int izq = procesar(raiz.izq);
        int der = procesar(raiz.der);

        raiz.valor = der - izq;

        return raiz.valor;

    }
}
