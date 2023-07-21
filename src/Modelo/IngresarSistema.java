package Modelo;

public abstract class IngresarSistema {
    private String inicio;
    private String actividad;
    private String proyecto;


    public String getInicio()                   {     return inicio;      }
    public void setInicio(String inicio)        {      this.inicio = inicio;       }
    public String getActividad()                {      return actividad;     }
    public void setActividad(String actividad)  {        this.actividad = actividad;     }
    public String getProyecto()                 {       return proyecto;       }
    public void setProyecto(String proyecto)    {      this.proyecto = proyecto;       }
    
    
    
    
    
    
    
    
    
     //  METODOS ABSTRACTOS
    public abstract String ot();
    
}//FIN DE LA CLASE
