//Set - HashSet,LinkedHashSet,TreeSet

package CoreJavaonly;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class p9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Hashset
		
		HashSet h=new HashSet();
		h.add(110);
		h.add(20.9);
		h.add("hii");      //heterogeneoue are allowed 
		h.add('c');
		h.add(null);       //Only one Null value is allowed
		h.add(true);
		h.add(110);       //duplicates are allowed
		System.out.println(h);
		
		
	   LinkedHashSet l=new LinkedHashSet();
	   l.add(110);
		l.add(20.9);
		l.add("hii");
		l.add('c');
		l.add(null);
		l.add(110);
		System.out.println(l);
		
		
		//TreeSet
		
		TreeSet t=new TreeSet();
		t.add(5);
		t.add(110);
		t.add(20);
		
		//t.add(null);        //Nullpointerexception
		//t.add("HI");          //classcastexception
		System.out.println(t);
		System.out.println("Treeset Desc:"+t.descendingSet());
		
		
		
		
	}

}
