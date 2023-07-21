package DAO;

import Modelo.*;
import Formatos.*;
import java.text.SimpleDateFormat;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CRUD_IngresarAct extends ConectarBD{
    public CRUD_IngresarAct() {
    }
    
//Metodo que muestra en una tabla los datos de Actividades

    public void MostrarActividades(JTable tabla, JLabel etiqueta) {
        String[] titulos = {"Inicio","ID Proyecto", "Actividad" };
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        tabla.setModel(modelo);
        Ingresar ing = new Ingresar();
        int cantreg = 0;
        try {
            rs = st.executeQuery("select ini_act, id_pro, des_act from actividades;");
            while (rs.next()) {
                cantreg++;
                ing.setInicio(rs.getString(1));
                ing.setProyecto(rs.getString(2));
                ing.setActividad(rs.getString(3));
                modelo.addRow(ing.Registro(cantreg));
            }//Fin while
            ManejadorTablas.FormatoTablaCategorias(tabla);
            etiqueta.setText("Cantidad de registros:" + cantreg);
            conexion.close();
        } catch (Exception ex) {
            Mensajes.M1("Error: no se puede mostrar Ingreso..." + ex);
        }//Fin del metodo
    }
    
    
    
        //Metodo que inserta una categoria

    public void InsertarActividad(Ingresar ing) {
        try {
            ps = conexion.prepareStatement("insert into actividades(ini_act, id_pro, des_act) values(now(),?,?);");
            ps.setString(1, ing.getProyecto());
            ps.setString(2, ing.getActividad());
            ps.executeUpdate();
            Mensajes.M1("Datos insertados correctamente.");
            conexion.close();
        } catch (Exception ex) {
            Mensajes.M1("Error: no se puede insertar." + ex);
        }
    }//Fin de metodo
}
