package examen;

/**
 * Clase Propietario que extiende de persona
 * @author Hernan
 * @version 1.0
 * @see examen.Persona
 */
public class Propietario extends Persona{
    public Propietario(String nombre, String dni, String telefono) {
        super(nombre, dni, telefono);
    }

    /**
     * Muestra la informacion del propietario
     */
    @Override
    public void mostrarInformacion() {
        System.out.println("Propietario:");
        super.mostrarInformacion();
    }
}
