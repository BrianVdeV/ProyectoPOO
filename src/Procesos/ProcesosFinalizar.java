
package Procesos;
import Interfaces.*;
import Modelo.*;
import Vista.*;
public class ProcesosFinalizar implements Constantes{
    public static void LimpiarEntradas (frmFinalizarActividad ffa){
        ffa.txtHora.setText("");
        ffa.txtComentario.setText("");
        
    }

    public static Finalizar LeerProgramador(frmFinalizarActividad fia) {
        Finalizar fi = new Finalizar();
        fi.setHfin(fia.txtHora.getText());
        fi.setComentario(fia.txtComentario.getText());
        return fi;
        
    }
    
}
