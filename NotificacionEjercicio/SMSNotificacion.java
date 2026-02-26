public class SMSNotificacion extends Notificacion {

    private String smsNotificacion;

    public SMSNotificacion(String mensaje, String destinatario, String smsNotificacion) {
        super(mensaje, destinatario);
        this.smsNotificacion = smsNotificacion;
        System.out.println("SMSNotificacion creada");
    }

    @Override
    public void enviar() {
        System.out.println("Enviando SMS a " + destinatario + ": " + mensaje);
    }
}
