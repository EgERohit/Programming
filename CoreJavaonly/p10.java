package CoreJavaonly;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class p10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashMap
		
		HashMap h=new HashMap();
		h.put(1,10);
		h.put(2, null);
		h.put(3, "sheela");
		h.put(true, 10);
		h.put("hi",null );
		System.out.println(h);
		
		//LinkedHashMap
		
		LinkedHashMap l=new LinkedHashMap();
		l.put(1,10);
		l.put(2, null);
		l.put(3, "sheela");
		l.put(true, 10);
	
		System.out.println(l);
		
		
		//TreeMap
		
		TreeMap t=new TreeMap();
		t.put("hi",null );
	//	t.put(1,10);       //error-key and value pair should be there
		//t.put(2, null);     
	    
		//t.put(0,'s');
		//t.put(true, 10);
		System.out.println(t);
		System.out.println(t.descendingMap());
		
		

	}

}
