public class EjecutaObjetos {

    public static void main(String[] args) {

        Avion a1 = new Avion("Aeromexico", "2", "900km/h", "180 pasajeros");
        a1.acelerar();
        a1.elevarse();

        Avion a2 = new Avion("Volaris", "2", "850km/h", "160 pasajeros");
        a2.acelerar();
        a2.elevarse();
    }
}
