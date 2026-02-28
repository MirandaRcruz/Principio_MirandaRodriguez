interface Trabajable {
    void trabajar();
}
interface Comible {
    void comer();
}
class Humano implements Trabajable, Comible {

    public void trabajar() {
        System.out.println("Trabajando...");
    }

    public void comer() {
        System.out.println("Comiendo...");
    }
}
class Robot implements Trabajable {

    public void trabajar() {
        System.out.println("Trabajando automáticamente...");
    }
}
