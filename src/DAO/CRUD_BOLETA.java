package DAO;

import Modelo.*;
import Formatos.*;
import javax.swing.JLabel;
import javax.swing.JTable;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;

public class CRUD_BOLETA extends ConectarBD {

    public CRUD_BOLETA() {
    }

    //Metodo que muestra en una tabla los datos de Boleta
    public void MostrarBoletas(JTable tabla, JLabel etiqueta) {
        String[] titulos = {"num", "Tipo","Detalles", "CLIENTE", "UBICACION", "DNI"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        tabla.setModel(modelo);
        Boleta bot1 = new Boleta();
        int cantreg = 0;
        try {
            rs = st.executeQuery("select bot_Tipo, bot_Detalles, bot_Cli,bot_ubi,dni_cli from Boletas;");
            while (rs.next()) {
                cantreg++;
                bot1.setTipo(rs.getString(1));
                bot1.setDetalles(rs.getString(2));
                bot1.setCliente(rs.getString(3));
                bot1.setUbicacion(rs.getString(4));
                bot1.setDni(rs.getString(5));
                modelo.addRow(bot1.Registro1(cantreg));
            }//Fin while
            ManejadorTablas.FormatoTablaCategorias(tabla);
            etiqueta.setText("Cantidad de registros:" + cantreg);
            conexion.close();
        } catch (Exception ex) {
            Mensajes.M1("Error: no se puede mostrar Boleta..." + ex);
        }//Fin del metodo
    }

    //Metodo que inserta una categoria
    public void BoletaSistema(Boleta bot1) {
        try {
                ps = conexion.prepareStatement("insert into boletas (bot_Tipo, bot_Detalles, bot_Cli,bot_ubi,dni_cli ) values(now(),?,?);");
            ps.setString(1, bot1.getDetalles());
            ps.setString(2, bot1.getCliente());
            ps.setString(3, bot1.getUbicacion());
            ps.setString(4, bot1.getDni());
            ps.executeUpdate();
            Mensajes.M1("Datos insertados correctamente.");
            conexion.close();
        } catch (Exception ex) {
            Mensajes.M1("Error: no se puede insertar." + ex);
        }
    }//Fin de metodo
}
