public class Gato extends Animal {

    public Gato(String nombre) {
        super(nombre);
        System.out.println("Gato creado");
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: Miau Miau");
    }
}
