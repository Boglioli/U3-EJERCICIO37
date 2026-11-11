public class Main {
    public static void main(String[] args) {
        Electrodomestico electrodomestico = new Electrodomestico("Samsung", 2000000, 2, "A");
        Heladera heladera = new Heladera("LG", 1500000, 3, "B", 200, true);
        Lavarropa lavarropa = new Lavarropa("Whirlpool", 1200, 0.7, "C", 10, 5);

        System.out.println("Datos del electrodoméstico:");
        electrodomestico.mostrarDatos();
        System.out.println("Gasto anual: " + electrodomestico.calcularGastoAnual());

        System.out.println("\nDatos de la heladera:");
        heladera.mostrarDatos();
        System.out.println("Gasto anual: " + heladera.calcularGastoAnual());

        System.out.println("\nDatos del lavarropa:");
        lavarropa.mostrarDatos();
        System.out.println("Gasto anual: " + lavarropa.calcularGastoAnual());
    }
}
