package umg.progra2.conductores;

public class ConductorDeCoche extends Conductor{
    private int ExperienciaAnios;

    public ConductorDeCoche(String nombre, String Licencia,int ExperienciaAnios) {
        super(nombre, Licencia);
        this.ExperienciaAnios = ExperienciaAnios;
    }



    public int getExperienciaAnios() {
        return ExperienciaAnios;
    }

    @Override
    public void mostrarInformacion(){
        System.out.println("El Nombre del conductor es : " + getNombre());
        System.out.println("La licencia del conductor es: " + getLicencia());
        System.out.println("Los años de experiencia son: " + getExperienciaAnios());
    }

}
