package Ejercicio2;

public class Arbol {

    private Nodo raiz;

    public Arbol(){
        this.raiz=null;
    }

    

    public void add(int valor){
        raiz = addRec(raiz, valor);
    }

    public Nodo addRec(Nodo actual, int valor){
        if (actual== null){
            return new Nodo(valor);
        }
        if(valor<actual.valor){
            actual.izq= addRec(actual.izq,valor);
        }   else if (valor> actual.valor){
            actual.der= addRec(actual.der,valor);
        }
        return actual;
    }


    public int sumarValores(){
        return sumarInternos(raiz);
    }

    public int sumarInternos(Nodo nodo){
        if(nodo == null){
            return 0;
        }
        int suma=0;

        if(nodo.izq != null || nodo.der !=null){
            suma += nodo.valor;
        }

        suma+=sumarInternos(nodo.izq);
        suma+= sumarInternos(nodo.der);

        return suma;

    }

    
}
