public class CuentaBancaria {

    private double saldo;

    // Constructor
    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
        System.out.println("Cuenta bancaria creada");
    }

    public String getCuentaBancaria() {
        return "Cuenta activa";
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
        System.out.println("Deposito realizado");
    }

    public void retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro realizado");
        } else {
            System.out.println("Fondos insuficientes");
        }
    }
}
