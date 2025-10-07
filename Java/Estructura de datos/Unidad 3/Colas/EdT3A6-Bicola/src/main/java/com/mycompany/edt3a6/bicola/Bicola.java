package com.mycompany.edt3a6.bicola;

public class Bicola {
    private Nodo Inicio,Fin;

    public Bicola() {
        this.Inicio = null;
        this.Fin = null;
    }
    
    public void insertaralfrente(String d){
        Nodo Cola=new Nodo(d);
        if (colavacia()) {
            Inicio=Fin=Cola;
        }
        else{
            Inicio.setAnt(Cola);
            Cola.setSig(Inicio);
            Inicio=Cola;
            
        }
        
    }
    public void insertaralfinal(String d){
        Nodo Cola=new Nodo(d);
        if (colavacia()) {
            Inicio=Fin=Cola;
        }
        else{
            Fin.setSig(Cola);
            Cola.setAnt(Fin);
            Fin=Cola;
        }
        
        
        
    }
    public String eliminaralfrente(){
        if (colavacia()) {
            System.out.println("la cola esta vacia...");
            return null;
        }
        String s=Inicio.getDato();
        Inicio=Inicio.getSig();
        if (Inicio==null) {
            Fin=null;
            System.out.println("la cola quedo vacia...");
            return s    ;
        }
        Inicio.setAnt(null);
        return s;
        
    }
    public String eliminaralfin(){
        if (colavacia()) {
            System.out.println("la cola quedo vacia...");
            return null;
        }
        String s=Fin.getDato();
        Fin=Fin.getAnt();
        if (Fin==null) {
            Inicio=null;
            return s;
        }
        Fin.setSig(null);
        return s;}
    public boolean colavacia(){
        return Inicio==null;
    }
    public void mostrar(){
        if (colavacia()) {
            System.out.println("la cola esta vacia...");
            return;
        }
        int i=1;
    Nodo Aux=Inicio;
    while(Aux!=null){
        System.out.println(i+".-"+Aux.getDato());
        Aux=Aux.getSig();
        i++;
    }
    }
    
    
    
}
