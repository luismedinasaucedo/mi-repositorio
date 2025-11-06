package com.mycompany.arbol;

import java.util.Scanner;

public class Arbol {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Aarbol objarbol=new Aarbol();
        
        System.out.println("1.-buscar y devolver nivel");
        
        
        objarbol.insertar(8);
        objarbol.insertar(4);
        objarbol.insertar(12);
        objarbol.insertar(2);
        objarbol.insertar(6);
        objarbol.insertar(1);
        objarbol.insertar(3);
        objarbol.insertar(5);
        objarbol.insertar(7);
        objarbol.insertar(10);
        objarbol.insertar(13);
        objarbol.insertar(9);
        objarbol.insertar(11);
        objarbol.insertar(14);
        objarbol.insertar(15);
        objarbol.mostrar1();
        
        
    }
}
