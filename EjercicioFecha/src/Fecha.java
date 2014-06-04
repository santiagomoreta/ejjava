import java.util.Scanner;
public class Fecha {
	private int dia;
	private Mes mes;
	private int anio;
	
	public int getDia() {
	return dia;
	}
	
	public void setDia(int dia) {
		this.dia = dia;
	}
	public Mes getMes() {
		return mes;
	}
	public void setMes(Mes mes) {
		this.mes = mes;
	
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	
	public String toString() {
		return "la fecha es  ----- "+ this.dia + "----- de-----   " + this.mes+" -----  del------- " +this.anio;
	}
	
	
	//------------------------------ingresar fecha------------------------
	public void ingresar(Fecha a){
		Scanner z=new Scanner(System.in);
		int mes;
		System.out.println("ingrese ------- Fecha-----------------------");
		System.out.println("ingrese dia");
		a.setDia(z.nextInt());

		do{
		System.out.println("elija  mes");
		System.out.println();
		for(Mes value: Mes.values()){
		    System.out.println((value.ordinal()+1)+"  --  "+value.name());
		}
		mes=z.nextInt();			
		switch(mes){

		case 1:
			a.setMes(Mes.ENERO);
			break;
		case 2:
			a.setMes(Mes.FEBRERO);
			break;
		case 3:
			a.setMes(Mes.MARZO);
			break;
		case 4:
			a.setMes(Mes.ABRIL);
			break;
		case 5:
			a.setMes(Mes.MAYO);
			break;
		case 6:
			a.setMes(Mes.JUNIO);
			break;
		case 7:
			a.setMes(Mes.JULIO);
			break;
		case 8:
			a.setMes(Mes.AGOSTO);
			break;
		case 9:
			a.setMes(Mes.SEPTIEMBRE);
			break;	
		case 10:
			a.setMes(Mes.OCTUBRE);
			break;
		case 11:
			a.setMes(Mes.NOVIEMBRE);
			break;
		case 12:
			a.setMes(Mes.DICIEMBRE);
			break;	
		default:
			System.out.println("--------El mes incorrecto-----");
			break;
		}
		}while(mes>12);
			System.out.println("ingrese aÑo");
		a.setAnio(z.nextInt());
	}

	//----------------------------------validar----------------------------
	public int Validarfecha(Fecha a){
		int ret=0;
	
		
		
		boolean bis = false;
		if (a.anio % 4 == 0  && a.anio % 100 != 0  ||  a.anio  % 400 == 0){
		       System.out.println("El año Si es biciesto");
		       bis=true;
		    } 
		else {
		       System.out.println("el año NO es bisiesto");
		    }
		
		
	
				
		if((a.mes.ordinal()==0 || a.mes.ordinal()==2 ||a.mes.ordinal()==4 ||a.mes.ordinal()==6 ||a.mes.ordinal()==7||a.mes.ordinal()==9||a.mes.ordinal()==11) && a.dia>31){
			System.out.println("el mes de    " + a.mes + " no tiene"  +a.dia  +"   dias");
			System.out.println("La fecha NO es correcta");
			ret = -1;
		}
		if( (a.mes.ordinal()==3 ||a.mes.ordinal()==5 ||a.mes.ordinal()==8 ||a.mes.ordinal()==10 )&& a.dia>30){
			System.out.println("el mes de    "+a.mes+"    no tiene    "+a.dia+"   dia  s");
			System.out.println("La fecha NO es correcta");
			ret=-1;
		}
		if((a.mes.ordinal()==1 && bis==false) && a.dia>27){
			System.out.println("el mes de    "+a.mes+"    no tiene    "+a.dia+"   dias   ");
			ret=-1;
			System.out.println("La fecha NO es correcta");
		}
		if((a.mes.ordinal()==1 && bis==true) && a.dia>28){
			System.out.println(" el mes    "+a.mes+"    no tiene    "+a.dia+"   dias   ");
			System.out.println("La fecha NO es correcta");
			ret =-1;
		}
		else{
			System.out.println("la fecha SI es correcta");
		}
		return ret;
	
	}
	
	//---------------------------------------compare To------------------------------
	public int compareTo(Object obj){
		Fecha f=(Fecha)obj;
		if (this.anio>f.anio){
			return 1;
		}
		if (this.anio<f.anio){
			return -1;
		}
		else{
			if(this.mes.ordinal()>f.mes.ordinal()){
				return 1;
			}
			if(this.mes.ordinal()<f.mes.ordinal()){
				return -1;
			}
			else{
				if(this.dia>f.dia){
					return 1;
				}
				if(this.dia<f.dia){
					return -1;
				}
				else{
					return 0;
				}
			}
		}
	
	
	
	}
//----------------------------------------------Dia de la Semana--------------------------
	public void Diasemana( Fecha a){
		int anno=0,mes=0,dia=0,aa=0,b=0,d=0;
		mes=a.mes.ordinal()+1;
		anno=a.anio;
		dia=a.dia;
			if(mes<3){
				mes=mes+10;
				anno=anno-1;
			}
			else{
				mes=mes-2;
			}
		aa=anno%100;
		b=anno/100;
		d=(700 +((26*mes-2)/10)+dia + aa + aa/4 + b/4 -2*b)%7;
			
		switch(d){
		case 1:
			System.out.println("el dia de la semana es lunes");
			break;
		case 2:
			System.out.println("el dia de la semana es martes");
			break;
		case 3:
			System.out.println("el dia de la semana es miercoles");
			break;
		case 4:
			System.out.println("el dia de la semana es jueves");
			break;
		case 5:
			System.out.println("el dia de la semana es viernes");
			break;
		case 6:
			System.out.println("el dia de la semana es sabado ");
			break;
		case 0:
			System.out.println("el dia de la semana es domingo");
			break;	
		}

		
	}

}
