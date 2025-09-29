package com.mycompany.edt3a2;

public class Pila {
private int Max;    
private int Tope;//-1 lleno
private int PilaInicial[];


    public Pila(int Max) {
        this.Max = Max;
        this.Tope = -1;
        this.PilaInicial = new int [Max];
        
    }

    public void Push(int D){
    PilaInicial[++Tope]=D;
}//agregar
public int Pop(){
    return PilaInicial[Tope--];    
}//eliminar
public void mostrar(){
    if (PilaVacia()) {
            System.out.println("la torre esta vacia");
            return;
        }
    for (int i = Tope; i >= 0; i--) {
        System.out.println(PilaInicial[i]);
    }
    
}
public boolean PilaLlena(){
    return Tope == Max-1;
}
public boolean PilaVacia(){
    return Tope == -1;
}
public int pull(){
    return PilaInicial[Tope];
}

//iniciar mover y verificar final
    public void iniciar(){
        int conta=1;
        for (int i = Tope; i == 1; i--) {
            PilaInicial[i]=conta;
            conta++;
        }
    }
    public void mostrar1(){
        for (int i = 0; i < PilaInicial.length; i++) {
            System.out.println(PilaInicial[i]);
        }
    }


}
