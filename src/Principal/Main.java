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
     
    public static void main(String[] args) {
        //CREANDO UN FORMULARIO Y ENVIANDOLO A SU CONTROLADOR
        fpanel = new frmPanel();
        ControladorPanel cp = new ControladorPanel(fpanel);
        fpanel.setTitle("Aplicativo");
        fpanel.setVisible(true);
        fpanel.setLocationRelativeTo(null);
        
        
        Lista = new ListaIngresar();
        Lista1 =new ListaBoleta();
        Lista2 = new ListaSeguimiento();
        Lista3= new ListaFinalizar();
            }    
}
