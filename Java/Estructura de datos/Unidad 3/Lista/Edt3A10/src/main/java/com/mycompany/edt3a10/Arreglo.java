package com.mycompany.edt3a10;

public class Arreglo {
private Nodo inicio,Fin;
private int cantidad;

    public Arreglo(int cantidad) {
        this.inicio=null;
        this.Fin=null;
        this.cantidad = cantidad;
        for (int i = 0; i < cantidad; i++) {
            Nodo arreglo=new Nodo(i);
            if (inicio==null) {
                inicio=Fin=arreglo;
            }
            else{
                Fin.setSig(arreglo);
                Fin=arreglo;
            }
        }
    }
    
    public void Agregar(int indice,int dato){
        Nodo Aux=inicio;
        for (int i = 0; i < indice; i++) {
            Aux=Aux.getSig();
        }
        Aux.setDato(dato);
        
    }
    public void Mostrar(int indice){
        Nodo Aux=inicio;
        for (int i = 0; i < indice; i++) {
            Aux=Aux.getSig();
        }
        System.out.println(Aux.getDato());
    }
    public void Eliminar(int indice){
    Nodo Aux=inicio;
        for (int i = 0; i < indice; i++) {
            Aux=Aux.getSig();
        }
        Aux.setDato(0);
    
    }
    
    





}

