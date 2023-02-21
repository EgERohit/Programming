//Collections sort list and reverse list

package CoreJavaonly;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class p6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList a=new ArrayList();
		a.add(10);
		a.add(-20);
		//a.add("hi");  //classcastexception
		//a.add(null);  //Nullpointerexception
		a.add(0);
		a.add(-55);
		a.add(100);
		a.add(-500);
		System.out.println("Before sorting"+a);
		
		Collections.sort(a);
		System.out.println("After sorting Asc"+a);
		
		Collections.reverse(a);
		System.out.println("After sorting Desc"+a);
		
		
		
	}

}
