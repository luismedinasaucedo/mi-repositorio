package com.mycompany.edt3a3.postorden;

import java.util.Scanner;

public class EdT3A3PostOrden {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("escribe la operacion matematica que quieres poner en postorden");
        String Operacion=leer.next();
        Pila Base=new Pila(Operacion.length());
        Pila Auxiliar=new Pila(Operacion.length());
        Pila Operadores=new Pila(Operacion.length());
        
        
        llenar(Operacion,Base);
        Base.mostrar();
        System.out.println("-------------------------");
        preorden(Auxiliar,Base,Operadores);
        
        
    }
    static void llenar(String D,Pila E){
        for (int i = 0; i < D.length(); i++) {
            E.Push(Character.toString(D.charAt(i)));
        }
    }
    static void preorden(Pila A,Pila B,Pila C){
        int contador=0;
        while(!A.PilaLlena()){
            if (B.pull().equals("+") || B.pull().equals("-")) {
             // es un operador
             C.Push(B.Pop());
             contador=2;
            }
            if (!B.pull().equals("+") && !B.pull().equals("-")) {  
             //no es operando
             A.Push(B.Pop());
            }
            if (contador%2==0&&contador!=0) {
                A.Push(C.Pop());
                contador=0;
            }

        }
        A.mostrar();
    }
    
}
