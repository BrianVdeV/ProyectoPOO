package Colecciones;
import java.util.*;
import Modelo.*;
import Interfaces.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
//Metodo que permite agregar datos al jtable
public class ListaBoleta implements Constantes{
    ArrayList<Boleta> Lista1;
    public ListaBoleta(){
        Lista1 = new ArrayList<Boleta>();
    }
    //METODO QUE AGREGA UN OBJETO A LA LISTA
    public void AgregarObj(Boleta bo){
        Lista1.add(bo);   
    }
    //METODO QUE ACTUALIZA UN OBJETO DE LA LISTA
    public void ActualizarObj(Boleta bo, int posicion){
        Lista1.set(posicion,bo);
    }
    //METODO QUE ELIMINA UN OBJETO DE LA LISTA
    public void EliminarObj(int posicion){
        Lista1.remove(posicion);
        
    }
    //METODOO PARA RECUPERAR UN ONJETO
    public Boleta RecuperarObj(int posicion){
        return Lista1.get(posicion);
        
    }
    //METODO QUE RETORNA LA CANTIDAD DE OBJETOS DE LA LISTA
    public int CantidadObj(){
        return Lista1.size();
        
    }
    /************************************************************************************************************
     
    METODO DE BUSCAR UN OBJETO POR MEDIO DE UN CARACTER(dni) Y RETORNA LA POSICION DEL OBEJOT ENCONTRADO
        public int BuscarObj(String dnibuscado){
            for(int indice=0; indice<Lista1.size();indice++){
                if(dnibuscado.equals(Lista1.get(indice).getDni()))
                    return indice;
        }
            return -1;
    **************************************************************************************************/
    //METODO QUE MUESTRA TODOS LOS REGISTROS DE LA LISTA EN LA TABLA EN UN JTABLE
    public void MostrarEnTabla1(JTable tabla1){
        DefaultTableModel modelo1 = new DefaultTableModel(null,titulos1);
        tabla1.setModel(modelo1);
            for(int indice=0;indice<Lista1.size();indice++){
                modelo1.addRow(Lista1.get(indice).Registro1(indice+1));
            }
    }

}

