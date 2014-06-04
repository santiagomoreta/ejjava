import java.util.*;


public class Examenes  {
List<Examinable> examenes;

public Examenes(){
	
	examenes=new ArrayList<Examinable>();
}
public void Insertar(Examinable e){
	examenes.add(e);
}




public String toString(){

	Iterator<Examinable>it=examenes.iterator();
	String s="";
	while(it.hasNext()){
		Examinable aux=(Examinable)it.next();
		s=s+aux.toString()+"\n";
	}
	return s;
	
}


	
}
