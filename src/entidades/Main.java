
package entidades;

import java.util.Scanner;


public class Main {
    
    public static void main(String[] args){
        
        //DECANO
        Decano deca1 = new Decano("Carlos", "Garcia", "Decano");
        
        //ASIGNATURAS
        Asignatura asig1 = new Asignatura("Matematica", 7 , 20);
        Asignatura asig2 = new Asignatura("Programacion", 10, 30);
        Asignatura asig3 = new Asignatura("Base de datos", 4, 10);
        
        Asignatura[] asig = {asig1, asig2, asig3};
        
        //ALUMNOS
        Asignatura[] array1 = {asig1, asig2};
        Alumno alu1 = new Alumno("Mauro", "Pavesse", 43041735, array1);
        Asignatura[] array2 = {asig2, asig3};
        Alumno alu2 = new Alumno("Sebastian", "Arias", 42145222, array2);
        Asignatura[] array3 = {asig1, asig3};
        Alumno alu3 = new Alumno("Malena", "Boe", 44155816, array3);
        
        Alumno[] alu = {alu1, alu2, alu3};
        
        //DOCENTES
        Docente doce1 = new Docente("Marcela","Turconi","Docente", array1);
        Docente doce2 = new Docente("Pablo", "Llera", "Docente", array2);
        
        Docente[] doce = {doce1, doce2};
        
        //PUNTO d-
        System.out.println("MOSTRANDO PARA CADA ALUMNO QUE ASIGNATURA TIENE APROBADA Y CON QUÉ NOTA\n");
        for(int i = 0; i<alu.length; i++){
            System.out.print(alu[i].getNombre()+" "+alu[i].getApellido());
            alu[i].mostrar_aprobada();
            System.out.println("=========================================================================");
        }    
        
        //PUNTO e-
        System.out.println("MOSTRANDO POR CADA ALUMNO SU PROMEDIO Y LAS HORAS CURSADAS\n");
        for(int i = 0; i<alu.length; i++){
            System.out.print(alu[i].getNombre()+" "+alu[i].getApellido());
            System.out.println(alu[i].toString());
            System.out.println("*************************************************************************");
        }
        
        //PUNTO f-
        System.out.println("MOSTRANDO PARA CADA PERSONA CUANTAS HORAS TRABAJA POR MES Y CUAL ES SU SUELDO");
        for(int i = 0; i<doce.length; i++){
            System.out.println(doce[i].toString());
            System.out.println("-------------------------------------------------------------------------");
        }
        System.out.println(deca1.toString());
    }
    
}
