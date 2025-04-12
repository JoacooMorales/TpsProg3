package Ejercicio2;

public class Main {

    public static void main(String[] args) {

        Arbol arbol = new Arbol();

        arbol.add(10);
        arbol.add(20);
        arbol.add(40);
        arbol.add(50);
        arbol.add(35);

        System.out.println( "su total es de : " +arbol.sumarValores());
    }
    
}
