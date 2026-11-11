public class Lavarropa extends Electrodomestico{
    private int capacidad;
    private int programasLavado;
    public Lavarropa(String marca, double precioBase, double coeficienteConsumo, String categoriaEnergetica, int capacidad, int programasLavado) {
        super(marca, precioBase, coeficienteConsumo, categoriaEnergetica);
        this.capacidad = capacidad;
        this.programasLavado = programasLavado;
    }
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("capacidad: " + capacidad);
        System.out.println("programas de lavado: " + programasLavado);
    }
}

