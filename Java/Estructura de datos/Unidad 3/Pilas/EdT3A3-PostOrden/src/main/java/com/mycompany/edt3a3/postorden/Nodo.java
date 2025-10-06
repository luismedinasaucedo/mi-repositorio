package com.mycompany.edt3a3.postorden;
public class Nodo {
    private String dato;
    private Nodo anterior;

    public Nodo() {
    }

    public Nodo(String dato, Nodo anterior) {
        this.dato = dato;
        this.anterior = anterior;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
    
}
