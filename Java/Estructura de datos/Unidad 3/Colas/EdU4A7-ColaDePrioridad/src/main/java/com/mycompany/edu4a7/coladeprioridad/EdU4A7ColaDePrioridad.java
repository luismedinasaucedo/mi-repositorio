/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.edu4a7.coladeprioridad;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class EdU4A7ColaDePrioridad {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int ops=0;
        Cola nombres=new Cola();
        do {
            System.out.println("menu");
            System.out.println("1.- agregar");
            System.out.println("2.- eliminar");
            System.out.println("3.- mostrar");
            System.out.println("4.- salir");
            ops=leer.nextInt();
            switch(ops){
                case 1->{
                    System.out.println("introduce nombre: ");
                    String i=leer.next();
                    System.out.println("introduce la prioridad: ");
                    int e=leer.nextInt();
                    nombres.encolar(i,e);}
                case 2->{nombres.desencolar();}
                case 3->{nombres.mostrar();}
            
            
            }
        } while (ops!=4);
        System.out.println("");
    }
}
