package org.example;
public class Nodo {
    private int valor;
    private Nodo izq,der;

    public Nodo(int valor) {
        this.valor = valor;
        this.izq = null;
        this.der = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getIzq() {
        return izq;
    }

    public void setIzq(Nodo izq) {
        this.izq = izq;
    }

    public Nodo getDer() {
        return der;
    }

    public void setDer(Nodo der) {
        this.der = der;
    }
    
    public void Insertar(int valor){
        if (valor <this.valor) {
            //insertar en lado izq
            if (this.izq==null) {
                this.izq = new Nodo(valor);
            }else{
                this.izq.Insertar(valor);
            }
        }else{
            //insertar en der
            if (this.der==null) {
                this.der=new Nodo(valor);
            }else{
                this.der.Insertar(valor);
            }
        }
    }
    
}
