public class EjecutaObjetos {

    public static void main(String[] args) {

        Pelota p1 = new Pelota("Redonda", "Rojo", "Plastico", "Futbol");
        p1.botar();
        p1.desinflar();

        Pelota p2 = new Pelota("Redonda", "Azul", "Goma", "Basquetbol");
        p2.botar();
        p2.desinflar();
    }
}

