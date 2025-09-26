package com.mycompany.preexamentema1;

public class Nodo {
     int dato;
    Nodo anterior;

    public Nodo() {
    }

    public Nodo(int dato, Nodo anterior) {
        this.dato = dato;
        this.anterior = anterior;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
    
    

    
    
}