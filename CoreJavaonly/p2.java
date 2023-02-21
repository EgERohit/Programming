//ArrayList

package CoreJavaonly;

import java.util.ArrayList;

public class p2 {

	public static void main(String[] args) {
		ArrayList s = new ArrayList();
		s.add("idli");
		s.add("Dosa");
		s.add("Sambar");
		System.out.println(s);
		
		ArrayList n = new ArrayList();
		n.add(5);
		n.add(445);
		n.add("Poha");
		n.add("Khichdi");	
		
		//"To add an object"
		//System.out.println("add(intindex,object)");
		s.add(1,"Vada");
		System.out.println(s);
		
		//System.out.println("addAll(collection)");
		s.add(n);
		System.out.println(s);
		
	//	System.out.println("add(Object)");
		n.add("Butter");
		System.out.println(s);
		
		//System.out.println("addAll(int index,collection)");
		System.out.println(s.contains("Sambar"));
		
	
	}

}
