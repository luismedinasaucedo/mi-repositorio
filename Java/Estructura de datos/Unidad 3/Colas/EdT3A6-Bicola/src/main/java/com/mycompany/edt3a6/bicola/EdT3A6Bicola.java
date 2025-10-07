package com.mycompany.edt3a6.bicola;

import java.util.Scanner;

public class EdT3A6Bicola {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Bicola cola=new Bicola();
        int ops=0;
        while(ops!=6){
            System.out.println("");
            System.out.println("\tMenu");
            System.out.println("1.- añadir dato al principio \n2.- añadir dato al final \n3.- eliminar dato al principio \n4.- eliminar dato al final \n5.- Mostrar datos\n6.- salir");
            ops=leer.nextInt();
            switch(ops){
                case 1->{
                    System.out.println("escribe al dato a insertar");
                    cola.insertaralfrente(leer.next());
                    }
                case 2->{
                    System.out.println("escribe el dato a insertar");
                    cola.insertaralfinal(leer.next());
                }
                case 3->{cola.eliminaralfrente();}
                case 4->{cola.eliminaralfin();}
                case 5->{cola.mostrar();}
                case 6->{System.out.println("Eligio salir...");}
            }
        }
        
    }
}
