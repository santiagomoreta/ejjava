
public class Hora {
	int h;
	int m;

	public Hora(){
		
	}
	public Hora(int h, int m){
		this.h=h;
		this.m=m;
	}
	public int compareTo(Object o){
		Hora aux=(Hora)o;
		if(this.h>aux.h){
			return 1;
		}
		else {
			if(this.h<aux.h){
				return -1;
			}
			else{
				if(this.m>aux.m){
					return 1;
				}
				else{
					if(this.m<aux.m){
						return -1;
					}
					else{
						return 0;
					}
				}
			}
		}
	}
	
public String toString(){
	
	return this.h+":"+this.m;
}

}