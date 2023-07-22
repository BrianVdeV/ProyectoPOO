package DAO;

import Modelo.*;
import Formatos.Mensajes;

public class CRUD_Login extends ConectarBD{

        public boolean ValidarLogin(Login login) {
        try {
            String query = "SELECT * FROM usuarios WHERE usuario = ? AND contra= ?";
            ps = conexion.prepareStatement(query);
            ps.setString(1, login.getUsuario());
            ps.setString(2, login.getContra());
            rs = ps.executeQuery();
            return rs.next(); // Si hay algún registro, las credenciales son válidas
        } catch (Exception ex) {
            Mensajes.M1("Error al validar las credenciales del empleado: " + ex);
        }
        return false;
    }
}
