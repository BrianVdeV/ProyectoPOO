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
    CRUD_Login crud;
    Login log;

    public ControladorLogin(frmLogin vista) {
        this.vista = vista;
        crud = new CRUD_Login();
        log = new Login();
        vista.btnIngresar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnIngresar) {
            String usuario = vista.txtUsuario.getText();
            String contra = vista.txtContra.getText();

            // Crear un objeto Login con las credenciales ingresadas
            Login login = new Login();
            login.setUsuario(usuario);
            login.setContra(contra);

            // Validar las credenciales utilizando el método ValidarLogin de CRUD_Login
            if (crud.ValidarLogin(login)) {
                // Si las credenciales son válidas, mostrar el formulario "frmPanel"
                frmPanel panel = new frmPanel();
                ControladorPanel cp = new ControladorPanel(panel);
                Mensajes.M1("Bienvenido!!!");
                panel.setVisible(true);
                panel.setLocationRelativeTo(null);
                vista.dispose(); // Cierra el formulario de inicio de sesión
            } else {
                Mensajes.M1("El usuario o contraseña son incorrectos.");
            }
        }
    }
}
