package persona;

public abstract class Persona {
    private String nombre;
    private String dni;
    private String telefono;

    public Persona(String nombre, String dni, String telefono) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void mostrarInformacion(){
        System.out.println("Datos de la persona");
        System.out.println("\tNombre: "+this.nombre);
        System.out.println("\tDNI: "+this.dni);
        System.out.println("\tTeléfono: "+this.telefono);
    }
}
