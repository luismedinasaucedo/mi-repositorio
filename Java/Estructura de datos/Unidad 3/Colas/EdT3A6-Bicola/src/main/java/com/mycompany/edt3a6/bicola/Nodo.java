package com.mycompany.edt3a6.bicola;

public class Nodo {
    private String Dato;
    private Nodo sig;
    private Nodo ant;

    public Nodo(String Dato) {
        this.Dato = Dato;
        this.sig=null;
        this.ant=null;
    }

    public String getDato() {
        return Dato;
    }

    public void setDato(String Dato) {
        this.Dato = Dato;
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