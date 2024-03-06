
package InscripcionDeEstudiante;

import java.util.Map;

public class Formato {
    
    private ListaDeCursos tiraDeMaterias;
    
    public Formato(){
	tiraDeMaterias = new ListaDeCursos();
    }
    
    public void elegirCurso(String curso){
	tiraDeMaterias.inscribir(curso);
	actualizarFormato();
    }
    
    public void actualizarFormato(){
	System.out.println("-------------------------------------------------------");
	System.out.println("Materia                 |              Inscrito");
	System.out.println("-------------------------------------------------------");
	for (Map.Entry<String, Boolean> entry : tiraDeMaterias.cursos.entrySet()) {
            String clave = entry.getKey();
            Boolean valor = entry.getValue();
            System.out.println(clave + "                 " + valor);
        }
    }
}
