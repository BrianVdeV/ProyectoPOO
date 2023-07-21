package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.*;
import Vista.*;
import Principal.*;
import Procesos.*;
public class ControladorFinalizarActividad implements ActionListener{
    frmFinalizarActividad vista3;
    
    public ControladorFinalizarActividad(frmFinalizarActividad forma3){
        this.vista3 = forma3 ;
        vista3.btnRegistrar3.addActionListener(this);
        ActualizarTabla3();    
    }
    void ActualizarTabla3(){
        Main.Lista3.MostrarEnTabla3(vista3.tblDatos3);
        vista3.lblCantidad3.setText("Cantidad de Registros :"+Main.Lista3.CantidadObj());
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista3.btnRegistrar3){
            Finalizar fr = ProcesosFinalizar.LeerProgramador(vista3);
            Main.Lista3.AgregarObj(fr);
            ActualizarTabla3();
            
        }
    }
    
}
