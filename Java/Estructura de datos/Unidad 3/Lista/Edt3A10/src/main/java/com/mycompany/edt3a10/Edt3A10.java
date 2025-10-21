package com.mycompany.edt3a10;

import java.util.Scanner;

public class Edt3A10 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Arreglo A=new Arreglo(5);
        int ops=0;
        do {
            System.out.println("Menu");
        System.out.println("1.- agregar");
        System.out.println("2.- mostrar");
        System.out.println("3.-borrar");
        System.out.println("4.-salir");
        ops=leer.nextInt();
        switch(ops){
            case 1->{
                System.out.println("introduce numero de incide");
                int indice=leer.nextInt();
                System.out.println("introduce dato");
                int dato=leer.nextInt();
                A.Agregar(indice, dato);}
            case 2->{System.out.println("introduce indice a mostrar");
                int indice=leer.nextInt();
            A.Mostrar(indice);
            }
            case 3->{
                System.out.println("introduce numero de incide");
                int indice=leer.nextInt();
                A.Eliminar(indice);
            }
        
        }
        } while (ops!=4);
        
        

        
    }
}
