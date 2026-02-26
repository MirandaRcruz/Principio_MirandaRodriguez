public class Universidad {

    private String nombre;
    private Profesor profesor;  // Asociación

    public Universidad(String nombre, Profesor profesor) {
        this.nombre = nombre;
        this.profesor = profesor;
        System.out.println("Universidad creada");
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }
}
