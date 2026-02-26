public class EjecutaObjetos {

    public static void main(String[] args) {

        EmailNotificacion email = new EmailNotificacion(
                "Hola, tienes un nuevo mensaje",
                "ana@email.com",
                "EmailNotificacion");

        email.enviar();

        SMSNotificacion sms = new SMSNotificacion(
                "Tu codigo es 1234",
                "5512345678",
                "SMSNotificacion");

        sms.enviar();

        SistemaAlerta alerta = new SistemaAlerta(
                "Error en el sistema",
                "Administrador",
                "SistemaAlerta");

        alerta.enviar();
    }
}
