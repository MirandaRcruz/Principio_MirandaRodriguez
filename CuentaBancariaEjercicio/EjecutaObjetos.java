public class EjecutaObjetos {

    public static void main(String[] args) {

        CuentaBancaria cuenta = new CuentaBancaria(1000);

        System.out.println(cuenta.getCuentaBancaria());
        System.out.println("Saldo actual: " + cuenta.getSaldo());

        cuenta.depositar(500);
        System.out.println("Saldo actual: " + cuenta.getSaldo());

        cuenta.retirar(300);
        System.out.println("Saldo actual: " + cuenta.getSaldo());
    }
}

