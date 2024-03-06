package despliegaMedicionesDeSensores;

import java.util.Random;

public class SensorProxy {
    
    public int[] updateData(){
	Random rand = new Random();
	int[] datos = new int[5];
		
	for (int i = 0; i < 5; i++) {
	    datos[i] = rand.nextInt();
	}
	
	return datos;
    }
    
}
