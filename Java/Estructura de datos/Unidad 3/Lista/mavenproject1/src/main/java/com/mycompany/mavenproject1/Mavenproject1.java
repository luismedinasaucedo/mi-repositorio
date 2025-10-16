package com.mycompany.mavenproject1;

import java.util.Scanner;

public class Mavenproject1 {

    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        int ops=0;
        Lista nombres=new Lista();
        nombres.insertar("bruno");
        nombres.insertar("alex");
        nombres.insertar("carlo");
        nombres.insertar("belen");
        do {
            System.out.println("menu");
            System.out.println("1.- agregar");
            System.out.println("2.- eliminar");
            System.out.println("3.- mostrar");
            System.out.println("4.- salir");
            ops=leer.nextInt();
            System.out.println("");
            switch(ops){
                case 1->{
                    System.out.println("introduce nombre:");
                    nombres.insertar(leer.next());}
                case 2->{}
                case 3->{nombres.mostrar();}
            
            
            }
        } while (ops!=4);
        System.out.println("");
        
        
    }
}
