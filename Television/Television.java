public class Television {

    public String forma;
    private String tamaño;
    public String calidadDeVideo;
    protected String marca;

    // Constructor
    public Television(String forma, String tamaño, String calidadDeVideo, String marca) {
        this.forma = forma;
        this.tamaño = tamaño;
        this.calidadDeVideo = calidadDeVideo;
        this.marca = marca;
        System.out.println("Construyo una television");
    }

    public void apagada() {
        System.out.println("Television apagada");
    }

    public void prendida() {
        System.out.println("Television encendida");
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getForma() {
        return forma;
    }
}
