package umg.progra2;

import umg.progra2.conductores.ConductorDeCoche;
import umg.progra2.conductores.ConductorDeMoto;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ConductorDeCoche c1 = new ConductorDeCoche("Alfred","91283ers",5);
        c1.mostrarInformacion();
        ConductorDeMoto c2 = new ConductorDeMoto("Oscar","123erte",true);
        c2.mostrarInformacion();
    }
}

