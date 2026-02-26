public class Docente extends Persona {

    private String datosDocente;

    public Docente(String nombre, String sexo, int edad, String datosDocente) {
        super(nombre, sexo, edad);
        this.datosDocente = datosDocente;
        System.out.println("Docente creado");
    }

    public String getDatosDocente() {
        return datosDocente;
    }
}
