public class EjecutaObjetos {

    public static void main(String[] args) {

        Perro perro = new Perro("Firulais");
        perro.mover();
        perro.hacerSonido();

        Gato gato = new Gato("Michi");
        gato.mover();
        gato.hacerSonido();
    }
}
