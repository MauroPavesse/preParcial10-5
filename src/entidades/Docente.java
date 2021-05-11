
package entidades;

public class Docente extends Personal implements Horas_facultad{
    // Atributos
    
    public Asignatura[] m_asignatura;
    
    // Constructor
    
    public Docente(String nombre,String apellido,String Cargo_funcional,Asignatura[] m_asignatura){
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setCargo_funcion(Cargo_funcional);
        this.m_asignatura = m_asignatura;
    }
    
    public Docente(){
        this(null,null,null,null);
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
        double cant = 0;
        for (int i=0;i<m_asignatura.length;i++){
        
            cant+= m_asignatura[i].getHoras_cursadas();
        
        }
        return (cant*4)+40;
    }
    
    public double sueldo(double horas){
        return horas*120;
    }
}
