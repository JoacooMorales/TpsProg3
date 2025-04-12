package Ejercicio3;

import static Ejercicio3.Arbol.resultado;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Nodo raiz = new Nodo(8);
        raiz.izq = new Nodo(3);
        raiz.izq.izq = new Nodo(1);
        raiz.izq.der = new Nodo(6);
        raiz.izq.der.izq = new Nodo(4);
        raiz.izq.der.der = new Nodo(7);
        raiz.der = new Nodo(10);
        raiz.der.izq = new Nodo(9);
        raiz.der.der = new Nodo(11);

        int k = 8;
        List <Integer> HojasMayoresQueK = resultado(raiz,k); 
        System.out.println("Hojas con valor > " + k + ": " + HojasMayoresQueK);

    }
    
}
