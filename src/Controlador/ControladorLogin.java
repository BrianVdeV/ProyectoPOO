package Controlador;

import Modelo.*;
import Vista.*;
import DAO.*;
import Formatos.Mensajes;
import Principal.*;
import Procesos.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorLogin implements ActionListener {

    frmLogin vista;
    CRUD_Login crud; // c: create r:read  u:update   d=delete
    Login log;

    public ControladorLogin(frmLogin vista) {
        this.vista = vista;
        crud = new CRUD_Login();
        log = new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnIngresar) {
            String usuario = vista.txtUsuario.getText();
            String contra = vista.txtContra.getText(); // Obtiene la contraseña como una cadena

            log = crud.ValidarLogin(usuario, contra);
            if (log == null) {
                Mensajes.M1("El usuario o contraseña son incorrectos.");
            } else {
                // Si el inicio de sesión es exitoso, muestra el formulario "frmPanel"
                frmPanel panel = new frmPanel();
                panel.setVisible(true);
                vista.dispose(); // Cierra el formulario de inicio de sesión
            }
        }
    }
}