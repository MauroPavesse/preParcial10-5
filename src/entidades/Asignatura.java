
package entidades;

public class Asignatura{
    
    private String nombre;
    private double nota;
    private int horas_cursadas;
    
    public Asignatura(){
        
        
    }
    
    public Asignatura(String nombre, double nota, int horas_cursadas){
        this.nombre = nombre;
        this.nota = nota;
        this.horas_cursadas = horas_cursadas;
    }
    
    public double cuenta_horas_cursada(Horas_facultad horas){
        return 1;
    }
    
    public double getNota(){
        return 1;
    }
    
    public String getNombre(){
        return "";
    }
    
    public int getHoras_cursadas(){
        return 1;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setNota(double nota){
        this.nota = nota;
    }
    
    public void setHoras(int horas){
        this.horas_cursadas = horas;
    }
    
}
