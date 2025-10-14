package com.mycompany.mavenproject1;

public class Nodo {
    private String dato;
    private Nodo sig;
    private Nodo ant;

    public Nodo(String dato) {
        this.dato = dato;
        this.sig = null;
        this.ant = null;
    }

    public Nodo(String dato, Nodo sig, Nodo ant) {
        this.dato = dato;
        this.sig = null;
        this.ant = null;
    }

    
    
    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }

    public Nodo getAnt() {
        return ant;
    }

    public void setAnt(Nodo ant) {
        this.ant = ant;
    }
    
    
    
    
    
    
}
