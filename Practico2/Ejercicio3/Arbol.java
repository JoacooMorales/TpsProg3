package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Arbol {

    
    public static void Recorrer(Nodo raiz, int k, List <Integer> resultado){
        if(raiz == null){
            return ;
        }

        if(raiz.izq == null && raiz.der == null && raiz.valor > k){
            resultado.add(raiz.valor);
        }

        Recorrer(raiz.der, k, resultado);
        Recorrer(raiz.izq, k, resultado);
    }

    public static List <Integer> resultado (Nodo raiz , int k){
        List <Integer> nums = new ArrayList<>();
        Recorrer(raiz,k,nums);
        return nums;
    }

    
}
