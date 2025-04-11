package examen;

/**
 * clase motor
 * @author Hernan
 * @version 1.0
 */
public class Motor {
    private int potencia;
    private String tipoCombustible;

    public Motor(int potencia, String tipoCombustible) {
        this.potencia = potencia;
        this.tipoCombustible = tipoCombustible;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    /**
     * Muestra los datos del motor
     */
    public void mostrarInformacion() {
        System.out.println("Motor: ");
        System.out.println("\tPotencia: " + this.potencia);
        System.out.println("\tTipo de Combustible: " + this.tipoCombustible);
    }
}
