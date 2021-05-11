package entidades;

public class Decano extends Personal implements Horas_facultad{
    // Atributos
    
    // Constructor
    
    public Decano(String nombre,String apellido,String Cargo_funcion){
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setCargo_funcion(Cargo_funcion);
    }
    
    public Decano(){
        this(null,null,null);
    }
    
    // Metodos
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getNombre()+" "+this.getApellido());
        sb.append("\nHoras trabajadas por mes: ");
        sb.append(cantidad_horas_mensuales());
        sb.append("\nSueldo: ");
        sb.append(sueldo(cantidad_horas_mensuales())); 
        return sb.toString();
    }
    
    public double cantidad_horas_mensuales(){
        return 30*4;
    }
    
    public double sueldo(double sueldo){
        return sueldo*160;
    }
}