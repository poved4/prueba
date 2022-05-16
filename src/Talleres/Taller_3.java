/* 20022-05-12 */

package Talleres;
import java.util.Scanner;

public class Taller_3 {

    private Scanner sc;

    public Taller_3() { sc = new Scanner(System.in); }

    /*Escribir un método con el try y catch, que permita solamente recibir 
    números positivos, si el usuario ingresa número negativos, que envíe un 
    mensaje de error.*/
    public void numerosPositivos() {

        try {

            int max = inputInt("Digite la cantidad de datos a leer: ");

            for (int i = 0; i < max; i++) {

                System.out.print((i + 1) + ". valor: ");
                double num = sc.nextDouble();

                if (num < 0) {
                    throw new RuntimeException("El numero NO puede ser negativo");
                }
            }

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
    
    /* Escribir un método para realizar la lectura de 7 números enteros, 
    si el usuario ingresa un número no válido, que envíe un mensaje de error.*/
    public void numerosEnteros() {
        int max = inputInt("Digite la cantidad de datos a leer: ");
        int[] arr = new int[max];

        for (int i = 0; i < max; i++) {
            arr[i] = inputInt((i + 1) + ". valor: ");
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private int inputInt(String message) {

        boolean ask;
        int num = 0;

        do {
            try {
                ask = false;
                System.out.print(message);
                num = sc.nextInt();
            } catch (RuntimeException e) {
                ask = true;
                System.out.println("Dato no valido. " + e.getMessage());
            }
        } while (ask);

        return num;
    }

}