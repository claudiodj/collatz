/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collatz;

/**
 *
 * @author cjordaney
 */
import java.util.Scanner;

public class Collatz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //N: variable que da inicio a la secuencia
        int N;
        // pasos: variable donde contamos los pasos hasta llegar a 1
        int pasos;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número con el que comienza la secuencia: ");
        // se espera el ingreso por teclado 
        N = sc.nextInt();
        while (N <= 0) {
            System.out.println("Solo se admiten valores positivos. Intente nuevamente: ");
            N = sc.nextInt();
        }
        System.out.print(N + "\t");
        pasos = 1;
        // Lo que sigue se ejecuta mientras N sea distinto de 1
        while (N != 1) {
            if (N % 2 == 0) {
                N = N / 2;
            } //Lo siguiente se ejecuta si N es impar 
            else {
                N = 3 * N + 1;
            }
            System.out.print(N + "\t");
            // Se incrementa en 1 los pasos
            pasos++;
        }
        System.out.println();
        System.out.println(" Hay " + pasos + " terminos en la secuencia hasta llegar a 1.");
    } // fin del main()  
} // fin de la clase Collatz  
