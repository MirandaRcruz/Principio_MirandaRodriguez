public class Profesor {

    private String nombre;
    private String materia;

    public Profesor(String nombre, String materia) {
        this.nombre = nombre;
        this.materia = materia;
        System.out.println("Profesor creado");
    }

    public String getNombre() {
        return nombre;
    }

    public String getMateria() {
        return materia;
    }
}
