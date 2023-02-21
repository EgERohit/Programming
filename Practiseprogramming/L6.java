//WAp to display smallest element of an array 

package Practiseprogramming;

public class L6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []a= {10,11,15,18,6};
		int small=a[0];
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]<small) {
				small=a[i];
			}
			
		}
		System.out.println(small);
	}

}
