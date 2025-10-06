package com.mycompany.edu3.colacircular;

public class Cola {
    private String Datos[];
    private int inicio,fin,max;

    public Cola(int max) {
        Datos = new String[max];
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
        if (ColaVacia()) {
            return null;
        }
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
    
 public void mostrar(){
     if (ColaVacia()) {
         return;
     }
     int i=inicio;
     do {
         if (i==max) {
             i=0;
         }
         System.out.println(Datos[i]);
         i++;
     } while (i!=fin+1);
 }


}
