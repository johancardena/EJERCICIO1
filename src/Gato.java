public class Gato extends Animal {
    // Constructor
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    // Sobrescritura
    @Override
    public String hacerSonido() {
        return "maullar: ¡Miau!";
    }
}