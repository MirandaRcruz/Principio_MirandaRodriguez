public class EmailNotificacion extends Notificacion {

    private String emailNotificacion;

    public EmailNotificacion(String mensaje, String destinatario, String emailNotificacion) {
        super(mensaje, destinatario);
        this.emailNotificacion = emailNotificacion;
        System.out.println("EmailNotificacion creada");
    }

    @Override
    public void enviar() {
        System.out.println("Enviando EMAIL a " + destinatario + ": " + mensaje);
    }
}
