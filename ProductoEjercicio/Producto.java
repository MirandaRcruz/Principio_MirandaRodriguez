public class Producto {

    private String nombre;
    private double precio;
    private int stock;

    // Constructor
    public Producto(String nombre1, double precio1, int stock1) {
        this.nombre = nombre1;
        this.precio = precio1;
        this.stock = stock1;
        System.out.println("Producto creado");
    }

    public String getProducto() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void vender(int cantidad) {
        if (cantidad <= stock) {
            stock -= cantidad;
            System.out.println("Venta realizada");
        } else {
            System.out.println("Stock insuficiente");
        }
    }
}
