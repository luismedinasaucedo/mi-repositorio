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
        while(!B.PilaVacia()){
            if (B.pull()!=null) {
                if (B.pull().equals(")") || B.pull().equals("(")) {
                //System.out.println("1");
                B.eliminar();//es parentesis
            }
            else if (B.pull().equals("+") || B.pull().equals("-") || B.pull().equals("*") || B.pull().equals("/")) {
                //System.out.println("2");
             // es un operador
             C.Push(B.Pop());
             
            }
            else if (B.pull().equals("1")||B.pull().equals("2")||B.pull().equals("3")||B.pull().equals("4")||B.pull().equals("5")) { 
                //System.out.println("3");
             //es operando numero
             A.Push(B.Pop());
             contador++;
            }
                
            }
            if (contador==2) {//
                //System.out.println("4");
                A.Push(C.Pop());
                contador=0;
            }
            
        }
        if (!C.PilaVacia()) {
            A.Push(C.Pop());
        }
        A.mostrar();// (4+5)+(3-2)
    }
    
}
