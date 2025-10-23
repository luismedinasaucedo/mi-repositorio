package com.mycompany.edt3a9.ruleta_rusa;

import java.util.Scanner;

public class Lista {
    Scanner leer=new Scanner(System.in);
    private Nodo inicio;
    private Nodo fin;
    private int cantidad=0;

    public Lista() {
        this.inicio = null;
        this.fin = null;
    }
    
    public boolean listavacia(){
    return inicio==null;
    }
    
    public void ingresar(){
        inicio=fin=null;
        System.out.println("introduce cantidad nombres a ingresar");
        cantidad=leer.nextInt();
        
        for (int i = 1; i <= cantidad; i++) {
            System.out.println("introduce el dato "+i);
            Nodo nuevo=new Nodo(leer.next());
            if (listavacia()) {
                inicio=fin=nuevo;
                continue;
            }
            nuevo.setAnt(fin);
            fin.setSig(nuevo);
            fin=nuevo;
        }
        inicio.setAnt(fin);
        fin.setSig(inicio);
    }//ingresar
    public void ruleta(){
        if (listavacia()) {
            System.out.println("la lista esta vacia");
        }
        
        while(cantidad!=1){
            int num=(int)(Math.random()*(6-1)+1);
            Nodo aux=inicio;
            for (int i = 0; i <= num; i++) {
                aux=aux.getSig();
            }
            if (aux==inicio) {
                System.out.println("se elimino a: "+aux.getDato());
                inicio=inicio.getSig();
                inicio.setAnt(fin);
                fin.setSig(inicio);
                cantidad--;
            }//esta al inicio
            else if(aux==fin){
                System.out.println("se elimino a: "+aux.getDato());
                fin=fin.getAnt();
                fin.setSig(inicio);
                inicio.setAnt(fin);
                cantidad--;
            }
            else{
                System.out.println("se elimino a: "+aux.getDato());
                aux.getAnt().setSig(aux.getSig());
                aux.getSig().setAnt(aux.getAnt());
                cantidad--;
            }
            
            
        }
        System.out.println("");
        System.out.println("el ganador es: "+inicio.getDato());
    }
    
}
