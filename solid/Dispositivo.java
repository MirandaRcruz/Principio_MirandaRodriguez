interface Dispositivo {
    void encender();
}
class Bombilla implements Dispositivo {

    public void encender() {
        System.out.println("Bombilla encendida");
    }
}
class LamparaLED implements Dispositivo {

    public void encender() {
        System.out.println("Lámpara LED encendida");
    }
}
class Interruptor {

    private Dispositivo dispositivo;

    public Interruptor(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void presionar() {
        dispositivo.encender();
    }
}
public class Main {

    public static void main(String[] args) {

        Dispositivo bombilla = new Bombilla();
        Interruptor interruptor = new Interruptor(bombilla);

        interruptor.presionar();
    }
}

