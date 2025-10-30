package com.mycompany.proyecto.caf;

import java.util.Scanner;

public class ProyectoCaf {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        ListaPlatillos plato=new ListaPlatillos();
        int ops;

        do {
            System.out.println("");
            System.out.println("\tMenu");
            System.out.println("1.- agregar platillo");
            System.out.println("2.- agregar ingredientes");
            System.out.println("3.- mostrar platillo");
            System.out.println("4.- mostrar que platillos tienen un ingrediente");
            System.out.println("5.- eliminar un platillo");
            System.out.println("6.- salir");
            System.out.println("");
            ops=leer.nextInt();
            System.out.println("");
            switch(ops){

                case 1->{
                    leer.nextLine(); 
                    System.out.println("ingresa nombre del platillo");
                    
                    plato.IngresarPlatillo(leer.nextLine());

                }

                case 2->{
                    leer.nextLine(); 
                    System.out.println("nombre del platillo en el que se va a ingresar los ingrediente");
                    String nombre=leer.nextLine();

                    System.out.println("introduce cantidad de ingredientes");
                    int cantidad=leer.nextInt();
                    leer.nextLine(); 
                    int contador=1;

                    do {

                        System.out.println("nombre del ingrediente "+contador);
                        String nombreingrediente=leer.nextLine();

                        System.out.println("cantidad del ingrediente "+contador);
                        String cantidadingrediente=leer.nextLine();
                        contador++;
                        
                        plato.IngresarIngrediente(nombre, nombreingrediente, cantidadingrediente);

                    } while (--cantidad!=0);

                }

                case 3->{

                    if (plato.ListaVacia()) {
                        System.out.println("lista vacia");
                        continue;
                    }
                    leer.nextLine(); 
                    System.out.println("nombre de platillo a buscar");
                    
                    plato.mostrar(leer.nextLine());

                }

                case 4->{

                    if (plato.ListaVacia()) {
                        System.out.println("lista vacia");
                        continue;
                    }

                    leer.nextLine(); 
                    System.out.println("introduce nombre de ingrediente");
                    
                    plato.buscaringredientes(leer.nextLine());

                }

                case 5->{

                    if (plato.ListaVacia()) {
                        System.out.println("lista vacia");
                        continue;
                    }

                    leer.nextLine(); 
                    System.out.println("nombre de platillo a eliminar");
                    
                    plato.eliminar(leer.nextLine());

                }

                case 6->{System.out.println("eligio salir...");}

            }


        } while (ops!=6);
    }
}
