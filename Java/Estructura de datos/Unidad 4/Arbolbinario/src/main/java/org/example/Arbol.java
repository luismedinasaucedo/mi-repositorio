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
        }else{
            return Sucesor(nodo.getIzq());
        }
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
    
    
    public void mostrarsucesor(int dato){
        System.out.println(Sucesor(Buscar(Raiz,dato).getDer()).getValor());
    }
    
    public void mostrarbusqueda(){
        System.out.println(Buscar(Raiz,14).getValor());
    }
    
    public void Eliminar(int dato){
        Nodo padre=BuscarPadre(Raiz,dato);
        Nodo buscar=Buscar(Raiz,dato);
        
        if (EsHoja(buscar)) {
            if (padre.getValor()<dato) {padre.setDer(null);}
            else{padre.setIzq(null);}
        }
        
        else if (Tiene1Hijos(buscar)) {
            if (padre.getValor()<dato) {
                if (buscar.getDer()==null) {padre.setDer(buscar.getIzq());}
                else{padre.setDer(buscar.getDer());}
            }else{
                if (buscar.getDer()==null) {padre.setIzq(buscar.getIzq());}
                else{padre.setIzq(buscar.getDer());}
            } 
        }
        else if (Tiene2Hijos(buscar)) {
            Nodo sucesor=Sucesor(buscar.getDer());
            if (padre.getValor()<dato) {
                sucesor.setIzq(buscar.getIzq());
                padre.setDer(sucesor);
                
            }else{
                sucesor.setIzq(buscar.getIzq());
                padre.setIzq(sucesor);
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


    public void Eliminar2(int dato){
        Nodo Buscar=Buscar(Raiz,dato);
        Nodo padre=BuscarPadre(Raiz,dato);
        if (EsHoja(Buscar)){
            if (Buscar==Raiz){
                Raiz=null;
            }
            else {
                if (padre.getValor()<dato){
                    padre.setDer(null);
                }
                else {
                    padre.setIzq(null);
                }
            }
        }//es hoja
        if (Tiene1Hijos(Buscar)){
            if (Buscar==Raiz){
                if (Buscar.getIzq()==null)Raiz=Raiz.getDer();
                if (Buscar.getDer()==null)Raiz=Raiz.getIzq();
            }//tiene un hijo y es la raiz
            else{
                if (padre.getValor()>dato){
                    if (Buscar.getDer()==null)padre.setIzq(Buscar.getIzq());
                    else padre.setIzq(Buscar.getDer());
                }//el nodo que busco esta a la izq
                else {
                    if (Buscar.getDer()==null)padre.setDer(Buscar.getIzq());
                    else padre.setDer(Buscar.getDer());
                }//el nodo que busco esta a la derech
            }
        }//tiene un hijo
        if (Tiene2Hijos(Buscar)){
            Nodo sucesor=Sucesor(Buscar.getDer());
            Eliminar2(sucesor.getValor());
            Buscar.setValor(sucesor.getValor());
        }//tiene 2 hijos
    }




    
}
