
public class Proyecto implements Examinable,Comparable{
	Fecha f;
	Hora h;
	String titulo;
	String[] alumnos;

	public Proyecto(){
		
	}
	public Proyecto(Fecha f, Hora h, String ti, String [] al)throws ExeptionAlumnos{
		this.f=f;
		this.h=h;
		this.titulo=ti;
		if(al.length<5){
			throw new ExeptionAlumnos("Error hay menos de 5 alumnos");
		}
		this.alumnos=al;
	}
	
	
	public int hayAlumnos() {
		
	return this.alumnos.length;
	}
	public Fecha primerDia(){
		return this.f;
	}
	
	//----------------get&&set
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
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String[] getAlumnos() {
		return alumnos;
	}
	public void setAlumnos(String[] alumnos) {
		this.alumnos = alumnos;
	}
	
	public String toString(){
		return "PROYECTO:  "+this.titulo+"   fecha: "+this.f+"   "+"hora:"+this.h+"    "+"num alumnos:"+this.alumnos.length;
		}
	@Override
	public int compareTo(Object o) {
		Proyecto f=(Proyecto)o;
		return this.f.compareTo(f.f);
	}
	
	
	
}
