import java.util.*;


public class Vuelos {
private Vuelo[] vuelos;
int i;

public Vuelos(){
	vuelos=new Vuelo[10];
}

public boolean aniadirVuelo(Vuelo v){
	if(i<11){
	vuelos[i]=v;
	i++;
	return true;
	}
	
	return false;
	
}

public void visualizar(){
	for(int j=0;j<this.i;j++){
		System.out.println(vuelos[j].toString());
	}
	
}


public void ordenarnum(){
	Vuelo aux;
	for( int j=1;j<this.i;j++){
		for(int k=0;k<this.i-1;k++){
			if(this.vuelos[j].getNum()<this.vuelos[k].getNum()){
				aux=vuelos[k];
				vuelos[k]=vuelos[j];
				vuelos[j]=aux;
			
			}
		}
	}
	
	
	
	
}
public void ordenarfecha(){

	Vuelo aux;
	for( int j=0;j<this.i;j++){
		for(int k=0;k<this.i;k++){
			if((this.vuelos[j].compareTo(vuelos[k]))==1){
				aux=vuelos[k];
				vuelos[k]=vuelos[j];
				vuelos[j]=aux;
			
			}
		}
	}
	
	
	}
public void ordenarDestino(){
	Vuelo aux;
	for( int j=0;j<this.i;j++){
		for(int k=0;k<this.i;k++){
			if(this.vuelos[j].getDestino().compareTo(this.vuelos[k].getDestino())<0){
				aux=vuelos[k];
				vuelos[k]=vuelos[j];
				vuelos[j]=aux;
			
			}
		}
	}
	
	}







	


	
	
}















