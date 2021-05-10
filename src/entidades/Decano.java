package entidades;

public class Decano extends Personal implements Horas_facultad{
    // Atributos
    
    // Constructor
    public Decano(){
        this(null,null,null);
    }
    
    public Decano(String nombre,String apellido,String Cargo_funcion){
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setCargo_funcion(Cargo_funcion);
    }
    
    public double cantidad_horas_mensuales(){
        return 1;
    }
    
    public double sueldo(double sueldo){
        return 1;
    }
}