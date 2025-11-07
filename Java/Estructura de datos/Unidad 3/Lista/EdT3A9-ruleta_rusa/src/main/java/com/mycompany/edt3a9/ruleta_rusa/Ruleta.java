package com.mycompany.edt3a9.ruleta_rusa;

import java.util.Scanner;

public class Ruleta {

    Scanner leer = new Scanner(System.in);
    private Nodo cabecera;
    private int victimas = 0;

    public Ruleta() {
        this.cabecera = null;
        
    }

    public boolean listavacia() {
        return cabecera == null;
    }

    public void ingresar() {
        cabecera  = null; 
        System.out.println("Ingresa la cantidad de Victimas");
        victimas = leer.nextInt();

        if (victimas <= 0) {
            System.out.println("Tiene que haber 1 victima como minimo");
            victimas = 0;
            return;
        }

        for (int i = 1; i <= victimas; i++) {
            System.out.println("Ingresa la victima [" + i + "]");
            Nodo nuevo = new Nodo(leer.next());
            if (listavacia()) {
                cabecera  = nuevo;
            } else {
                nuevo.setAnt(cabecera);
                cabecera.setSig(nuevo);
                cabecera = nuevo;
            }
        }

        
        if (cabecera != null) { 
            Nodo aux=cabecera;
            while(aux.getSig()!=null){
                aux=aux.getSig();
            }
            cabecera.setAnt(aux);
            aux.setSig(cabecera);
        }
    }

    public void ruleta() {
        if (listavacia()) {
            System.out.println("Lista vacia: Sin victimas. Ingresa participantes primero.");
            return;
        }

 
        if (victimas == 1) { 
            System.out.println("Solo hay un participante. Es el ganador!!!");
            System.out.println("El ganador es: " + cabecera.getDato());
            return;
        }

        int restantes = victimas;
        Nodo actual = cabecera; 
        
        System.out.println("INICIAR!!!--> Hay " + restantes + " participantes");

        while (restantes > 1) {
           
            int saltos = (int) (Math.random() * 10) + 1; 
            System.out.println("\nSe gira el arma y se avanzan " + saltos + " posiciones.");

            for (int i = 0; i < saltos; i++) {
                actual = actual.getSig();
            }

           
            System.out.println("Pistolazo! La victima: " + actual.getDato() + " ha sido eliminada.");

            
            Nodo anterior = actual.getAnt();
            Nodo siguiente = actual.getSig();

            anterior.setSig(siguiente);
            siguiente.setAnt(anterior);

            
            if (actual == cabecera) {
                cabecera = siguiente;
            }
            

            restantes--;
            System.out.println("Quedan " + restantes + " participantes.");
            
            
            actual = siguiente; 
        }

  
        System.out.println("\n--- FINISH ---");
        System.out.println("El ganador es:" + actual.getDato() + " felicidades");

    
        cabecera = null;
        victimas = 0;
    }
}
