class Usuario {
    private String nombre;
    private String email;

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    // getters
}
class UsuarioRepository {
    public void guardar(Usuario usuario) {
        System.out.println("Guardando usuario en BD...");
    }
}
class EmailService {
    public void enviarBienvenida(Usuario usuario) {
        System.out.println("Enviando email...");
    }
}
