import java.util.Iterator;
import java.util.TreeSet;


public class Main {

	public static void main(String[] args) throws ExeptionAlumnos {
		Fecha f1= new Fecha(10,12,2014);
		Fecha f2= new Fecha(8,11,2014);
		Fecha f3= new Fecha(11,12,2014);
		Examen ex1=new Examen(f1,new Hora(12,35),"Programacion",15);
		Examen ex2=new Examen(f2,new Hora(9,10),"sistemas",20);
		Examen ex3=new Examen(f3,new Hora(8,35),"bbdd",10);
		
	
		
		Fecha f11= new Fecha(10,8,2014);
		Fecha f12= new Fecha(18,01,2014);
		Fecha f13= new Fecha(1,07,2014);
		String a[] ={"santiago","juan","jose","manuel","sebas","fgsjd"};
		Proyecto ex11=new Proyecto(f11,new Hora(11,30),"Programacion",a);
		Proyecto ex12=new Proyecto(f12,new Hora(9,15),"sistemas",a);
		Proyecto ex13=new Proyecto(f13,new Hora(8,39),"bbdd",a);
	

		Examenes exam=new Examenes();
		exam.Insertar(ex1);
		exam.Insertar(ex11);
		exam.Insertar(ex2);
		exam.Insertar(ex3);
		exam.Insertar(ex12);
		exam.Insertar(ex13);

		
Grupo grupo=new Grupo("daw",1001);
Grupo grupo1=new Grupo("dai",2002);
Grupo grupo2=new Grupo("dam",3003);

//System.out.println(grupo2);

ExamenesFinales ef=new ExamenesFinales();
ef.add(grupo, exam);


System.out.println(ef);


	}

}
