package InscripcionDeEstudiante;
import java.util.Scanner;

public class Demo {
     public static void main(String args[]){
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Ingrese el curso:");
	String curso = scanner.nextLine();
	
	Formato formatoDeInscripcion = new Formato();
	
	formatoDeInscripcion.elegirCurso(curso);
	
    }
}