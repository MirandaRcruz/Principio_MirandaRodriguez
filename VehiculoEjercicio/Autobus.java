public class Autobus extends Vehiculo {

    private int numeroPlazas;

    public Autobus(String matricula, String modelo, int potencia, int numeroPlazas) {
        super(matricula, modelo, potencia);
        this.numeroPlazas = numeroPlazas;
        System.out.println("Autobus creado");
    }

    public int getNumeroPlazas() {
        return numeroPlazas;
    }
}
