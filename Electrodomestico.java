public class Electrodomestico {
    protected String marca;
    protected double precioBase;
    protected double coeficienteConsumo;
    protected String categoriaEnergetica;

    public Electrodomestico(String marca, double precioBase, double coeficienteConsumo, String categoriaEnergetica) {
        this.marca = marca;
        this.precioBase = precioBase;
        this.coeficienteConsumo = coeficienteConsumo;
        this.categoriaEnergetica = categoriaEnergetica;
    }

    public double calcularGastoAnual() {
        double tasa = 0;
        if (categoriaEnergetica.equals("A")) {
            tasa = 0.05;
        } else if (categoriaEnergetica.equals("B")) {
            tasa = 0.10;
        } else if (categoriaEnergetica.equals("C")) {
            tasa = 0.20;
        }
        return precioBase * tasa;
    }

    public void mostrarDatos() {
        System.out.println("marca: " + marca);
        System.out.println("precio base: " + precioBase);
        System.out.println("coeficiente de consumo: " + coeficienteConsumo);
        System.out.println("categoría energética: " + categoriaEnergetica);
    }
}