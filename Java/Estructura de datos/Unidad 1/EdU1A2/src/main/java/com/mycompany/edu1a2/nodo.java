package com.mycompany.edu1a2;

public class nodo {
    int numero;
    nodo Liga;

    public nodo() {
    }

    public nodo(int numero, nodo Liga) {
        this.numero = numero;
        this.Liga = Liga;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public nodo getLiga() {
        return Liga;
    }

    public void setLiga(nodo Liga) {
        this.Liga = Liga;
    }
    
    
    
}