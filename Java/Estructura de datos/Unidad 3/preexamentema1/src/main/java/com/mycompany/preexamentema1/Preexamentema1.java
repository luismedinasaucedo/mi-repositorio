package com.mycompany.preexamentema1;

import java.util.Scanner;

public class Preexamentema1 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("");
        Pila objeto=new Pila();
        int ops=0;
        do {
            System.out.println("menu");
            System.out.println("1.- agregar numero");
            System.out.println("2.- eliminar");
            System.out.println("3.- mostrar");
            ops=leer.nextInt();
            switch(ops){
            case 1->{
                System.out.println("introduce numero");
                objeto.push(leer.nextInt());
                
            }
            case 2->{objeto.pop();}
            case 3->{System.out.println(objeto.pull());}
        }
        } while (ops!=4);
        
    }
}
