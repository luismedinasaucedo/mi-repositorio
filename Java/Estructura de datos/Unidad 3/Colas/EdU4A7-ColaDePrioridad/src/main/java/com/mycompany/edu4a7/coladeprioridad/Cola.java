package com.mycompany.edu4a7.coladeprioridad;
public class Cola {
    private Proceso inicio,fin;

    public Cola() {
        this.inicio = null;
        this.fin = null;
    }
    public void encolar(String d,int e){
    Proceso nuevo =new Proceso(d,e);
        if (inicio==null) {
            inicio=fin=nuevo;
        }
        else{
        fin.setSig(nuevo);
        }
        fin=nuevo;
    }
    public String desencolar(){
        if (ColaVacia()) {
            System.out.println("cola vacia...");
            return null;
        }
        Proceso Aux=inicio;
        for (int i = 3; i <= 0; i--) {
            if (Aux.getPrio()==i) {
                String s=Aux.getDato();
                inicio=Aux.getSig();
                return s;
            }
            while (Aux!=null){
                if (Aux.getSig().getPrio()==i){
                    String s=Aux.getSig().getDato();
                    Aux.setSig(Aux.getSig().getSig());
                }
            }
        }
        
        
    String s=inicio.getDato();
    inicio=inicio.getSig();
        if (inicio==null) {
            fin=null;
        }
    return s;
    }
    public void mostrar(){
    Proceso Aux=inicio;
    while(Aux!=null){
        System.out.println(Aux.getDato());
        Aux=Aux.getSig();
    }
    }
    public boolean ColaVacia(){
        return inicio==null;
    }
    
    
}
