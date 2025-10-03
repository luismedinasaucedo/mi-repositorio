package com.mycompany.edt3a5.coladinamica;

public class Cola {
    private Nodo inicio,fin;

    public Cola() {
        this.inicio = null;
        this.fin = null;
    }
    public void encolar(String d){
    Nodo nuevo =new Nodo(d);
        if (inicio==null) {
            inicio=fin=nuevo;
        }
        else{
        fin.setSig(nuevo);
        }
        fin=nuevo;
    }
    public String desencolar(){
    String s=inicio.getDato();
    inicio=inicio.getSig();
        if (inicio==null) {
            fin=null;
        }
    return s;
    }
    public void mostrar(){
    Nodo Aux=inicio;
    while(Aux!=null){
        System.out.println(Aux.getDato());
        Aux=Aux.getSig();
    }
    }
    public void ColaVacia(){}
    
    
}
