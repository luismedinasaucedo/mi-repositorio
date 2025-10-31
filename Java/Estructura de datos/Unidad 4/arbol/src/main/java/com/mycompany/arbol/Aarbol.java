package com.mycompany.arbol;

import java.util.Scanner;

public class Aarbol {
    private NodoArbol Raiz;

    public Aarbol() {
        this.Raiz = null;
    }
    
    public void insertar(int c){
        if (Raiz==null) {
            Raiz = new NodoArbol(c);
            return;
        }
        NodoArbol aux=Raiz;
        while(true){
            
            if (aux.getClave()<c) {
                if (aux.getDer()==null) {
                    aux.setDer(new NodoArbol(c));
                    break;
                }
                aux=aux.getDer();
            }
            else if(aux.getClave()>c){
                if (aux.getIzq()==null) {
                    aux.setIzq(new NodoArbol(c));
                    break;
                }
                aux=aux.getIzq();
            }
            else{System.out.println("no se puede agregar: clave igual");}
        }
    }
    
    public void ImprimirINorden(NodoArbol x){ //NOTA: Cuando usas llaves en if lo que hace el programa es ejecutar 1 sola instrucción, si no las pones ejecuta varias, osease como en nuestro caso.
        if(x.getDer()!=null) 
            ImprimirINorden(x.getDer());
        System.out.println(x.getClave()+" ");
        if(x.getIzq()!=null) 
            ImprimirINorden(x.getIzq());
    }
    
      void ImprimePosOrden(NodoArbol aux){
        if (aux.getDer()!= null) 
            ImprimePosOrden(aux.getDer());
        
            System.out.println(aux.getClave());
            
        if (aux.getIzq()!= null) 
            ImprimePosOrden(aux.getIzq());
    }
      
      void ImprimerPreOrden(NodoArbol aux){
        System.out.println(aux.getClave());
        
        if (aux.getIzq()!= null) 
            ImprimerPreOrden(aux.getIzq());    
        if (aux.getDer()!= null) 
            ImprimerPreOrden(aux.getDer());
    }
    
    
    
    public void mostrar(){
    Scanner leer=new Scanner(System.in);
    int menu;
        do {
            System.out.println("1.-inorden"
                + "\n2.-preorden"
                + "\n3.-postorden");
            menu=leer.nextInt();
            switch(menu){
                case 1->{ImprimirINorden(Raiz);}
                case 2->{System.out.println(buscar(Raiz,leer.nextInt(),0));}
                case 3->{}
            }
        } while (menu!=4);
    }
    public int buscar(NodoArbol x,int c,int contador){
        if (x.getClave()==c) {
            return contador;
        }
        if (c<x.getClave()) {
            buscar(x.getIzq(),c,contador++);
        }
        else{
            buscar(x.getDer(),c,contador++);
        }
        return contador;
    }
    public void elmininar(int buscar){
        NodoArbol aux=Raiz;
        do {
            if (aux.getClave()==buscar) {
                
            }//compara si es el numero a buscar
            if (buscar<aux.getClave()) {
                aux=aux.getIzq();
            }
            else{aux=aux.getDer();}
            if (aux==null) {
                break;
            }
        } while (true);
    
    };
    
}
