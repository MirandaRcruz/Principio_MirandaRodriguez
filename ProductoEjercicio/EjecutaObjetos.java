public class EjecutaObjetos {

    public static void main(String[] args) {

        Producto p1 = new Producto("Laptop", 15000, 10);

        System.out.println("Producto: " + p1.getProducto());
        System.out.println("Precio: " + p1.getPrecio());
        System.out.println("Stock: " + p1.getStock());

        p1.vender(3);
        System.out.println("Stock actual: " + p1.getStock());
    }
}
