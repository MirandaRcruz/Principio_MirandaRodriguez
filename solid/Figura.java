interface Figura {
    int getArea();
}
class Rectangulo implements Figura {

    private int ancho;
    private int alto;

    public Rectangulo(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public int getArea() {
        return ancho * alto;
    }
}
class Cuadrado implements Figura {

    private int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    public int getArea() {
        return lado * lado;
    }
}
