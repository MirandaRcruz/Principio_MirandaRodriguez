public class EjecutaObjetos {

    public static void main(String[] args) {

        Auto auto = new Auto("Toyota");

        Persona persona = new Persona("Ana", auto);

        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Marca del auto: " + persona.getAuto().getMarca());
    }
}
