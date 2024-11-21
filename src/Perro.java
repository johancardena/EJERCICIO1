public class Perro extends Animal {
    // Constructor
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    // Sobrescritura
    @Override
    public String hacerSonido() {
        return "ladrar: ¡Guau, guau!";
    }
}