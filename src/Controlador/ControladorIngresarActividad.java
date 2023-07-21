package Controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.*;
import Vista.*;
import DAO.*;
import Principal.*;
import Procesos.*;

public class ControladorIngresarActividad implements ActionListener{
    frmIngresarActividad vista;
    CRUD_IngresarAct crud;
    Ingresar ing;
    
    public ControladorIngresarActividad(frmIngresarActividad forma){
        this.vista = forma;
        vista.btnRegistrar.addActionListener(this);
        ActualizarTabla();
    }
    
    void ActualizarTabla(){
        crud = new CRUD_IngresarAct();
        crud.MostrarActividades(vista.tblDatos,vista.lblCantidad);
        vista.lblCantidad.setText("Cantidad de Registros: "+Main.Lista.CantidadObj());  
        ProcesosIngresar.CargarCombos(vista);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista.btnRegistrar){
            Ingresar pr = ProcesosIngresar.LeerProgramador(vista);
            Main.Lista.AgregarObj(pr);
            ing=ProcesosIngresar.LeerProgramador(vista);
            crud=new CRUD_IngresarAct();
            crud.InsertarActividad(ing);
            ProcesosIngresar.LimpiarEntradas(vista);
            ActualizarTabla();
        }
    }
    
}//FIN DE CLASE
