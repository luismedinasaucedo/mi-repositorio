package com.mycompany.edt3a9.ruleta_rusa;

import java.util.Scanner;

public class Lista {
    Scanner leer=new Scanner(System.in);
    private Nodo cabecera;
    private int cantidad=0;

    public Lista() {
        this.cabecera = null;
        this.cabecera = null;
    }
    
    public boolean listavacia(){
    return cabecera==null;
    }
    
    public void ingresar(){
        cabecera=null;
        System.out.println("introduce cantidad nombres a ingresar");
        cantidad=leer.nextInt();
        
        for (int i = 1; i <= cantidad; i++) {
            System.out.println("introduce el dato "+i);
            Nodo nuevo=new Nodo(leer.next());
            if (listavacia()) {
                cabecera=nuevo;
                continue;
            }
            nuevo.setAnt(cabecera);
            cabecera.setSig(nuevo);
            cabecera=nuevo;
        }
        Nodo aux=cabecera;
            while(aux.getAnt()!=null){
                aux=aux.getAnt();
            }
            
        
        
        aux.setAnt(cabecera);
        cabecera.setSig(aux);
    }//ingresar
    public void ruleta(){
        if (listavacia()) {
            System.out.println("la lista esta vacia");
        }
        
        while(cantidad!=1){
            int num=(int)(Math.random()*6)+1;
            Nodo aux=cabecera;
            for (int i = 0; i <= num; i++) {
                aux=aux.getSig();
            }
            if (aux==cabecera) {
                System.out.println("se elimino a: "+aux.getDato());
                cabecera=cabecera.getSig();
                cabecera.setAnt(cabecera.getAnt().getAnt());
                cantidad--;
            }//esta al inicio
            
            else{
                System.out.println("se elimino a: "+aux.getDato());
                aux.getAnt().setSig(aux.getSig());
                aux.getSig().setAnt(aux.getAnt());
                cantidad--;
            }// esta enmedio
            
            
        }
        System.out.println("");
        System.out.println("el ganador es: "+cabecera.getDato());
    }
    public void mostrar(){
        Nodo aux=cabecera;
        while(aux!=null){
            System.out.println(aux.getDato());
            aux=aux.getSig();
                    
    }
    
    
    }
    
}
