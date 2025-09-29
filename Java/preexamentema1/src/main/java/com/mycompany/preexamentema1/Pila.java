package com.mycompany.preexamentema1;

public class Pila {
private Nodo tope;

    public Pila() {
        this.tope = null;
    }

    public Nodo getTope() {
        return tope;
    }

    public void setTope(Nodo tope) {
        this.tope = tope;
    }
public void push(int d){
    tope=new Nodo(d,tope);
}
public void pop(){
tope=tope.getAnterior();
}
public int pull(){
    if (tope==null) {
        return 0;
    }
return tope.getDato();}
}
