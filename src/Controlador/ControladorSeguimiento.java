package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.*;
import Vista.*;
import DAO.*;
import Principal.*;
import Procesos.*;

public class ControladorSeguimiento implements ActionListener {

    frmSeguimiento vista2;
    CRUDseguimiento crud;
    Seguimiento seg;

    public ControladorSeguimiento(frmSeguimiento forma2) {
        this.vista2 = forma2;
        vista2.btnRegistrar2.addActionListener(this);
        ActualizarTabla2();

    }

    void ActualizarTabla2() {
        crud = new CRUDseguimiento();
        crud.MostrarSeguimientos(vista2.tblDatos2, vista2.lblCantidad2);
        vista2.lblCantidad2.setText("Cantidad de Registros: " + Main.Lista2.CantidadObj());
        ProcesosSeguimiento.CargarCombos2(vista2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista2.btnRegistrar2) {
            Seguimiento se = ProcesosSeguimiento.LeerProgramador2(vista2);
            Main.Lista2.AgregarObj(se);
            seg = ProcesosSeguimiento.LeerProgramador2(vista2);
            crud = new CRUDseguimiento();
            crud.InsertarSeguimiento(seg);
            ProcesosSeguimiento.LimpiarEntradas(vista2);
            ActualizarTabla2();

        }
    }
}
