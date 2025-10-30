package com.mycompany.arbol;

public class Aarbol {
    private NodoArbol Raiz;

    public Aarbol() {
        this.Raiz = null;
    }
    
    public void insertar(int c){
        if (Raiz==null) {
            Raiz = new NodoArbol(c);
            return;
        }
        NodoArbol aux=Raiz;
        while(true){
            
            if (aux.getClave()<c) {
                if (aux.getDer()==null) {
                    aux.setDer(new NodoArbol(c));
                    break;
                }
            }
            else if(aux.getClave()>c){
                if (aux.getIzq()==null) {
                    aux.setIzq(new NodoArbol(c));
                    break;
                }
            }
            else{System.out.println("no se puede agregar: clave igual");}
        }
    }
    
}
