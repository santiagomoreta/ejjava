import java.util.Scanner;

public class Mainfecha {

	public static void main(String[] args) {

		int x=0,y=0;
		Scanner z= new Scanner(System.in);
		int menu=0;
		Fecha a=new Fecha();
		Fecha b=new Fecha();
		while(menu<6){
		System.out.println("--------------------menu---------------");
		System.out.println("1.-     llenar fecha    ");
		System.out.println("2.-     visualizar fecha     ");
		System.out.println("3.-     validar  fecha    ");
		System.out.println("4.-     comparar dos fechas    ");
		System.out.println("5.-      Calcular dia de la semana             ");
		menu=z.nextInt();
		switch(menu){
		case 1:
			a.ingresar(a);
			break;
		case 2:
			System.out.println(a);
			break;
		case 3:
			y=a.Validarfecha(a);
			break;
		case 4:
			a.ingresar(a);
			System.out.println("------------INGRESE SEGUNDA FECHA------------");
			b.ingresar(b);
			x=a.compareTo(b);//comparar
			System.out.println(x);
			if(x==1){
				System.out.println(a+"  es mayor que  "+b);
			}
			if(x==-1){
				System.out.println(a+"  es menor que   "+b);
			}
			if(x==0){
				System.out.println(a+" y "+b+"  son iguales");
			}
			break;
		case 5:
			a.Diasemana(a);
			break;
		default:
			System.out.println("incorrecto");
			break;
		}
		}
			
		}

}
