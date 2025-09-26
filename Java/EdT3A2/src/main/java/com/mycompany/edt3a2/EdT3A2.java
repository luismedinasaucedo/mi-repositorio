package com.mycompany.edt3a2;
//torres de hanoi
import java.util.Scanner;

public class EdT3A2 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("introduce cuantos Discos queres almacenar");
        int Tope=leer.nextInt();
        char O,D;
        Pila A=new Pila(Tope);
        Pila B=new Pila(Tope);
        Pila C=new Pila(Tope);
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
            O=leer.next().charAt(0);
            System.out.println("introduce destino");
            D=leer.next().charAt(0);
            switch(O){
                case 'A'->{
                switch(D){
                        case 'B'->{MoverDisco(A,B);}
                        case 'C'->{MoverDisco(A,C);}
                }
                    
                        
                    }
                case 'B'->{
                switch(D){
                        case 'A'->{ MoverDisco(B,A);}
                        case 'C'->{MoverDisco(B,C);}
                }  }
                    case 'C'->{
                        switch(D){
                        case 'A'->{MoverDisco(C,A);}
                        case 'B'->{MoverDisco(C,B);}
                    }
                    
                    }
                
            }
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
    
}
