import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class ExamenesFinales {
	Map<Grupo,Examenes> calendario;
	
	public ExamenesFinales(){
		calendario=new HashMap();
	}
	public void add(Grupo g,Examenes e){
		calendario.put(g, e);
	}
	public String toString(){
		String s="";
		Iterator it=calendario.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			s=s+e.getKey()+"\n"+e.getValue();
			}
	return s;	
	}
	
}