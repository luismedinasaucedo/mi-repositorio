package com.mycompany.edu3.colacircular;

public class Cola {
    private String Datos[];
    private int inicio,fin;

    public Cola(int T) {
        Datos = new String[T];
        inicio = fin = -1;//sin datos en la cola
    }
    public void encolar(String d){
        fin++;
        if (fin==Datos.length) {
            fin=0;
        }
        Datos[fin]=d;
        if (inicio==-1) {
            inicio=0;
        }
    }
    public String desencolar(){
        String d=Datos[inicio];
        if (inicio==fin) {
            inicio=fin=-1;
        }else{
            inicio++;
        }
        
        
    return d;
    }
    public boolean ColaVacia(){
    return inicio==fin;
    }
    public boolean ColaLlena(){
        return (inicio==0 & fin==Datos.length)||(inicio==fin+1);
    }
    



}
