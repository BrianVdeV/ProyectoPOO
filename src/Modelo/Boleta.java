
package Modelo;

import Interfaces.*;


public class Boleta extends BoletaSistema implements Constantes{
    
    private String tipo;
    public Boleta(){}
    public String getTipo() {return tipo;}

    public void setTipo(String tipo) {this.tipo = tipo;}
    
    
    

    @Override
    public String tipo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public Object[] Registro1(int num){
        Object[] fila = {num,tipo,super.getDetalles(),super.getCliente(),super.getUbicacion(),super.getDni() };
        return fila;
    }
}