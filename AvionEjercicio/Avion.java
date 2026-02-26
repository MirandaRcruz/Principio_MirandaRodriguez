public class Avion {

    public String aerolinea;
    private String cantidadMotores;
    protected String velocidad;
    public String capacidad;

    private String modelo;

    // Constructor
    public Avion(String aerolinea1, String cantidadMotores1, String velocidad1, String capacidad1) {
        this.aerolinea = aerolinea1;
        this.cantidadMotores = cantidadMotores1;
        this.velocidad = velocidad1;
        this.capacidad = capacidad1;
        System.out.println("Construyo un avion");
    }

    public void acelerar() {
        System.out.println("El avion acelero");
    }

    public void elevarse() {
        System.out.println("El avion se elevo");
    }

    public void setModelo(String modelo1) {
        this.modelo = modelo1;
    }

    public String getModelo() {
        return this.modelo;
    }
}

