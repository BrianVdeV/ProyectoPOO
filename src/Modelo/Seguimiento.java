
package Modelo;
import Interfaces.*;
public class Seguimiento extends SeguimientoSistema implements Constantes{
    private String proyecto;
    private String estado;

    public String getProyecto() {return proyecto;}

    public void setProyecto(String proyecto) {this.proyecto = proyecto;}

    public String getEstado() {return estado;}

    public void setEstado(String estado) { this.estado = estado;}
    
  
    @Override
    public String proyecto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String estado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     public Object[] Registro2(int num){
        Object[] fila = {num,proyecto,super.getNtitulo(),estado,super.getPresentacion(),super.getVencimiento()};
                return fila;
    }

}

