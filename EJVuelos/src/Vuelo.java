import java.util.*;


public class Vuelo {

private int num;
private String destino;
private  Calendar fecha;
private Calendar hora;
private int n=0;

public Vuelo(){
	
	
}






public Vuelo(int num,String destino,Calendar fecha){

	this.num=num;
	this.destino=destino;
	this.fecha=fecha;
			
	
}

//---------------getandset-----------
public int getNum() {
	return num;
}





public void setNum(int num) {
	this.num = num;
}





public String getDestino() {
	return destino;
}





public void setDestino(String destino) {
	this.destino = destino;
}





public Calendar getFecha() {
	return fecha;
}





public void setFecha(Calendar fecha) {
	this.fecha = fecha;
}





public Calendar getHora() {
	return hora;
}





public void setHora(Calendar hora) {
	this.hora = hora;
}





public int getN() {
	return n;
}





public void setN(int n) {
	this.n = n;
}





@Override
public String toString() {
	String s=" ";
	return "Vuelo [num=" + num + ", destino=" + destino + ", fecha=" + fecha.get(Calendar.DATE)+"/"+fecha.get(Calendar.MONTH)+"/"+fecha.get(Calendar.YEAR)
			+ ", hora=" + fecha.get(Calendar.HOUR) +":"+fecha.get(Calendar.MINUTE)+ "]";
	
	

}


public int compareTo(Vuelo v){
	
	return this.fecha.compareTo(v.fecha);
	
	
}
//public int compareToDestino(Vuelo v){
	

	
//}

}
