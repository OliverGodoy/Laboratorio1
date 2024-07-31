package umg.progra2.conductores;

public class Conductor {
    private String nombre;
    private String Licencia;

    public Conductor(String nombre, String Licencia) {
        this.nombre = nombre;
        this.Licencia = Licencia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLicencia() {
        return Licencia;
    }

    public void mostrarInformacion() {
        System.out.println("El Nombre del conductor es : " + nombre);
        System.out.println("La Licencia del conductor es : " + Licencia);
    }

}
