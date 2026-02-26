public class EjecutaObjetos {

    public static void main(String[] args) {

        Taxi taxi = new Taxi("ABC123", "Nissan", 120, 4567);
        System.out.println("Taxi modelo: " + taxi.getModelo());
        System.out.println("Licencia: " + taxi.getNumeroLicencia());

        Autobus autobus = new Autobus("XYZ789", "Mercedes", 300, 50);
        System.out.println("Autobus modelo: " + autobus.getModelo());
        System.out.println("Plazas: " + autobus.getNumeroPlazas());
    }
}
