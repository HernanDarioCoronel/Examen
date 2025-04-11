package examen;

/**
 * clase abstracta vehiculo
 * @author Hernan
 * @version 1.0
 */
public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private String matricula;
    private double precio;
    private Motor motor;
    private Propietario propietario;

    public Vehiculo(String marca, String modelo, String matricula, double precio, Motor motor, Propietario propietario) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.precio = precio;
        this.motor = motor;
        this.propietario = propietario;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    /**
     * muestra los datos del vehiculo
     */
    public void mostrarInformacion() {
        System.out.println("\tMarca: " + this.marca);
        System.out.println("\tMatrícula: " + this.matricula);
        System.out.println("\tModelo: " + this.modelo);
        System.out.println("\tPrecio: " + this.precio);
        this.motor.mostrarInformacion();
        this.propietario.mostrarInformacion();
    }
}
