//2022-05-13

package Cajero;
import java.util.Scanner;

public class Cajero {

    Scanner sc;
    Cuenta cuenta;

    public Cajero() {
        sc = new Scanner(System.in);
    }

    public void start() {
        iniciarSesion();
        menu();
    }

    private void iniciarSesion() {
        String titular = input("Nombre del titular: ");
        cuenta = new Cuenta(titular);
    }

    public void menu() {

        boolean exit = false;
        String message = """
                         \n\tMenu
                         1. consignar
                         2. retirar
                         3. obtener saldo
                         4. salir
                         
                         opcion:
                         """;
        
        do {
            int opction = inputInt(message);
            
            switch (opction) {
                case 1 -> consignar();
                case 2 -> retirar();
                case 3 -> obtenerSaldo();
                case 4 -> exit = true;
                default -> System.out.println("Opcion no valida");
            }
        } while (!exit);

    }

    public void consignar() {
        do {

            String message = "\n\tConsignacion\nCantidad: ";
            double cantidad = inputDouble(message);

            if (cantidad < 0) {
                System.out.println("Debe digitar una cantidad positiva");
                continue;
            }

            cuenta.consignar(cantidad);
            System.out.println("Transaccion exitosa");
            break;

        } while (true);
    }

    public void retirar() {
        do {

            String message = "\n\tRetiro\nCantidad: ";
            double cantidad = inputDouble(message);

            if (cantidad < 0) {
                System.out.println("Debe digitar una cantidad positiva");
                continue;
            }

            if (cantidad > cuenta.getSaldo()) {
                System.out.println("Saldo insuficiente");
                continue;
            }

            cuenta.retirar(cantidad);
            System.out.println("Transaccion exitosa");
            break;

        } while (true);
    }

    public void obtenerSaldo() {
        System.out.println("\nSaldo Actual: " + cuenta.getSaldo());
    }

    private String input(String message) {
        System.out.print(message);
        return sc.next();
    }
    
    private double inputDouble(String message) {
        System.out.print(message);
        return sc.nextDouble();
    }

    private int inputInt(String message) {
        System.out.print(message);
        return sc.nextInt();
    }
}