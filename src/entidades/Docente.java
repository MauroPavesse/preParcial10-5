
package entidades;

public class Docente extends Personal implements Horas_facultad{
    // Atributos
    
    public Asignatura[] m_asignatura;
    
    // Constructor
    
    public Docente(){
        this(null,null,null,null);
    }
    
    public Docente(String nombre,String apellido,String Cargo_funcional,Asignatura[] m_asignatura){
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setCargo_funcion(Cargo_funcional);
        this.m_asignatura = m_asignatura;
    }

    
    // Metodos
    
    public double cantidad_horas_mensuales(){
        return 1;
    }
    
    public double sueldo(double sueldo){
        return 1;
    }
}
