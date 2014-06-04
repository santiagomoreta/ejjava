import java.util.EmptyStackException;

public class Examen implements Examinable , Comparable{
Fecha f;
Hora h;
String modulo;
int numeroalumnos;
public Examen(){
	
}
public Examen(Fecha f, Hora h, String modulo, int num)throws ExeptionAlumnos{
	this.f=f;
	this.h=h;
	this.modulo=modulo;
	if(num<5){
		throw new ExeptionAlumnos("hay menos de 5 alumnos");
	}
	this.numeroalumnos=num;
}

public int  hayAlumnos() {
	
	return this.numeroalumnos;
}
//----------------get&&set----------------
public Fecha primerDia(){
	return this.f;
}
public Fecha getF() {
	return f;
}
public void setF(Fecha f) {
	this.f = f;
}
public Hora getH() {
	return h;
}
public void setH(Hora h) {
	this.h = h;
}
public String getModulo() {
	return modulo;
}
public void setModulo(String modulo) {
	this.modulo = modulo;
}
public int getNumeroalumnos() {
	return numeroalumnos;
}
public void setNumeroalumnos(int numeroalumnos) {
	this.numeroalumnos = numeroalumnos;
}
public String toString(){
	return "EXAMEN:   "+this.modulo+"   fecha: "+this.f+"   "+"hora:"+this.h+"    "+"num alumnos:"+this.numeroalumnos;
	}
@Override
public int compareTo(Object o) {
	Examen p=(Examen)o;
return this.f.compareTo(p.f);
}

}
