
package entidades;


public class Personal {
    
    //ATRIBUTOS
    private String nombre;
    private String apellido;
    private String cargo_funcion;
    
    //CONSTRUCTOR
    public void Personal(String nombre, String apellido, String cargo_funcion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo_funcion = cargo_funcion;
    }
    
    public void Personal(){
        this.Personal(null, null, null);
    }
    
    //METODOS
    public double Sueldo(double sueldo){
        return sueldo;
    }
    
    public double Sueldo(double sueldo, double cantidad_horas){
        return sueldo;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public String getCargo_funcion(){
        return this.cargo_funcion;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public void setCargo_funcion(String cargo_funcion){
        this.cargo_funcion = cargo_funcion;
    }
    
}
