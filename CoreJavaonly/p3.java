//ArrayList

package CoreJavaonly;

import java.util.ArrayList;

public class p3 {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(110);
		a.add(20.9);
		a.add("hii");
		a.add('c');
		System.out.println(a);
		
		System.out.println("---get-index--");
		for (int i = 0; i<a.size(); i++) {
			System.out.println(a.get(i));
			
		}
		System.out.println("--for each--");
		
		for (Object obj : a) {
			System.out.println(obj);
			
		}

	}

}
