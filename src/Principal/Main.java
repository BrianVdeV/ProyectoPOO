package Principal;
//LIBRERIA

import Vista.*;
import Controlador.*;
import Colecciones.*;
//Se crea un menu donde se importan los paquetes para poder ejecutar el menus con los formularios 

public class Main {

    public static frmPanel fpanel;
    public static frmIngresarActividad fingresaractividad;
    public static ListaIngresar Lista;
    public static frmBoleta fboleta;
    public static ListaBoleta Lista1;
    public static frmSeguimiento fseguimiento;
    public static ListaSeguimiento Lista2;
    public static frmFinalizarActividad ffinalizaractividad;
    public static ListaFinalizar Lista3;
    public static frmLogin flogin;

    public static void main(String[] args) {
        //CREANDO UN FORMULARIO Y ENVIANDOLO A SU CONTROLADOR
        flogin = new frmLogin();
        ControladorLogin cl = new ControladorLogin(flogin);
        flogin.setTitle("Inicio de Sesión");
        flogin.setVisible(true);
        flogin.setLocationRelativeTo(null);
        
        frmSeguimiento fs = new frmSeguimiento();
        ControladorSeguimiento cs2 = new ControladorSeguimiento(fs);
        Lista = new ListaIngresar();
        Lista1 = new ListaBoleta();
        Lista2 = new ListaSeguimiento();
        Lista3 = new ListaFinalizar();
    }
}
