public class Perro extends Animal {

    public Perro(String nombre) {
        super(nombre);
        System.out.println("Perro creado");
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: Guau Guau");
    }
}
