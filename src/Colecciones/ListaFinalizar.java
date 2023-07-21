package Colecciones;
import java.util.*;
import Modelo.*;
import Interfaces.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class ListaFinalizar implements Constantes{
    ArrayList<Finalizar> Lista3;
    public ListaFinalizar(){
        Lista3 = new ArrayList<Finalizar>();
    }
    //METODO QUE AGREGA UN OBJETO A LA LISTA
     public void AgregarObj(Finalizar fi){
        Lista3.add(fi);
     }
     //METODO QUE ACTUALIZA UN OBJETO DE LA LISTA
    public void ActualizarObj(Finalizar fi, int posicion){
        Lista3.set(posicion,fi);
    } //METODO QUE ELIMINA UN OBJETO DE LA LISTA
    public void EliminarObj(int posicion){
        Lista3.remove(posicion); 
    }
    //METODOO PARA RECUPERAR UN ONJETO
    public Finalizar RecuperarObj(int posicion){
        return Lista3.get(posicion);
        
    }
    //METODO QUE RETORNA LA CANTIDAD DE OBJETOS DE LA LISTA
    public int CantidadObj(){
        return Lista3.size();
        
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
    public void MostrarEnTabla3(JTable tabla3){
        DefaultTableModel modelo3 = new DefaultTableModel(null,titulos3);
        tabla3.setModel(modelo3);
            for(int indice=0;indice<Lista3.size();indice++){
                modelo3.addRow(Lista3.get(indice).Registro3(indice+1));
            }
    }
}

