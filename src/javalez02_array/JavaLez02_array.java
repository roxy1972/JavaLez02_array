/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalez02_array;

/**
 *
 * @author tss
 */
public class JavaLez02_array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creo array e inserisco sempre prima il tipo quindi lo dichiaro come composto da interi
        int[] numeri;
        // inserisco la dimensione cioè di quanti elementi è composto in questo caso da 100 numeri
        numeri = new int[100];
        // la forma abbreviata di queste due dichiarazioni é: int [] numeri = new int [100]; 
        //nell'esempio metto "numeri1" perchè SOLO qui ci sono entrambe i dati;
        int[] numeri1 = new int[100];
        
        // forma abbreviata 2
        int[] numeri2 = {10,20,30,40};
        

        // stampo la mia array con un ciclo for
        for (int i = 0; i < 100; i++) {
            //vado a prendere l'elemento
            int elemento = numeri[i];
            stampa(numeri);
            

        }
        // carico array da 1 a 100 e creo una variabile
        int valore = 1;
        // faccio un ciclo for
        for (int i = 0; i < 100; i++) {
            //vado a prendere l'elemento e lo aumento di 1
            numeri[i] = valore;
            valore = valore + 1;

        }

        System.out.println("-------------------------------------------");

        stampa(numeri);
        
        System.out.println("-------------------------------------------");

        stampa(numeri);

    }

    //function in Java
    public static void stampa(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int el = array[i];
            System.out.println(String.format("L'elemento [%s] ha un valore di %s $", i, el));
        }

    }

}
