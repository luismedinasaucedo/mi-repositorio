package com.mycompany.edu1a2;

import java.util.Scanner;

public class Lista {
    Scanner leer=new Scanner(System.in);
    nodo Cabecera;
    double duracion;
    public Lista() {
        this.Cabecera = null;
    }
    public void generarnumerosaleatorios(){
        duracion =0;
        long startTime = System.nanoTime();
        
            for (int i = 0; i < 100; i++) {
            Cabecera = new nodo((int)(Math.random()*10000)+1,Cabecera);
        }
        
        long endTime = System.nanoTime();
        duracion = ((endTime - startTime)/ 1_000_000.0);
        System.out.println("tardo en ejecutarse "+duracion+" milisegundos");
    }//generar num
    public void mostrarnumerosaleatorios(){
            nodo aux=Cabecera;//1
        int i=1;
        while(aux!=null){
            System.out.println(i+" "+aux.getNumero());//2
            aux=aux.getLiga();//3
            i++; 
            }
    }//mostrar num
    public void buscar(){
        
    int Buscar=0;
    System.out.println("elige el numero a buscar");
    Buscar=leer.nextInt();
        duracion =0;
        long startTime = System.nanoTime();
        for (int e = 0; e < 10; e++) {
            nodo aux=Cabecera;
            int i=1;
        while(aux!=null){
            
            if (Buscar==aux.getNumero()) {
            System.out.println("el numero se encontro en la pocicion "+i);
            break;
            }
            aux=aux.getLiga();
            i++;
            }//O(n)
        }
        long endTime = System.nanoTime();
        duracion = ((endTime - startTime)/ 1_000_000.0)/10+duracion;
        System.out.println("tardo en ejecutarse "+duracion+" milisegundos");
    }//buscar
    
    public void eliminar() {
    System.out.println("Elige el número a eliminar:");
    int Buscar = leer.nextInt();

    nodo aux= Cabecera;
    nodo anterior = null;

    while (aux != null) {
        if (aux.getNumero() == Buscar) {
            if (anterior == null) {
                
                Cabecera = aux.getLiga();
            } else {
                
                anterior.setLiga(aux.getLiga());
            }
            System.out.println("Número eliminado correctamente.");
            return;
        }
        anterior = aux;
        aux = aux.getLiga();
    }

    System.out.println("Número no encontrado.");
}//eliminar
    
    public void buscarporindice(){
        System.out.println("introduce indice de numero a buscar");
        int buscar=leer.nextInt();
        System.out.println("");
        duracion =0;
        long startTime = System.nanoTime();
        
        for (int e = 0; e < 10; e++) {
            nodo aux=Cabecera;
            int i=1;
        while(aux!=null){
            if (i==buscar) {
                System.out.println("el numero que buscas en la posicion "+i+" es "+aux.getNumero());
                break;
            }
             i++;
            aux=aux.getLiga();
        }
        }
        long endTime = System.nanoTime();
        duracion = ((endTime - startTime)/ 1_000_000.0)/10+duracion;
        System.out.println("tardo en ejecutarse "+duracion+" milisegundos");
    }//buscar por indice
    public void eliminarnumero(int num){
        duracion =0;
        long startTime = System.nanoTime();
        if (Cabecera==null) {
            System.out.println("lista vacia");
            long endTime = System.nanoTime();
        duracion = ((endTime - startTime)/ 1_000_000.0);
        System.out.println("tardo en ejecutarse "+duracion+" milisegundos");
            return;
        }//no se generaron los numeros 
        if (Cabecera.getNumero()==num) {
            Cabecera=Cabecera.getLiga();
            long endTime = System.nanoTime();
        duracion = ((endTime - startTime)/ 1_000_000.0);
        System.out.println("tardo en ejecutarse "+duracion+" milisegundos");
            return;
        }//el numero a eliminar es el primero
        nodo aux=Cabecera;
        while(aux!=null){
            if (aux.getLiga().getNumero()==num) {
                //actualizar la liga
                aux.setLiga(aux.getLiga().getLiga());
                long endTime = System.nanoTime();
        duracion = ((endTime - startTime)/ 1_000_000.0);
        System.out.println("tardo en ejecutarse "+duracion+" milisegundos");
                return;
            }
            aux=aux.getLiga();
        }//el numero a eliminar no es el primero
        
    }//eliminar2
}