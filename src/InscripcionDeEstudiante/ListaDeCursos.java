package InscripcionDeEstudiante;

import java.util.HashMap;

public class ListaDeCursos {
    
    public HashMap<String, Boolean> cursos;
    
    public ListaDeCursos(){
	cursos= new HashMap<>();
	cursos.put("Matematicas      ", false);
	cursos.put("COE             ", false);
	cursos.put("Ciencias        ", false);
	cursos.put("Formacion civica", false);
    }
    
    public void inscribir(String curso){
	this.cursos.put(curso, true);
    }
  
}
