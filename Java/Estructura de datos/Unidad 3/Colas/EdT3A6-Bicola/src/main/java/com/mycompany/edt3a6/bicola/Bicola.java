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
    public String eliminaralfrente(){return null;}
    public String eliminaralfin(){return null;}
    public boolean colavacia(){
        return Inicio==null;
    }
    public void mostrar(){
        int i=1;
    Nodo Aux=Inicio;
    while(Aux!=null){
        System.out.println(i+".-"+Aux.getDato());
        Aux=Aux.getSig();
        i++;
    }
    }
    
    
    
}
