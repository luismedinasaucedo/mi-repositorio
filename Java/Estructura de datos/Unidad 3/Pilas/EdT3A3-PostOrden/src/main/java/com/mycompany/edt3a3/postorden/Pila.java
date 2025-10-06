package com.mycompany.edt3a3.postorden;
public class Pila {
private int Max;    
private int Tope;//-1 lleno
private String PilaInicial[];


    public Pila(int Max) {
        this.Max = Max;
        this.Tope = -1;
        this.PilaInicial = new String [Max];
        
    }

    public void Push(String D){
    PilaInicial[++Tope]=D;
}//agregar
public String Pop(){
        return PilaInicial[Tope--];
    }//eliminar
    public String eliminar(){
    Tope--;
        if (Tope==-1) {
            return PilaInicial[0];
        }else {return PilaInicial[Tope];}
    }
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
public String pull(){
    if (Tope==-1) {
        return null;
    }
    return PilaInicial[Tope];
}

}
