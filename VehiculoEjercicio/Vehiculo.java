public class Vehiculo {

    protected String matricula;
    protected String modelo;
    protected int potencia;

    public Vehiculo(String matricula, String modelo, int potencia) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.potencia = potencia;
        System.out.println("Vehiculo creado");
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPotencia() {
        return potencia;
    }
}
