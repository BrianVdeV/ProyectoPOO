package DAO;
import Modelo.*;
import Formatos.*;
import java.text.SimpleDateFormat;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CRUDseguimiento extends ConectarBD{
    public CRUDseguimiento(){
    }     
    public void MostrarSeguimientos (JTable tabla,JLabel etiqueta2){
        
        String[] titulos={"NUM","PROYECTO","N°TITULO","ESTADO","PRESENTACION","VENCIMIENTO"};
        DefaultTableModel modelo = new DefaultTableModel(null,titulos);
        tabla.setModel(modelo);
        Seguimiento seg = new Seguimiento();
        int cantreg=0;
        //recuperar los datos
        try{
            rs = st.executeQuery("select id_pro, num_seg, est_seg, pre_seg,ven_seg from seguimientos;");
            
            while(rs.next()){
                cantreg++;
                seg.setProyecto(rs.getString(1));
                seg.setNtitulo(rs.getString(2));
                seg.setEstado(rs.getString(3));
                seg.setPresentacion(rs.getString(4));
                seg.setVencimiento(rs.getString(5));
                modelo.addRow(seg.Registro2(cantreg));
            }//fin del while
            etiqueta2.setText("Cantidad de registros : "+cantreg);
        }catch(Exception ex){
           Mensajes.M1("Error: no se puede mostrar Seguimiento..." + ex);
               
        }
    } //fin del método
     public void InsertarSeguimiento(Seguimiento seg){
        try{
            //preparar la consulta
            ps = conexion.prepareStatement(
             " insert into seguimientos values(?,?,?,?);");
            //actualizando los parametros la consulta (?)
            ps.setString(1,seg.getProyecto());
            ps.setString(2,seg.getNtitulo());
            ps.setString(3,seg.getEstado());
            ps.setString(4,seg.getPresentacion());
            ps.setString(5,seg.getVencimiento());
            ps.executeUpdate(); //actualizamos y ejecutamos el insert
          Mensajes.M1("Datos insertados correctamente.");
            conexion.close();
       } catch (Exception ex) {
            Mensajes.M1("Error: no se puede insertar." + ex);
        }
    }//fin del método
}