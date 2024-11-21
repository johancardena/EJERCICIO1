public class Main {
    public static void main(String[] args) {
        // Crear instancias de Perro y Gato
        Perro perro = new Perro("Firulais", 5);
        Gato gato = new Gato("Michi", 3);

        // Mostrar información perro
        System.out.println("Nombre: " + perro.getNombre());
        System.out.println("Edad: " + perro.getEdad());
        System.out.println("Sonido: " + perro.hacerSonido());
        System.out.println("--------------------------------");

        // Mostrar información gato
        System.out.println("Nombre: " + gato.getNombre());
        System.out.println("Edad: " + gato.getEdad());
        System.out.println("Sonido: " + gato.hacerSonido());
    }
}