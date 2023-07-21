package Controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.*;
import Vista.*;
import DAO.*;
import Principal.*;
import Procesos.*;
//Metodo para actualizar las tablas
public class ControladorBoleta implements ActionListener{
    frmBoleta vista1;
    CRUD_BOLETA crud;
    Boleta bot1;
    public ControladorBoleta(frmBoleta forma1){
        this.vista1 = forma1;
        vista1.btnRegistrar1.addActionListener(this);
       ActualizarTabla1();
        
    }
    void ActualizarTabla1(){
         crud = new CRUD_BOLETA();
         crud.MostrarBoletas(vista1.tblDatos1,vista1.lblCantidad1);
         vista1.lblCantidad1.setText("Cantidad de Registros : "+Main.Lista1.CantidadObj());
          ProcesosBoleta.CargarCombos1(vista1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista1.btnRegistrar1){
            Boleta bo = ProcesosBoleta.LeerProgramador1(vista1);
            Main.Lista1.AgregarObj(bo);
            bot1=ProcesosBoleta.LeerProgramador1(vista1);
            crud=new CRUD_BOLETA();
            crud.BoletaSistema(bot1);
            ProcesosBoleta.LimpiarEntradas1(vista1);
            ActualizarTabla1();
        }
 
    }
    
}

