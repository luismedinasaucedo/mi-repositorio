package com.mycompany.edu3.colacircular;

import java.util.Scanner;

public class EdU3Colacircular {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int ops=0;
        System.out.println(" introduce max de datos: ");
        Cola nombres=new Cola(leer.nextInt());
        do {
            System.out.println("menu");
            System.out.println("1.- agregar");
            System.out.println("2.- eliminar");
            System.out.println("3.- mostrar");
            System.out.println("4.- salir");
            ops=leer.nextInt();
            switch(ops){
                case 1->{
                    System.out.println("introduce nombre:");
                    nombres.encolar(leer.next());}
                case 2->{nombres.desencolar();}
                case 3->{nombres.mostrar();}
            
            
            }
        } while (ops!=4);
        System.out.println("");
    }
}
