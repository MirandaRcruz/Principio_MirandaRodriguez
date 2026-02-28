interface MetodoPago {
    void procesarPago();
}
class PagoTarjeta implements MetodoPago {
    public void procesarPago() {
        System.out.println("Procesando pago con tarjeta...");
    }
}
class PagoPayPal implements MetodoPago {
    public void procesarPago() {
        System.out.println("Procesando pago con PayPal...");
    }
}
class PagoTransferencia implements MetodoPago {
    public void procesarPago() {
        System.out.println("Procesando transferencia...");
    }
}
class ProcesadorPago {

    public void procesar(MetodoPago metodoPago) {
        metodoPago.procesarPago();
    }
}
public class Main {
    public static void main(String[] args) {

        ProcesadorPago procesador = new ProcesadorPago();

        MetodoPago pago1 = new PagoTarjeta();
        MetodoPago pago2 = new PagoPayPal();

        procesador.procesar(pago1);
        procesador.procesar(pago2);
    }
}
