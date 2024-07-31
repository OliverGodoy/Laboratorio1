package umg.progra2.conductores;

public class ConductorDeMoto extends Conductor {
    private boolean tieneLincenciaMoto;
    public ConductorDeMoto(String nombre, String Licencia,boolean tieneLincenciaMoto ) {
        super(nombre, Licencia);
        this.tieneLincenciaMoto = tieneLincenciaMoto;
    }


    public boolean getTieneLincenciaMoto() {
        return tieneLincenciaMoto;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("El Nombre del conductor es : " + getNombre());
        System.out.println("Tiene licencia : " +getTieneLincenciaMoto());

    }
}
