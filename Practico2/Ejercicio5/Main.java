package Ejercicio5;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Árbol de ejemplo como el del enunciado
        Nodo raiz = new Nodo('M');
        raiz.izq = new Nodo('A');
        raiz.izq.izq = new Nodo('L');
        raiz.izq.der = new Nodo('N');
        raiz.izq.der.izq = new Nodo('A');
        raiz.izq.der.der = new Nodo('O');

        raiz.der = new Nodo('I');
        raiz.der.izq = new Nodo('S');
        raiz.der.izq.der = new Nodo('A');
        raiz.der.der = new Nodo('O');
    

        List<String> palabras = Arbol.buscarPalabrasConNVocales(raiz, 1);

        System.out.println("Palabras con 1 vocales:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    
    }
}
