package Colecciones;
import java.util.*;
import Modelo.*;
import Interfaces.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class ListaSeguimiento implements Constantes{
    ArrayList<Seguimiento> Lista2;
    public ListaSeguimiento(){
        Lista2 = new ArrayList<Seguimiento>();
    }
    //METODO QUE AGREGA UN OBJETO A LA LISTA
    public void AgregarObj(Seguimiento se){
        Lista2.add(se);   
    }
    //METODO QUE ACTUALIZA UN OBJETO DE LA LISTA
    public void ActualizarObj(Seguimiento se, int posicion){
        Lista2.set(posicion,se);
    }
    //METODO QUE ELIMINA UN OBJETO DE LA LISTA
    public void EliminarObj(int posicion){
        Lista2.remove(posicion);
        
    }
    //METODOO PARA RECUPERAR UN ONJETO
    public Seguimiento RecuperarObj(int posicion){
        return Lista2.get(posicion);
        
    }
    //METODO QUE RETORNA LA CANTIDAD DE OBJETOS DE LA LISTA
    public int CantidadObj(){
        return Lista2.size();
        
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
    public void MostrarEnTabla2(JTable tabla2){
        DefaultTableModel modelo2 = new DefaultTableModel(null,titulos2);
        tabla2.setModel(modelo2);
            for(int indice=0;indice<Lista2.size();indice++){
                modelo2.addRow(Lista2.get(indice).Registro2(indice+1));
            }
    }

    
}
