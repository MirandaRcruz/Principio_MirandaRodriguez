public class Animal {

    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
        System.out.println("Animal creado");
    }

    public String getNombre() {
        return nombre;
    }

    public void mover() {
        System.out.println(nombre + " se esta moviendo");
    }

    public void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}
