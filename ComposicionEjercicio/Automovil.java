public class Automovil {

    private Motor motor;  // Composición

    public Automovil() {
        motor = new Motor();  // Se crea dentro
        System.out.println("Automovil creado");
    }

    public void arrancar() {
        System.out.println("Arrancando automovil...");
        motor.encender();
    }
}
