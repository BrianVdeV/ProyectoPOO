package Procesos;

import Interfaces.*;
import Modelo.*;
import Vista.*;

public class ProcesosSeguimiento implements Constantes{
    public static void LimpiarEntradas(frmSeguimiento fs){
       fs.txtPresentacion.setText("");
       fs.txtTitulos0.setText("");
       fs.txtVencimiento.setText("");
       fs.cbxProyectoS.setSelectedIndex(0);
       fs.cbxEstado.setSelectedIndex(0);
    }
    public static Seguimiento LeerProgramador2(frmSeguimiento fs){
        Seguimiento se = new Seguimiento ();
        se.setProyecto(fs.cbxProyectoS.getSelectedItem().toString());
        se.setNtitulo(fs.txtTitulos0.getText());
        se.setEstado(fs.cbxEstado.getSelectedItem().toString());
        se.setPresentacion(fs.txtPresentacion.getText());
        se.setVencimiento(fs.txtVencimiento.getText());
        return se;
    }
    //METODO QUE COMPLETA LOS COMBOS CON LOS DDATOS DE LA INTERFACE
    public static void CargarCombos2 (frmSeguimiento fs){
        fs.cbxProyectoS.removeAllItems();
        fs.cbxEstado.removeAllItems();
        for(int i=0;i<Proyecto.length;i++)
            fs.cbxProyectoS.addItem(Proyecto[i]);
        for(int i=0;i<Estado.length;i++)
            fs.cbxEstado.addItem(Estado[i]);
    }
}
