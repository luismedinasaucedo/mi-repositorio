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
            System.out.println("la cola esta vacia...");
            return null;
        }
        for (int i = 4; i >= 0; i--) {
            Proceso Aux=inicio;
             if (Aux.getPrio()==i) {
                String s=Aux.getDato();
                inicio=Aux.getSig();
                return s;
            }
            //System.out.println("1");
            Aux=inicio;
            while (Aux!=null){
                //System.out.println("2");
                if (Aux.getSig()==null) {
                    break;
                }
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
        if (ColaVacia()) {
            System.out.println("la cola esta vacia...");
        }
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
    public void mostrarconprio(){
        if (ColaVacia()) {
            System.out.println("la cola esta vacia...");
            return;
        }
        for (int i = 4; i >= 0; i--) {
            Proceso Aux=inicio;
             if (Aux.getPrio()==i) {
                System.out.println("Dato     : "+Aux.getDato());
                System.out.println("Prioridad: "+Aux.getPrio());
            }
            //System.out.println("1");
            Aux=inicio;
            while (Aux!=null){
                //System.out.println("2");
                if (Aux.getSig()==null) {
                    break;
                }
                if (Aux.getSig().getPrio()==i){
                    System.out.println("Dato      : "+Aux.getSig().getDato());
                    System.out.println("Prioridad: "+Aux.getSig().getPrio());
                    //System.out.println("1");
                    //String s=Aux.getSig().getDato();
                    //Aux.setSig(Aux.getSig().getSig());
                    //return s;
                }//if
                Aux=Aux.getSig();
            }//while
        }//for
    
    }
    
}
//if (Aux.getPrio()==i) {
                //String s=Aux.getDato();
                //inicio=Aux.getSig();
                //return s;
            //}