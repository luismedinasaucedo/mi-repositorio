package org.example;
public class Main {

    static void main() {
        int[] arreglo =new int[100];

        for (int i=0;i<100;i++){
            arreglo[i]=(int)(Math.random()*(1000-1+1)+1);
        }
        for (int i=0;i<100;i++){
            System.out.println(arreglo[i]);
        }
        System.out.println();
        quick(arreglo,0,99);
        for (int i=0;i<100;i++){
            System.out.println(arreglo[i]);
        }

    }

    private static int particion(int[] a,int inicio,int fin) {
        int pivote=a[fin];
        int i=(inicio-1);

        for (int j = inicio; j < fin; j++) {
            if (a[j] <= pivote) {
                i++;
                int temporal = a[i];
                a[i] = a[j];
                a[j] = temporal;
            }
        }
        int temporal = a[i+1];
        a[i+1] = a[fin];
        a[fin] = temporal;
        return i+1;
    }

    private static void quick(int[] arr, int inicio, int fin){
        if (inicio < fin){

            int indice = particion(arr,inicio,fin);
            quick(arr,inicio,indice-1);
            quick(arr,indice+1,fin);

        }

    }

}
