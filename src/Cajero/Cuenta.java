package Cajero;

public class Cuenta {

    private String titular;
    private double saldo;

    public Cuenta(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void consignar(double saldo) {
        this.saldo += saldo;
    }

    public void retirar(double saldo) {
        this.saldo -= saldo;
    }

}