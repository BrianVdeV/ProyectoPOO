package DAO;

import Modelo.*;
import Formatos.Mensajes;

public class CRUD_Login extends ConectarBD{

    //Metodo que recupera una categoria por medio del id
    public Login ValidarLogin(String usuario,String contra) {
        Login log = null;
        try {
            rs = st.executeQuery("select * from usuarios where usuario ='"+usuario+"' and contra=" + contra + ";");
            if (rs.next()) {
                log = new Login();
                log.setUsuario(rs.getString(1));
                log.setContra(rs.getString(2));
            }
        } catch (Exception ex) {
            Mensajes.M1("Error: no se puede consultar el registro.." + ex);
        }
        return log;
    }//Fin del metodo
}
