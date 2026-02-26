public class Persona {

    private String nombre;
    private Auto auto;  // Asociación

    public Persona(String nombre, Auto auto) {
        this.nombre = nombre;
        this.auto = auto;
        System.out.println("Persona creada");
    }

    public String getNombre() {
        return nombre;
    }

    public Auto getAuto() {
        return auto;
    }
}
