package Ejercicio1;

public class Arbol {

    private Nodo raiz;

    public Arbol(){
        this.raiz=null;
    }

    public Nodo addRec(Nodo actual , Integer valor){
        if(actual == null){
            return new Nodo(valor);
        }
        
        if ( valor <actual.valor){
            actual.izq = addRec(actual.izq, valor);
        } else if(valor > actual.valor){
            actual.der = addRec(actual.der,valor);
        }

        return actual;
    }

    public void add(Integer valor){
        raiz= addRec(raiz,valor);
    }


    public boolean hasElem(Integer valor) {
        Nodo actual = raiz;
        while (actual != null){
            if(actual.valor.equals(valor) ){
                return true;
            } else if(actual.valor < valor){
                actual = actual.der;
            } else {
                actual = actual.izq;
            }
        }
        return false;
    }
    
    public boolean isEmpty(){
        return raiz == null;
    }


    private void imprimirPreOrden(Nodo nodo){
        if (nodo == null)
        return;

            System.out.println( nodo.valor + "");
            imprimirPreOrden(nodo.izq);
            imprimirPreOrden(nodo.der);
    }
    
    private void imprimirInOrden(Nodo nodo){
        if (nodo == null)
        return;

            imprimirInOrden(nodo.izq);
            System.out.println( nodo.valor + "");
            imprimirInOrden(nodo.der);
    }

    
    private void imprimirPostOrden(Nodo nodo){
        if (nodo == null)
        return;

            imprimirPostOrden(nodo.izq);
            imprimirPostOrden(nodo.der);
            System.out.println( nodo.valor + "");

    }

    public void printPreOrder() {
        imprimirPreOrden(raiz);
    }
    
    public void printInOrder() {
        imprimirInOrden(raiz);
    }
    
    public void printPostOrder() {
        imprimirPostOrden(raiz);
    }
    

    public Integer getMaxElem(){
        if(raiz != null){
            Nodo actual = raiz;

            while ( actual.der != null){
                actual = actual.der;
            }
            return actual.valor;
        }
        return null;
    }

    
}
