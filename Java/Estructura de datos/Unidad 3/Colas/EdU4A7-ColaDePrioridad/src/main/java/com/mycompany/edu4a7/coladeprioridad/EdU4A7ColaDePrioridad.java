package com.mycompany.edu4a7.coladeprioridad;

import java.util.Scanner;
public class EdU4A7ColaDePrioridad {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int ops=0;
        Cola nombres = new Cola();
        nombres.encolar("Luis",1);
        nombres.encolar("Javier",3);
        nombres.encolar("jose",2);
        do {
            System.out.println("");
            System.out.println("\tmenu");
            System.out.println("1.- agregar");
            System.out.println("2.- eliminar");
            System.out.println("3.- mostrar");
            System.out.println("4.- salir");
            System.out.println("5.- mostrar con prio");
            ops=leer.nextInt();
            System.out.println("");
            switch(ops){
                
                case 1->{
                    System.out.println("introduce nombre: ");
                    String i=leer.next();
                    System.out.println("introduce la prioridad: ");
                    int e=leer.nextInt();
                    nombres.encolar(i,e);}
                
                case 2->{nombres.desencolar();}
                
                case 3->{nombres.mostrar();}
                case 5->{nombres.mostrarconprio();}
            
            
            }
        } while (ops!=4);
        System.out.println("");
    }
}
