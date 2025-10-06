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
            Inicio=Cola;
        }
        
    }
    public void insertaralfinal(){}
    public String eliminaralfrente(){return null;}
    public String eliminaralfin(){return null;}
    public boolean colavacia(){
        return Inicio==null;
    }
    
    
    
}
