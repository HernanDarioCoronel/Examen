package examen;

/**
 * Clase coche
 * @author Hernan
 * @version 1.0
 * @see examen.Vehiculo
 */
public class Coche extends Vehiculo {

    private int numeroPuertas;

    public Coche(String marca, String modelo, String matricula, double precio, Motor motor, Propietario propietario, int numeroPuertas) {
        super(marca, modelo, matricula, precio, motor, propietario);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    /**
     * Muestra los datos del coche
     */
    @Override
    public void mostrarInformacion() {
        System.out.println("Coche: ");
        System.out.println("\tNúmero de puertas: " + this.numeroPuertas);
        super.mostrarInformacion();
    }
}
