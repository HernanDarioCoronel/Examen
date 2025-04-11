package examen;

public class Propietario extends Persona{
    public Propietario(String nombre, String dni, String telefono) {
        super(nombre, dni, telefono);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Propietario:");
        super.mostrarInformacion();
    }
}
