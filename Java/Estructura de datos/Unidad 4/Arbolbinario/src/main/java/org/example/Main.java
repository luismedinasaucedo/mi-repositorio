package org.example;
public class Main {
    public static void main(String[] args) {
        Arbol arbol=new Arbol();
        
        arbol.Insertar(35);
        arbol.Insertar(90);
        arbol.Insertar(180);
        arbol.Insertar(215);
        arbol.Insertar(6);
        arbol.Insertar(1);
        arbol.Insertar(3);
        arbol.Insertar(5);
        arbol.Insertar(7);
        arbol.Insertar(10);
        arbol.Insertar(14);
        arbol.Insertar(9);
        arbol.Insertar(11);
        arbol.Insertar(13);
        arbol.Insertar(15);
        
        arbol.MostrarInorden();
        System.out.println("");
        arbol.mostrarpadre();
        arbol.mostrarh();
    }
}
