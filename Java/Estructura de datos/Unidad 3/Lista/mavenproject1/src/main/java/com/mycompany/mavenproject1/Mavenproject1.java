package com.mycompany.mavenproject1;

import java.util.Scanner;

public class Mavenproject1 {

    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        int ops=0;
        Lista nombres=new Lista();
        
        do {
            System.out.println("menu");
            System.out.println("1.- agregar");
            System.out.println("2.- eliminar");
            System.out.println("3.- mostrar");
            System.out.println("4.- modificar");
            System.out.println("5.- salir");
            ops=leer.nextInt();
            System.out.println("");
            switch(ops){
                case 1->{
                    System.out.println("introduce nombre:");
                    nombres.insertar(leer.next());}
                case 2->{
                    System.out.println("introduce nombre a eliminar");
                    nombres.borrar(leer.next());
                    System.out.println("");
                }
                case 3->{nombres.mostrar();}
                case 4->{
                    System.out.println("introduce nombre a modificar");
                    String s1=leer.next(),s2;
                    System.out.println("introduce nombre final");
                    s2=leer.next();
                    nombres.modificar(s1,s2);
                    System.out.println("");
                }
                case 5->{System.out.println("eligio salir...");}
            
            
            }
        } while (ops!=5);
        System.out.println("");
        
        
    }
}
