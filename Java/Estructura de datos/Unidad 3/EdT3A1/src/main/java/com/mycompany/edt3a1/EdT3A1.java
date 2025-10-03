package com.mycompany.edt3a1;

import java.util.Scanner;

public class EdT3A1 {

    public static void main(String[] args) {
        int ops=0;
        Scanner leer=new Scanner(System.in);
        System.out.println("introduce la cantidad de datos a almacenar");
        int Max=leer.nextInt();
        pila objeto=new pila(Max); 
        do {
        System.out.println("menu");
        System.out.println("1.- agregar dato");
        System.out.println("2.- mostrar");
        ops=leer.nextInt();
        
        switch(ops){
            case 1->{
                System.out.println("introduce dato");
                objeto.Push(leer.next());
            }
            case 2->{
                objeto.mostrar();
            }
            case 3->{
                objeto.Pop();
            }
        
        }
        } while (ops!=4);
        
        
        
    }
}
