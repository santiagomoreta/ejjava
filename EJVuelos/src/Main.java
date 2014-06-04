import java.util.*;
import java.util.GregorianCalendar;
public class Main {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
	
		Calendar f1 = Calendar.getInstance();
		Calendar f2 = Calendar.getInstance();
		Calendar f3 = Calendar.getInstance();
		Calendar f4 = Calendar.getInstance();
		Calendar f5 = Calendar.getInstance();
		f1.set(2014, 10, 1,8,45,00);
		f2.set(2000, 06, 12,23,30,00);
		f3.set(2013, 01, 10,19,45,00);
		f4.set(2014, 06, 11,05,30,00);
		f5.set(2014, 06, 11,05,35,00);
		Vuelo v1=new Vuelo(3,"miami",f1);
		Vuelo v2=new Vuelo(2,"tokio",f2);
		Vuelo v3=new Vuelo(1,"berlin",f3);
		Vuelo v4=new Vuelo(4,"quito",f4);
		Vuelo v5=new Vuelo(5,"caracas",f5);
		Vuelos vuelos=new Vuelos();
		vuelos.aniadirVuelo(v1);
		vuelos.aniadirVuelo(v2);
		vuelos.aniadirVuelo(v3);
		vuelos.aniadirVuelo(v4);
		vuelos.aniadirVuelo(v5);
		vuelos.visualizar();
		System.out.println("-------------------ordenado por num de vuelo--------------------------------");
		 vuelos.ordenarnum();
		vuelos.visualizar();
		System.out.println("-----------------------------ordenar por fecha-------------------------");
	
		vuelos.ordenarfecha();
		vuelos.visualizar();
		System.out.println("/----------------------------ordenar por destino a-z----------------------------------------");
		
	vuelos.ordenarDestino();
		
		
		vuelos.visualizar();
		
		
		
	
		
		
	}

}
