
package entidades;

public class Alumno implements Horas_facultad{
    // Atributos
    private String nombre;
    private String apellido;
    private long dni;
    public Asignatura[] m_asignatura;
    
    // Constructor
   
    public Alumno(String nombre,String apellido,long dni,Asignatura[] m_asignatura){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.m_asignatura = m_asignatura;
    }

    public Alumno(){
        this(null, null, 0, null);
    }
    
    
    // Metodos
    public String getNombre(){
        return this.nombre;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nPromedio: ");
        sb.append(Promedio());
        sb.append("\nHoras cursadas: ");
        sb.append(cantidad_horas_mensuales()); 
        return sb.toString();
    }
    
    public void finalice(){
    
    }
    
    public double cantidad_horas_mensuales(){
        double cant = 0;
        for (int i=0;i<m_asignatura.length;i++){
        
            cant+= m_asignatura[i].getHoras_cursadas();
        
        }
        return cant;
    }
    
    public double Promedio(){
        double prom = 0;
        for (int i=0;i<m_asignatura.length;i++){
            
            prom += m_asignatura[i].getNota();
        }
        return prom = (prom/m_asignatura.length);
    }
    
    public String Asignatura_aprobada(int i){
        if(m_asignatura[i].getNota() >= 7)
            return "APROBADA";
        else
            return "DESAPROBADA";
    }
    
    public void mostrar_aprobada(){
        for(int i = 0; i<m_asignatura.length; i++){
            if(Asignatura_aprobada(i) == "APROBADA"){
                System.out.println(m_asignatura[i].toString());
            }
        }
    }
}