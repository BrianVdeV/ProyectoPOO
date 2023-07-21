
package Modelo;

import Interfaces.*;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
public class Finalizar extends FinalizarSistema implements Constantes {
    
    public Object[]  Registro3(int num){
        Object[] fila={num,super.getHfin(),super.getComentario()};
        return fila;
    }

    
}


