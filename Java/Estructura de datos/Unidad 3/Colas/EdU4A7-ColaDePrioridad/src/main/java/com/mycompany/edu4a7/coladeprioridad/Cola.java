package com.mycompany.edu4a7.coladeprioridad;
public class Cola {
    private Proceso inicio,fin;

    public Cola() {
        this.inicio = null;
        this.fin = null;
    }
    public void encolar(String d,int e){
    Proceso nuevo =new Proceso(d,e);
        if (inicio==null) {
            inicio=fin=nuevo;
        }
        else{
        fin.setSig(nuevo);
        }
        fin=nuevo;
    }
    public String desencolar(){
        if (inicio==null) {
            return null;
        }
    String s=inicio.getDato();
    inicio=inicio.getSig();
        if (inicio==null) {
            fin=null;
        }
    return s;
    }
    public void mostrar(){
    Proceso Aux=inicio;
    while(Aux!=null){
        System.out.println(Aux.getDato());
        Aux=Aux.getSig();
    }
    }
    public boolean ColaVacia(){
        return inicio==null;
    }
    
    
}
