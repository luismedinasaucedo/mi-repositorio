package com.mycompany.edu1a1;

import static java.lang.Math.random;
import java.util.Scanner;

public class Edu1A1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        int[] nume = new int[100];
        int buscar = 0;
        int n = 0;

        do {
            System.out.println("OPCIONES");
            System.out.println();

            System.out.println("[1] Generar numeros aleatorios");
            System.out.println("[2] Buscar un numero");
            System.out.println("[3] Eliminar posicion");
            System.out.println("[4] Consultar el valor de la posicion X");
            System.out.println("[5] SALIR");

            opcion = leer.nextInt();

            switch (opcion) {

                case 1:
                    long startTime = System.nanoTime();
                    System.out.println("Generando numeros...");
                    System.out.println();

                    for (int i = 0; i < n; i++) {
                        nume[i] = (int) (Math.random() * 10000) + 1;
                        System.out.println(nume[i] + " ");
                    }

                    n = 100;
                    long endTime = System.nanoTime();
                    double duracion = (endTime - startTime)/ 1_000_000.0;
                    System.out.println("tardo en ejecutarse "+duracion+" milisegundos");
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Ingresar numero");
                    buscar = leer.nextInt();

                    System.out.println();

                    for (int i = 0; i < n; i++) {
                        if (nume[i] == buscar) {
                            System.out.println("Numero [" + buscar + "] SE ENCUENTRA EN El ESPACIO [" + i + "]");

                            break;

                        }
                    }
                    break;

                case 3:
                    int eliNum = 0;

                    System.out.println("|||> Quitar una posicion para que sean 99 numeros ahora <|||");
                    System.out.println();

                    System.out.println("Ingresa el numero que quieres eliminar");
                    eliNum = leer.nextInt();

                    for (int i = 0; i < n; i++) {
                        if (nume[i] == eliNum) {
                            for (int j = i; j < n - 1; j++) { //recorro desde la posicion 0 a n-1 
                                nume[j] = nume[j + 1]; // y basicamente recorro una posicion a la izquierda
                            }
                            n--; // y aqui redusco el tasmaño
                            System.out.println("Numero: [" + eliNum + "] eliminado... :D");

                            for (int k = 0; k < n; k++) {
                                System.out.print(nume[k] + " ");
                            }

                            break;

                        }

                    }

                    break;

                case 4:

                    int bp;
                    System.out.println("[Ingresar una posicion para saber su valor]");
                    System.out.println();
                    bp = leer.nextInt();
                   
                    for (int i = 0; i < n; i++) {
                        
                        if(i == bp){
                            
                            System.out.println("Valor de la posicion: ["+nume[i]+"]");
                            
                        }

                    }
                    break;

            }

        } while (opcion != 5);
    }
}

