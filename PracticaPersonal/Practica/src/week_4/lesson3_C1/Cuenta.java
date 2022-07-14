package week_4.lesson3_C1;

public abstract class Cuenta {
    private double saldo;
    private double saldoDolares;


    public void depositar(double monto) {
        saldo += monto;
    }

    public void depositarDolares (double monto) {
        saldoDolares += monto;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setSaldoDolares(double saldo) {
        this.saldoDolares = saldo;
    }

    public double informarSaldo() {
        return saldo;
    }
    public double informarSaldoDolares() {
        return saldoDolares;
    }

    public abstract void extraer(double monto);
}
