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
        
        for (int i = 4; i <= 0; i--) {
            Proceso Aux=inicio;
            //if (Aux.getPrio()==i) {
                //String s=Aux.getDato();
                //inicio=Aux.getSig();
                //return s;
            //}
            while (Aux!=null){
                if (Aux.getSig().getPrio()==i){
                    System.out.println("1");
                    String s=Aux.getSig().getDato();
                    Aux.setSig(Aux.getSig().getSig());
                    return s;
                }
                Aux=Aux.getSig();
            }
        }
        return null;
    }
    public void mostrar(){
    Proceso Aux=inicio;
    while(Aux!=null){
        System.out.println("Dato     : "+Aux.getDato());
        System.out.println("Prioridad: "+Aux.getPrio());
        System.out.println("");
        Aux=Aux.getSig();
    }
    }
    public boolean ColaVacia(){
        return inicio==null;
    }
    
    
}
