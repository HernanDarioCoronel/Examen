package examen;

/**
 * Clase empleado
 * @author Hernan
 * @version 1.0
 * @see examen.Persona
 */
public class Empleado extends Persona {
    private String puesto;

    public Empleado(String nombre, String dni, String telefono, String puesto) {
        super(nombre, dni, telefono);
        this.puesto = puesto;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    /**
     * muestra los datos del empleado
     */
    @Override
    public void mostrarInformacion() {
        System.out.println("Empleado:");
        System.out.println("\tPuesto: "+this.puesto);
        super.mostrarInformacion();
    }
}

