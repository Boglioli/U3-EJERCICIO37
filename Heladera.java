public class Heladera extends Electrodomestico {
    private int capacidadFreezer;
    private boolean noFrost;
    public Heladera(String marca, double precioBase, double coeficienteConsumo, String categoriaEnergetica, int capacidadFreezer, boolean noFrost) {
        super(marca, precioBase, coeficienteConsumo, categoriaEnergetica);
        this.capacidadFreezer = capacidadFreezer;
        this.noFrost = noFrost;
    }
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("capacidad del freezer: " + capacidadFreezer);
        System.out.println(" tecnologia no frost: " + noFrost);
    }
}
