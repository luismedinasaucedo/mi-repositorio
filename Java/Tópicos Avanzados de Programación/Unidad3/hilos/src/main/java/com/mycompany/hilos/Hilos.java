package com.mycompany.hilos;

class hilos extends Thread{
    int repeticiones;
    String color;
    hilos(String c,int r){
    this.color=c;
    this.repeticiones=r;
    }
    
    public void run(){
        for (int i = 0; i < repeticiones; i++) {
            System.out.println(i+" "+color);
            if (color=="Hilo rojo") {
                try {
                    sleep(5000);
                } catch (InterruptedException ex) {
                    System.getLogger(hilos.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
                }
            }
            
        }
    }//metodo run
    
}//hillos
public class Hilos {

    public static void main(String[] args) {
        hilos hilo1  =  new hilos("Hilo rojo",5);
        hilos hilo2  =  new hilos("Hilo azul",5);
        hilos hilo3  =  new hilos("Hilo verde",5);
        
        
        hilo2.yield();
        hilo1.start();
        hilo2.start();
        
        
        synchronized (hilo2){
            try{
                hilo2.wait();
            }catch(Exception e){}
        }
        
        
        synchronized (hilo1){
            try{
                hilo1.notify();
                hilo1.notifyAll();
            }catch(Exception e){}
        }
        
        
    }
}
