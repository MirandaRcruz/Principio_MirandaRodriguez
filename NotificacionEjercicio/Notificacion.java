public class Notificacion {

    protected String mensaje;
    protected String destinatario;

    public Notificacion(String mensaje, String destinatario) {
        this.mensaje = mensaje;
        this.destinatario = destinatario;
        System.out.println("Notificacion creada");
    }

    public void enviar() {
        System.out.println("Enviando notificacion...");
    }

    public String getMensaje() {
        return mensaje;
    }

    public String getDestinatario() {
        return destinatario;
    }
}
