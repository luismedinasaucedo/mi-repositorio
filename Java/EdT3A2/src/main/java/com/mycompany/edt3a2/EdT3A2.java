package com.mycompany.edt3a2;
//torres de hanoi
import java.util.Scanner;

public class EdT3A2 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("introduce cuantos Discos queres almacenar");
        int Tope=leer.nextInt();
        Pila A=new Pila(Tope);
        Pila B=new Pila(Tope);
        Pila C=new Pila(Tope);
        Pila O,D;
        //crear la torre a
        for (int i = Tope; i >= 1; i--) {
            A.Push(i);
        }
        while(!C.PilaLlena()){
            System.out.println("");
            System.out.println("torre A");
            A.mostrar();
            System.out.println("");
            System.out.println("Torre B");
            B.mostrar();
            System.out.println("");
            System.out.println("Torre C");
            C.mostrar();
                
            System.out.println("introduce origen");
            O=seleccionarpila(A,B,C,leer.next().charAt(0));
            System.out.println("introduce destino");
            D=seleccionarpila(A,B,C,leer.next().charAt(0));
            MoverDisco(O,D);
            if (C.PilaLlena()) {
                System.out.println("Ganaste");
                System.out.println("Torre C");
                C.mostrar();
            }
        }
    }//main
    static void MoverDisco(Pila O,Pila D){
        if (O.PilaVacia()) {
            System.out.println("no hay discos");
            return;
        }
        if (D.PilaVacia()||O.pull()<D.pull()) {
            D.Push(O.Pop());
            
        }
    }
    static Pila seleccionarpila(Pila a,Pila b,Pila c,char h){
        switch(h){
            case 'A'->{return a;}
            case 'B'->{return b;}
            case 'C'->{return c;}
        }
            return null;
    }
    
}
