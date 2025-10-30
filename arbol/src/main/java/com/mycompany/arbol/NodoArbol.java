package com.mycompany.arbol;

public class NodoArbol {
    private int clave;
    private NodoArbol izq,der;

    public NodoArbol(int clave) {
        this.clave = clave;
        this.izq = null;
        this.der = null;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public NodoArbol getIzq() {
        return izq;
    }

    public void setIzq(NodoArbol izq) {
        this.izq = izq;
    }

    public NodoArbol getDer() {
        return der;
    }

    public void setDer(NodoArbol der) {
        this.der = der;
    }
    
    
    
}
