package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.*;
import javax.swing.JInternalFrame;

public class ControladorPanel implements ActionListener {

    frmPanel vista;

    public ControladorPanel(frmPanel vista) {
        this.vista = vista;
        vista.btnIngresar.addActionListener(this);
        vista.btnBoleta.addActionListener(this);
        vista.btnSeguimiento.addActionListener(this);
        vista.btnFinalizar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnIngresar) {
            frmIngresarActividad fia = new frmIngresarActividad();
            ControladorIngresarActividad cia = new ControladorIngresarActividad(fia);

            AgregarFrame(fia);
            fia.setTitle("Ingresar Actividad...");
            fia.setVisible(true);

        }
        if (e.getSource() == vista.btnBoleta) {
            frmBoleta fb = new frmBoleta();
            ControladorBoleta cb = new ControladorBoleta(fb);

            AgregarFrame(fb);
            fb.setTitle("Boleta...");
            fb.setVisible(true);
        }
        if (e.getSource() == vista.btnSeguimiento) {
            frmSeguimiento fs = new frmSeguimiento();
            ControladorSeguimiento cs = new ControladorSeguimiento(fs);
            AgregarFrame(fs);
            fs.setTitle("Seguimiento...");
            fs.setVisible(true);
        }
        if (e.getSource() == vista.btnFinalizar) {
            frmFinalizarActividad ffa = new frmFinalizarActividad();
            ControladorFinalizarActividad cf = new ControladorFinalizarActividad(ffa);
            AgregarFrame(ffa);
            ffa.setTitle("Finalizar Actividad...");
            ffa.setVisible(true);
        }

    }//FIN 
    //METODO QUE PERMITE AGREGAR UN INTERNALFRAME AL DESKTOP PANE

    void AgregarFrame(JInternalFrame frame) {
        vista.dspEscritorio.removeAll();
        vista.dspEscritorio.add(frame);
        vista.dspEscritorio.repaint();
    }

}//FIN DE LA CLASE

