package com.mycompany.edt3a4.colas;

public class Cola {
private String ColaInicial[];
private int Max,inicio,fin,numcola;

    public Cola(int Max) {
        this.Max = Max;
        this.ColaInicial = new String[Max];
        this.inicio = 0;
        this.fin = 0;
        this.numcola = 0;
    }
    public void Encolar(String d){
        if (ColaLlena()) {
            System.out.println("no se puede agregar dato: cola llena");
        }
        else {
            ColaInicial[fin]=d;
            fin=(fin+1)%Max;
        }
    }
    
    public String Desencolar(){
        if (ColaVacia()) {
            System.out.println("no se puede eliminar dato: Cola vacia");
            return null; 
        }else {
        String valor = ColaInicial[inicio];
        inicio = (inicio + 1) % Max; 
        return valor;
        }
        }
    public boolean ColaVacia(){
        return inicio==fin;
    }
    public boolean ColaLlena(){
    return (fin+1)%Max==inicio;
    
    }
    public void mostrar(){
        if (ColaVacia()) {
            System.out.println("la cola esta vacia");
            return;
        }else {
        int i= inicio;
            while(i!=fin){
            System.out.println("cola: "+ColaInicial[i]);
            i++;
            }
        }
            
        }
    }
    

