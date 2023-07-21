package Modelo;

import Interfaces.*;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class Ingresar extends IngresarSistema implements Constantes {

    private String ot;

    public Ingresar() {
    }

    public String getOt() {
        return ot;
    }

    public void setOt(String ot) {
        this.ot = ot;
    }

    public Object[] Registro(int num) {
        Object[] fila = {super.getInicio(), super.getProyecto(), super.getActividad()};
        return fila;
    }

    @Override
    public String ot() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Vector<?> RegistroCategoria(int cantreg) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
