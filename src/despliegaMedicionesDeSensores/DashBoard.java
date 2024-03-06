
package despliegaMedicionesDeSensores;

public class DashBoard {
    private int[] datos;
    private SensorProxy sensoresProxy;
    
    public DashBoard(){
	sensoresProxy = new SensorProxy();
    }
    
    private void updateDisplay(){
	for (int dato : datos) {
	    System.out.println(dato);
	}
    }
    
    public void despliega_sensores(){
	
	datos = sensoresProxy.updateData();
	
	updateDisplay();
    }
}
