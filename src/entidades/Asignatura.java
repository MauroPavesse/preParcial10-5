
package entidades;

public class Asignatura{
    
    //ATRIBUTOS
    private String nombre;
    private double nota;
    private int horas_cursadas;
    
    //CONSTRUCTOR
    public Asignatura(String nombre, double nota, int horas_cursadas){
        this.nombre = nombre;
        this.nota = nota;
        this.horas_cursadas = horas_cursadas;
    }
    
    public Asignatura(){
        this(null, 0, 0);
    }
    
    //METODOS
    public double cuenta_horas_cursada(){
        return 1;
    }
    
    public double getNota(){
        return this.nota;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public int getHoras_cursadas(){
        return this.horas_cursadas;
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
    
    //metodo para mostrar esta clase
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();   
        sb.append("\nNombre: ");
        sb.append(nombre);
        sb.append("\nNota: ");
        sb.append(nota); 
        return sb.toString();
    }
    
}
