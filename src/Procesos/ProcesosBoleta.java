package Procesos;
//LIBRERIAS
import Interfaces.*;
import Modelo.*;
import Vista.*;
//en este proceso agregamos el metodo para limpiar entradas
public class ProcesosBoleta implements Constantes{
    public static void LimpiarEntradas1(frmBoleta fb){
        fb.cbxtipo.setSelectedIndex(0); 
        fb.txtDetalles.setText("");
        fb.txtCliente.setText("");
        fb.txtUbicacion.setText(""); 
        fb.txtDni.setText("");
        fb.txtDetalles.requestFocus();
    }
    
    //metodo para leer los datos
    public static Boleta LeerProgramador1(frmBoleta fb){
        Boleta bo= new Boleta();
        bo.setTipo(fb.cbxtipo.getSelectedItem().toString());
        bo.setDetalles(fb.txtDetalles.getText());
        bo.setCliente(fb.txtCliente.getText());
        bo.setUbicacion(fb.txtUbicacion.getText());
        bo.setDni(fb.txtDni.getText());
      
        return bo;
  
} 
    //METODO QUE COMPLETA LOS COMBOS CON LOS DDATOS DE LA INTERFACE
    public static void CargarCombos1(frmBoleta fb){
        fb.cbxtipo.removeAllItems();
        for(int i=0;i<Tipo1.length;i++)
            fb.cbxtipo.addItem(Tipo1[i]);
            
    }
    
}

