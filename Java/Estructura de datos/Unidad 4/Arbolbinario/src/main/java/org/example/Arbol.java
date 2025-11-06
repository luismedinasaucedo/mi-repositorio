package org.example;

public class Arbol {
    private Nodo Raiz;

    public Arbol() {
        this.Raiz = null;
    }
    
    public void Insertar(int valor){
        if (Raiz==null) {
            Raiz=new Nodo(valor);
        }
        else{
            Raiz.Insertar(valor);
        }
    }
    
    public void Preorden(Nodo a){
        if (a==null) {
            return;
        }
        else{
            System.out.println(a.getValor());
            Preorden(a.getIzq());
            Preorden(a.getDer());
        }
        
    
    }
    
    public void Inorden(Nodo a){
        if (a==null) {
            return;
        }
        else{
            Inorden(a.getIzq());
            System.out.println(a.getValor());
            Inorden(a.getDer());
        }
    }
    
    public void Postorden(Nodo a){
        if (a==null) {
            return;
        }
        else{
            Postorden(a.getIzq());
            Postorden(a.getDer());
            System.out.println(a.getValor());
        }
    }
    
    public void MostrarPreorden(){
        Preorden(Raiz);
    }
    
    public void MostrarInorden(){
        Inorden(Raiz);
    }
    
    public void MostrarPostorden(){
        Postorden(Raiz);
    }
    
    public Nodo Sucesor(Nodo nodo){
        if (nodo.getIzq()==null) {
            return nodo;
        }
        else{return Sucesor(nodo.getIzq());}
    }
    
    public Nodo Buscar(Nodo nodo,int dato){
        if (nodo.getValor()==dato) {
            return nodo;
        }
        else{
            if (nodo.getValor()<dato) {return Buscar(nodo.getDer(),dato);}
            else{return Buscar(nodo.getIzq(),dato);}
        }
    }
    
    public Nodo BuscarPadre(Nodo nodo,int dato){
        if (nodo.getValor()==dato) {
            return nodo;
        }
        else{
            if (nodo.getValor()<dato) {
                if (nodo.getDer().getValor()==dato) {
                    
                    return nodo;
                }else{return BuscarPadre(nodo.getDer(),dato);}
            }
            else{
                if (nodo.getIzq().getValor()==dato) {
                    return nodo;
                }
                else{return BuscarPadre(nodo.getIzq(),dato);}
                }
        }
    }
    
    public void mostrarpadre(){
        System.out.println(BuscarPadre(Raiz,1).getValor());
        
    }
    
    
    public void mostrarsucesor(){
        System.out.println(Sucesor(Raiz.getDer()).getValor());
    }
    
    public void mostrarbusqueda(){
        System.out.println(Buscar(Raiz,14).getValor());
    }
    
    public void Eliminar(int dato){
        if (EsHoja(Buscar(Raiz,dato))) {
            if (BuscarPadre(Raiz,dato).getValor()<dato) {BuscarPadre(Raiz,dato).setDer(null);}
            else{BuscarPadre(Raiz,dato).setIzq(null);}
        }
        
        else if (Tiene1Hijos(Buscar(Raiz,dato))) {
            if (BuscarPadre(Raiz,dato).getValor()<dato) {
                if (Buscar(Raiz,dato).getDer()==null) {BuscarPadre(Raiz,dato).setDer(Buscar(Raiz,dato).getIzq());}
                else{BuscarPadre(Raiz,dato).setDer(Buscar(Raiz,dato).getDer());}
            }else{
                if (Buscar(Raiz,dato).getDer()==null) {BuscarPadre(Raiz,dato).setIzq(Buscar(Raiz,dato).getIzq());}
                else{BuscarPadre(Raiz,dato).setIzq(Buscar(Raiz,dato).getDer());}
            }
            
            
            
            
        }
        
    }
    
    public boolean EsHoja(Nodo nodo){
        return nodo.getDer()==null&&nodo.getIzq()==null;
    }
    
    public boolean Tiene2Hijos(Nodo nodo){
        return nodo.getDer()!=null&&nodo.getIzq()!=null;
    }
    
    public boolean Tiene1Hijos(Nodo nodo){
        return nodo.getDer()!=null^nodo.getIzq()!=null;
    }
    
    public void mostrarh(){
        System.out.println(Tiene2Hijos(Buscar(Raiz,14)));

    }




    
}
