package com.mycompany.comundivisor;

public class Comundivisor {

    public static void main(String[] args) {
        int num1=36,num2=60;
        System.out.println(divisor(num1,num2));
    }
    public static int divisor (int num1,int num2){
        //System.out.println("num1 "+num1);
        //System.out.println("num2 "+num2);
        if (num1>=num2) {
            return divisor(num1-num2,num2);
        }
        
        if (num2>num1&&num1!=0) {
            return divisor(num1,num2-num1);
        }
        if (num1==0) {
            return num2;
        }
        if (num2==0) {
            return num1;
        }
        return 0;
        
    }
}
