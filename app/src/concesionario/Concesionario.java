package concesionario;

import Persona.Empleado;

public class Concesionario {
    private String nombre;
    private String direccion;
    private Empleado gerente;

    public Concesionario(String nombre, String direccion, Empleado gerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.gerente = gerente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Empleado getGerente() {
        return gerente;
    }

    public void setGerente(Empleado gerente) {
        this.gerente = gerente;
    }

    public void mostrarInformacion() {
        System.out.println("Concesionario: ");
        System.out.println("\tNombre: " + this.nombre);
        System.out.println("\tDirección: " + this.direccion);
        gerente.mostrarInformacion();
    }
}
