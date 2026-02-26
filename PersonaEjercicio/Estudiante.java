public class Estudiante extends Persona {

    private String datosAlumno;

    public Estudiante(String nombre, String sexo, int edad, String datosAlumno) {
        super(nombre, sexo, edad);
        this.datosAlumno = datosAlumno;
        System.out.println("Estudiante creado");
    }

    public String getDatosAlumno() {
        return datosAlumno;
    }
}
