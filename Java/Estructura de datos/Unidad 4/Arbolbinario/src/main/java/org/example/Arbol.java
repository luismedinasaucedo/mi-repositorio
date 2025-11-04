/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
        if (nodo.getIzq().getValor()==dato||nodo.getDer().getValor()==dato) {
            return nodo;
        }
        
        else{
            if (nodo.getValor()<dato) {return Buscar(nodo.getDer(),dato);}
            else{return Buscar(nodo.getIzq(),dato);}
        }
    }
    
    public void mostrarpadre(){
        System.out.println(BuscarPadre(Raiz,9).getValor());
        
    }
    
    
    public void mostrarsucesor(){
        System.out.println(Sucesor(Raiz.getDer()).getValor());
    }
    
    public void mostrarbusqueda(){
        System.out.println(Buscar(Raiz,14).getValor());
    }
    
    public void Eliminar(int dato){
        Nodo nodo=Buscar(Raiz,dato);
        nodo.setValor(Sucesor(Raiz.getDer()).getValor());
        if (nodo.getIzq()==Sucesor(Raiz.getDer())) {
            nodo.setIzq(Sucesor(Raiz.getDer()).getDer());
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
    
    
    public void Eliminar2(int dato){
    Nodo aux=Raiz;
    while(aux.getIzq().getValor()!=dato&&aux.getIzq().getValor()!=dato){
        if (aux.getValor()<dato) {
            aux.getDer();
        }else{
            aux.getIzq();
        }
    }
    
    
    }
    
    
    
}
