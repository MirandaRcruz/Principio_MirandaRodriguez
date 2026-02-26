public class Taxi extends Vehiculo {

    private int numeroLicencia;

    public Taxi(String matricula, String modelo, int potencia, int numeroLicencia) {
        super(matricula, modelo, potencia);
        this.numeroLicencia = numeroLicencia;
        System.out.println("Taxi creado");
    }

    public int getNumeroLicencia() {
        return numeroLicencia;
    }
}
