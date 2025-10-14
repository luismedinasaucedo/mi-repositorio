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
    
    public void insertar(String d){
        if (listavacia()) {
            inicio=fin=new Nodo(d);
            return;
        }
        if (true) {
            inicio=new Nodo(d);
        }//menor que inicio ejemplo alfredo es menor que osvaldo
    }
    
    
    
}
