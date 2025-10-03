package com.mycompany.edt3a5.coladinamica;

public class Nodo {
    private String Dato;
    private Nodo sig;

    public Nodo(String Dato) {
        this.Dato = Dato;
        this.sig=null;
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
    
    
    
    
}
