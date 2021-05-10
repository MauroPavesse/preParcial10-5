
package entidades;

public class Alumno implements Horas_facultad{
    // Atributos
    private String nombre;
    private String apellido;
    private long dni;
    public Asignatura[] m_asignatura;
    
    // Constructor
    
    public Alumno(){
        
    }
    
   
    public Alumno(String nombre,String apellido,long dni,Asignatura[] m_asignatura){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.m_asignatura = m_asignatura;
    }

    
    
    // Metodos
    public void finalice(){
    
    }
    
    public double Promedio(){
        double prom = 0;
        for (int i=0;i<m_asignatura.length;i++){
            prom += m_asignatura[i].getNota();
        }
        return prom = (prom/m_asignatura.length);
    }
    
    public double cantidad_horas_mensuales(){
        return 1;
    }
    
    public String asignatura_aprobada(){
        for(int i = 0; i<m_asignatura.length; i++){
            if(m_asignatura[i].getNota() >= 7){
                m_asignatura[i].toString();
                return "Aprobado";
            }
            else{
                return "Desaprobado";
            }
        }
        return null;
    }
   
    
}