/* 2022-05-11*/

package Talleres;
import java.util.Scanner;

public class Taller_2 {

    private Scanner sc;

    public Taller_2() { sc = new Scanner(System.in); }

    /* Declara dos variables numéricas (con el valor que desees),
    muestra por consola la suma, resta, multiplicación, división y
    módulo (resto de la división).*/
    public void mathOperations() {

        System.out.print("Digite el primer valor: ");
        double x = sc.nextDouble();

        System.out.print("Digite el segundo valor: ");
        double y = sc.nextDouble();

        System.out.println("Suma: " + (x + y));
        System.out.println("Resta: " + (x - y));
        System.out.println("Multiplicacion: " + (x * y));

        if (y != 0) {
            System.out.println("Division: " + (x / y));
        } else {
            System.out.println("Division: No es posible dividir entre cero");
        }
    }

    /*  Declara un String que contenga tu nombre, después muestra un
    mensaje de bienvenida por consola. Por ejemplo: si
    introduzco “Fernando”, me aparezca “Bienvenido
    Fernando”. */
    public void greeting() {
        System.out.print("Digite su nombre: ");
        String name = sc.next();
        System.out.println("Bienvenido " + name);
    }

    /*  Declara 2 variables numéricas (con el valor que desees), he indica cual es
    mayor de los dos. Si son iguales indicarlo también. Ves cambiando los
    valores para comprobar que funciona. */
    public void numberComparison() {

        String message = "";

        System.out.print("Digite el primer valor: ");
        double x = sc.nextDouble();

        System.out.print("Digite el segundo valor: ");
        double y = sc.nextDouble();

        if (x == y) {
            message = "ambas variables son iguales";
        } else if (x > y) {
            message = "x: " + x + " es mayor que y: " + y;
        } else {
            message = "y: " + y + " es mayor que x: " + x;
        }

        System.out.println(message);
    }

    /* Muestra los números del 1 al 100 (ambos incluidos).*/
    public void numberList(int max) {
        for (int i = 1; i <= max; i++) {
            System.out.println(i);
        }
    }

    /* Realiza una aplicación que nos pida un número de ventas a
    introducir, después nos pedirá tantas ventas por teclado como
    número de ventas se hayan indicado. Al final mostrara la suma
    de todas las ventas. Piensa que es lo que se repite y lo que no.*/
    public void sales() {

        double suma = 0;

        System.out.print("Digite el primer valor: ");
        int numSales = sc.nextInt();

        for (int i = 0; i < numSales; i++) {
            System.out.print((i + 1) + ". venta con valor: ");
            suma += sc.nextDouble();
        }

        System.out.println("total valor ventas: " + suma);
    }

    /* Muestra los números primos entre 1 y 100. */
    public void primeNumber(int max) {
        
        max = Math.abs(max);
        String message = "";
        boolean isPrime = true;        

        for (int i = 0; i <= max; i++) {
            
            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (i == 0 || i == 1) isPrime = false;
            message += isPrime ? (i + " ") : "";
            isPrime = true;
        }

        System.out.println(message);
    }
}