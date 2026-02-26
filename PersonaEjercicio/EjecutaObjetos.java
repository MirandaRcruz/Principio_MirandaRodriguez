public class EjecutaObjetos {

    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante("Ana", "Femenino", 20, "Matricula 12345");
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Datos alumno: " + estudiante.getDatosAlumno());

        Docente docente = new Docente("Carlos", "Masculino", 40, "Profesor de Programacion");
        System.out.println("Nombre: " + docente.getNombre());
        System.out.println("Datos docente: " + docente.getDatosDocente());
    }
}
