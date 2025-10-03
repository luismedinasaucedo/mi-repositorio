package com.mycompany.edt3a4.colas;

import java.util.Scanner;

public class EdT3A4Colas {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int ops=0;
        System.out.println("escribe el tamaño de la cola");
        Cola nombres=new Cola(leer.nextInt());
        do {
            System.out.println("1.- añadir dato");
            System.out.println("2.- eliminar dato");
            System.out.println("3.- salir");
            ops=leer.nextInt();
            switch(ops){
            case 1->{
                System.out.println("ingresa el nombre");
                String d=leer.next();
                nombres.Encolar(d);
            }
            case 2->{
                nombres.Desencolar();
            }
            case 3->{System.out.println("eligio salir");}
            case 4->{nombres.mostrar();}
            
        
        }
        } while (ops!=3);
        
        
        
    }
}
