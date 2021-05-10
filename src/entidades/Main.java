
package entidades;

import java.util.Scanner;


public class Main {
    
    public static void main(String[] args){
        
        Decano deca1 = new Decano("Carlos", "Garcia", "Decano");
        
        Asignatura asig1 = new Asignatura("Matematica", 7 , 20);
        Asignatura asig2 = new Asignatura("Programacion", 10, 30);
        Asignatura asig3 = new Asignatura("Base de datos", 4, 10);
        
        Asignatura array[] = null;
        array[0] = asig1;
        array[1] = asig2;
        array[2] = asig3;
        
        Alumno alu1 = new Alumno("Mauro", "Pavesse", 43041735, array);
        Alumno alu2 = new Alumno("Sebastian", "Arias", 42145222, array);
        Alumno alu3 = new Alumno("Malena", "Boe", 44155816, array);
        
        
        array[0] = asig1;
        array[1] = asig2;
        array[2] = null;
        
        Docente doce1 = new Docente("Marcela","Turconi","Docente", array);
        Docente doce2 = new Docente("Pablo", "Llera", "Docente", array);
        
        //PUNTO d-
        alu1.

    }
    
    public Asignatura cargarMateria(){
        Scanner entrada = new Scanner(System.in);
        Asignatura asig = new Asignatura();
        System.out.println("Ingrese nombre de materia: ");
        asig.setNombre(entrada.next());
        System.out.println("Ingrese nota de materia: ");
        asig.setNota(entrada.nextDouble());
        System.out.println("Ingrese horas cursadas: ");
        asig.setHoras(entrada.nextInt());
        return asig;
    }
    
    public Asignatura[] cargarArray(){
        Scanner entrada = new Scanner(System.in);
        Asignatura[] array = null;
        Asignatura asig = new Asignatura();
        for(int i = 0; i<3; i++){
            System.out.println("Ingrese nombre de materia: ");
            asig.setNombre(entrada.next());
            System.out.println("Ingrese nota de materia: ");
            asig.setNota(entrada.nextDouble());
            System.out.println("Ingrese horas cursadas: ");
            asig.setHoras(entrada.nextInt());
            array[i] = asig;
        }
        return array;
    }
    
}
