//largest element in an array

package Practiseprogramming;



public class L2 {

	public static void main(String[] args) {
		
		int []a= {10,20,30,40,15,25,5};
		int large=a[0];
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]>large) {
				large=a[i];
			}
			
		}
		System.out.println(large);
		

	}

}
