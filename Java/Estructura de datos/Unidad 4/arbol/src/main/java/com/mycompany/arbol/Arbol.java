package com.mycompany.arbol;

import java.util.Scanner;

public class Arbol {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Aarbol objarbol=new Aarbol();
        
        System.out.println("1.-buscar y devolver nivel");
        
        
        objarbol.insertar(3);
        objarbol.insertar(2);
        objarbol.insertar(1);
        objarbol.insertar(5);
        objarbol.mostrar();
        
        
    }
}
