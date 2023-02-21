//ListIterator 

package CoreJavaonly;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class p4 {

	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		a.add(110);
		a.add(20.9);
		a.add("hii");
		a.add('c');
		System.out.println(a);
		
	Iterator i=a.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
		
		ListIterator j=a.listIterator();
		while(j.hasNext()) {
			System.out.println(j.next());
		}
		while(j.hasPrevious()) {
			System.out.println(j.previous());
		}
	
			
						
					
			
		}

	}
}



