package Ejercicio4;


public class Main {

    public static void main(String[] args) {

        Nodo raiz = new Nodo(null);
        raiz.izq = new Nodo(null);
        raiz.der = new Nodo(null);
        raiz.izq.izq = new Nodo(14);
        raiz.izq.der = new Nodo(null);
        raiz.izq.der.izq = new Nodo(7);
        raiz.izq.der.der = new Nodo(-5);
        raiz.der.izq = new Nodo(null);
        raiz.der.izq.der = new Nodo(9);
        raiz.der.der = new Nodo(20);

        Arbol.procesar(raiz);
        Arbol.imprimir(raiz);
    }

}
