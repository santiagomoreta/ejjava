
public class Grupo {
	String nombre;
	int numeromodulo;

	public Grupo(){
		
	}
	public Grupo(String s, int i){
		this.nombre=s;
		this.numeromodulo=i;
	}
	
	public String toString(){
		return this.nombre+"  "+"numº: "+this.numeromodulo;
		
		
	}
	
}
