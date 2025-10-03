package com.mycompany.edu1a2;

import java.util.Scanner;

public class EdU1A2 {
    Scanner leer=new Scanner(System.in);
    public static void main(String[] args) {
        int ops=0;
        Lista objeto =new Lista();
        Scanner leer=new Scanner(System.in);
        do {
            System.out.println("menu");
            System.out.println("1.- generar");
            System.out.println("2.- mostrar");
            System.out.println("3.- buscar");
            System.out.println("4.- eliminar");
            System.out.println("5.- buscar por indice");
            System.out.println("6.- salir");
            ops=leer.nextInt();
            switch(ops){
                case 1->{objeto.generarnumerosaleatorios();}
                case 2->{objeto.mostrarnumerosaleatorios();}
                case 3->{objeto.buscar();}
                case 4->{objeto.eliminar();}
                case 5->{objeto.buscarporindice();}
                case 6->{
                    System.out.println("introduce num a buscar");
                    int num=leer.nextInt();
                    objeto.eliminarnumero(num);}
                
            
            }
        } while (ops!=7);
    }
}