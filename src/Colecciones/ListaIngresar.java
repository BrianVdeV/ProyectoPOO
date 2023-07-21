
package Colecciones;
import java.util.*;
import Modelo.*;
import Interfaces.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class ListaIngresar implements  Constantes {
    
    
    ArrayList<Ingresar> Lista;
    
    public ListaIngresar(){
        Lista = new ArrayList<Ingresar>();  
    }
    //METODO QUE AGREGA UN OBJETO A LA LISTA
    public void AgregarObj(Ingresar pr){
        Lista.add(pr); 
    }
    //METODO QUE ACTUALIZA EL OBJETO DE LA LISTA
    public void ActualizarObj(Ingresar pr,int posicion){
        Lista.set(posicion,pr);
    }
    //METODO QUE ELIMINA UN OBJETO DE LA LISTA
    public void EliminarObj(int posicion){
        Lista.remove(posicion);  
    }
    //METODO PARA RECUPERAR UN OBJETO
    public Ingresar RecuperarObj(int posicion){
        return Lista.get(posicion);
    }
    //METODO QUE RETORNA LA CANTIDAD DE OBJETOS EN LA LISTA
    public int CantidadObj(){
        return Lista.size();  
    }
    //METODO QUE BUSCA UN OBJETO POR MEDIO DEL NOMBRE DEL PROYECTO 
    //Y RETORNA LA POSICION DEL OBJETO ENCONTRADO
    public int BuscarObj(String proyectbuscado){
        for(int indice=0;indice<Lista.size();indice++){
            if(proyectbuscado.equals(Lista.get(indice).getProyecto()))
                return indice;
        }
        return -1;
    }
    //METODO QUE MUESTRA TODOS LOS REGISTROS DE LA LISTA EN UN JTABLE
    public void MostrarEnTabla(JTable tabla){
        DefaultTableModel modelo = new DefaultTableModel(null,titulos);
        tabla.setModel(modelo);
        for(int indice=0;indice<Lista.size();indice++){
            modelo.addRow(Lista.get(indice).Registro(indice+1));
            
        }
    }

 

   
}//FIN DE LA CLASE
