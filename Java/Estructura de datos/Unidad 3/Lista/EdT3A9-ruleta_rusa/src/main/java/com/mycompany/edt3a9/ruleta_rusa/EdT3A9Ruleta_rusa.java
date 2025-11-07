package com.mycompany.edt3a9.ruleta_rusa;

import java.util.Scanner;

public class EdT3A9Ruleta_rusa {

    public static void main(String[] args) {
        int ops=0;
        Scanner leer=new Scanner (System.in);
        Lista datos=new Lista();
        do {
            System.out.println("menu");
            System.out.println("1.- ingresar nombres");
            System.out.println("2.- ruleta rusa");
            System.out.println("3.- salir");
            ops=leer.nextInt();
            System.out.println("");
            switch(ops){
                case 1->{datos.ingresar();
                }
                case 2->{datos.ruleta();}
                case 3->{System.out.println("eligio salir");}
            }
            
        } while (ops!=3);
    }
}
