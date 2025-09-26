package com.mycompany.interes;
public class Interes {

    public static void main(String[] args) {
        int Mes=5;
        double Dinero=3000;
        
        System.out.println(interes(Mes,Dinero));
    }
    public static double interes(int Mes, double Dinero){
        if (Mes==0) {return Dinero;}
        return interes(Mes-1,Dinero*1.05);
    
    
    
    }
}
