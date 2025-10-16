package com.mycompany.mavenproject1;

public class Lista {
    private Nodo inicio;
    private Nodo fin;

    public Lista() {
        this.inicio = null;
        this.fin = null;
    }
    
    public boolean listavacia(){
    return inicio==null;
    }
    
    public void insertar(String dato){
        Nodo nuevo=new Nodo(dato);
        if (listavacia()) {
            inicio=fin=nuevo;
            return;
        }//si esta vacia
        if ((int)inicio.getDato().charAt(0)>=(int)nuevo.getDato().charAt(0)) {
            inicio.setAnt(nuevo);
            nuevo.setSig(inicio);
            inicio=nuevo;
            return;
        }//si esta al inicio
        if ((int)fin.getDato().charAt(0)<(int)nuevo.getDato().charAt(0)) {
            fin.setSig(nuevo);
            nuevo.setAnt(fin);
            fin=nuevo;
            return;
        }//si esta al final
        Nodo aux=inicio;
        while(aux!=null){
            //System.out.println(aux.getDato());
            if ((int)aux.getDato().charAt(0)>=(int)nuevo.getDato().charAt(0)) {
                //System.out.println("14");
                aux.getSig().setAnt(nuevo);
                nuevo.setSig(aux.getSig());
                aux.setSig(nuevo);
                nuevo.setAnt(aux);
                
                return;
            }
            aux=aux.getSig();
        }
    }
    public void mostrar(){
    Nodo Aux=inicio;
    int i=1;
    while(Aux!=null){
        System.out.println(i+": "+Aux.getDato());
        Aux=Aux.getSig();
        i++;
    }
        System.out.println("");
    }
    
    
    
}
