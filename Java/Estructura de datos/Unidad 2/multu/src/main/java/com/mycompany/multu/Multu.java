package com.mycompany.multu;

public class Multu {

    public static void main(String[] args) {
        int d1=6,d2=3;
        System.out.println(multiplicacion(d1,d2));
        
    }
    
    public static int multiplicacion(int d1,int d2){
        if (d2==0) {
            return 0;
        }
        return d1+multiplicacion(d1,d2-1);
    }//M
}
