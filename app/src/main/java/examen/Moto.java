package examen;

public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String marca, String modelo, String matricula, double precio, Motor motor, Propietario propietario, int cilindrada) {
        super(marca, modelo, matricula, precio, motor, propietario);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Moto:");
        System.out.println("\tCilindrada: " + this.cilindrada);
        super.mostrarInformacion();
    }
}
