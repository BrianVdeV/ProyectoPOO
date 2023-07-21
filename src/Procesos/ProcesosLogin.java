package Procesos;

import Modelo.*;
import Vista.*;

public class ProcesosLogin {

    public static void LimpiarEntradas(frmLogin fl) {
        fl.txtUsuario.setText("");
        fl.txtContra.setText("");
        fl.txtUsuario.requestFocus();
    }

    public static Login LeerProgramador(frmLogin fl) {
        Login lo = new Login();
        lo.setUsuario(fl.txtUsuario.getText());
        lo.setContra(fl.txtContra.getText());
        return lo;
    }
}
