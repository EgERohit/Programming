//Vector

package CoreJavaonly;

import java.util.Vector;

public class p7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector a =new Vector();
		a.add(10);
		a.add(110);
		a.add(20.9);
		a.add("hii");
		a.add('c');
		a.add(null);
		a.add(false);
		
		System.out.println(a);
		a.add(25);
		System.out.println(a);
		
		System.out.println(a.size());
		System.out.println(a.capacity());
	}

}
