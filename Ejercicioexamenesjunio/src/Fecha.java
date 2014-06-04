
public class Fecha {
	int d;
	int m;
	int a;
 public Fecha(){
	 
 }
	
public Fecha(int d, int m, int a){
	this.d=d;
	this.m=m;
	this.a=a;
}
//---------------------son del mismo año--se compara mes y dia;
public int compareTo(Object o){
	Fecha aux=(Fecha)o;
	if(this.m>aux.m){
		return 1;
	}
	else{
		if(this.m<aux.m){
			return -1;
		}
		else{
			if(this.d>aux.d){
				return 1;
			}
			else{
				if(this.d<aux.d){
					return -1;
				}
				else{
					return 0;
				}
			}
		}
	}
	
	
}

//-------------------tostring
public String toString(){
	return this.d+"/"+this.m+"/"+this.a;
	
	
	
}

}
