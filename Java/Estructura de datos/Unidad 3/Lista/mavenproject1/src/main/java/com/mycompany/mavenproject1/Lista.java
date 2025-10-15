package com.mycompany.mavenproject1;

public class Lista {
    private Nodo inicio;
    private Nodo fin;

    public Lista() {
        this.inicio = null;
        this.fin = null;
    }
    
    public boolean listavacia(){
    return inicio==null;
    }
    
    public void insertar(String dato){
        Nodo nuevo=new Nodo(dato);
        if (listavacia()) {
            inicio=fin=nuevo;
            return;
        }//si esta vacia
        Nodo aux=inicio;
        while(aux!=null){
            if ((int)aux.getDato().charAt(0)>(int)nuevo.getDato().charAt(0)) {
                if (aux==inicio) {
                    inicio=nuevo;
                }
            nuevo.setSig(aux);
            aux.setAnt(nuevo);
            
            }
            aux=aux.getSig();
        }
    }
    public void mostrar(){
    Nodo Aux=inicio;
    while(Aux!=null){
        System.out.println(Aux.getDato());
        Aux=Aux.getSig();
    }
    }
    
    
    
}
