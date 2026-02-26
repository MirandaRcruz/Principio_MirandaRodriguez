public class SistemaAlerta extends Notificacion {

    private String sistemaAlerta;

    public SistemaAlerta(String mensaje, String destinatario, String sistemaAlerta) {
        super(mensaje, destinatario);
        this.sistemaAlerta = sistemaAlerta;
        System.out.println("SistemaAlerta creada");
    }

    @Override
    public void enviar() {
        System.out.println("Enviando ALERTA del sistema a " + destinatario + ": " + mensaje);
    }
}
