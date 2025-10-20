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
    }//ingresar
    public void ruleta(){
        if (listavacia()) {
            System.out.println("la lista esta vacia");
        }
        
        
        int cantidad_con_eliminados=cantidad;
        while(!listavacia()){
            
            int num=(int)(Math.random()*(cantidad_con_eliminados-1)+1);
            System.out.println(num);
            if (inicio.getSig()==null) {
                System.out.println("gano: "+inicio.getDato());
                inicio=fin=null;
                break;
            }
            if (num==1) {
                //System.out.println("fallo?");
                String eliminado=inicio.getDato();
                inicio=inicio.getSig();
                inicio.setAnt(null);
                cantidad_con_eliminados--;
                System.out.println("se elimino a :"+eliminado);
                continue;
            }
            if (num==cantidad_con_eliminados) {
                String eliminado=fin.getDato();
                fin=fin.getAnt();
                fin.setSig(null);
                cantidad_con_eliminados--;
                System.out.println("se elimino a :"+eliminado);
                continue;
            }
            Nodo aux=inicio;
            for (int i = 1; i <= num; i++) {
                if (i==num) {
                    String eliminado=aux.getDato();
                    aux.getAnt().setSig(aux.getSig());
                    aux.getSig().setAnt(aux.getAnt());
                    cantidad_con_eliminados--;
                    System.out.println("se elimino a :"+eliminado);
                }
                
                aux=aux.getSig();
            }
            
            
        }
    
    }
    
}
