package Procesos;

import Interfaces.*;
import Modelo.*;
import Vista.*;

public class ProcesosIngresar implements Constantes {

    public static void LimpiarEntradas(frmIngresarActividad fia) {
        fia.txtInicio.setText("");
        fia.txtActividad.setText("");
        fia.txtProyecto1.setText("");
        fia.cbxOt.setSelectedIndex(0);
        fia.txtInicio.requestFocus();
    }

    public static Ingresar LeerProgramador(frmIngresarActividad fia) {
        Ingresar pd = new Ingresar();
        pd.setInicio(fia.txtInicio.getText());
        pd.setActividad(fia.txtActividad.getText());
        pd.setProyecto(fia.txtProyecto1.getText());
        pd.setOt(fia.cbxOt.getSelectedItem().toString());
        return pd;
    }

    //METODO QUE COMPLETA LOS COMBOS CON LOS DATOS DE LA INTERFACE
    public static void CargarCombos(frmIngresarActividad fia) {
        fia.cbxOt.removeAllItems();
        for (int i = 0; i < OT.length; i++) {
            fia.cbxOt.addItem(OT[i]);
        }
    }
}
