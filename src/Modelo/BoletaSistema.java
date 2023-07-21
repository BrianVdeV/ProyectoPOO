
package Modelo;

public abstract class BoletaSistema {

    private String Detalles ;
    private String Cliente;
    private String Ubicacion;
    private String Dni;

    public String getDetalles() {
        return Detalles;
    }

    public void setDetalles(String Detalles) {
        this.Detalles = Detalles;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

   
    public String getDni() {
        return Dni;
    }

    public void setDni(String Dni) {
        this.Dni = Dni;
    }


   
    
    //METODOS ABSTRACTOS
    
    public abstract String tipo();
    
    
}//FIN DE LA CLASE
