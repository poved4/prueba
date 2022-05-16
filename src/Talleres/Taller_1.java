/* 2022-05-11 */

package Talleres;
import java.util.Scanner;

public class Taller_1 {
    
    Scanner sc = new Scanner(System.in);
    
    /* Realizar una matriz  de 5x5 que reciba los datos y que lo recorra mostrando
    el mayor valor y la posición en donde está ubicado */
    public void matriz() {

        final int size = 5;
        int mayor, posI, posJ;
        int[][] matriz = new int[size][size];

        mayor = posI = posJ = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                System.out.print(i + "-" + j + ": ");
                matriz[i][j] = sc.nextInt();

                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                    posI = i;
                    posJ = j;
                }
            }
        }

        System.out.println("\nNumero mayor: " + mayor);
        System.out.println("Posicion: matriz[" + posI + "][" + posJ + "]");
    }

    /* Realizar un programa que me muestre si un estudiante saco un promedio de 
    3.0 paso el semestre, si es menor, que muestre que reprobo el semestre */
    public void promedio() {
        double suma = 0;
        final int size = 4;
        double[] matriz = new double[size];

        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + ". Nota: ");
            matriz[i] = sc.nextDouble();
            suma += matriz[i];
        }

        double prom = (suma / size);
        String message = (prom >= 3.0) ? "Aprovado" : "NO aprovado";
        System.out.println("\nNota: " + prom + "\nSemestre " + message);
    }

}