
package Modelo;

public abstract class SeguimientoSistema {
   
    private String ntitulo;
    private String presentacion;
    private String vencimiento;

    public String getNtitulo() {
        return ntitulo;
    }

    public void setNtitulo(String ntitulo) {
        this.ntitulo = ntitulo;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public String getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(String vencimiento) {
        this.vencimiento = vencimiento;
    }
    
  //METODOS ABSTRACTOS
    public abstract String proyecto();
    public abstract String estado();
    
}
 
