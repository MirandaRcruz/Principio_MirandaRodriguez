public class EjecutaObjetos {

    public static void main(String[] args) {

        Profesor profesor = new Profesor("Carlos López", "Programación");

        Universidad universidad = new Universidad("Universidad Tecnológica", profesor);

        System.out.println("Universidad: " + universidad.getNombre());
        System.out.println("Profesor: " + universidad.getProfesor().getNombre());
        System.out.println("Materia: " + universidad.getProfesor().getMateria());
    }
}
