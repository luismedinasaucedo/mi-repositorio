package com.mycompany.edt3a1;

public class pila {
private int Max;//-1 inicializar
private int Tope;//-1 lleno
private String DatosPila[];

    public pila(int Max) {
        this.Max = Max;
        this.Tope = -1;
        this.DatosPila = new String[Max];
    }
//mostrar ingresar y eliminar

    public void ingresar(String D){
        DatosPila[++Tope]=D;
    }
public void Push(String D){
    DatosPila[++Tope]=D;
}//agregar
public String Pop(){
    return DatosPila[Tope--];
    
}//eliminar
public void mostrar(){
    for (int i = Tope; i >= 0; i--) {
        System.out.println("el valor en la posicion "+i+" es: "+DatosPila[i]);
    }
    
}
public boolean PilaLlena(){
    return Tope == Max-1;
}
public boolean PilaVacia(){
    return Tope == -1;
}
public String pull(){
    return DatosPila[Tope];
};

//public boolean PilaVacia();
//public boolean PilaLlena();
//public String Pull();
}
