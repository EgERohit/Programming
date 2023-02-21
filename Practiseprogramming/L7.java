package Practiseprogramming;

public class L7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {10,15,21,23,21,6,29};
		int large=a[0];
		int slarge=0;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]>large) {
				slarge=large;
				large=a[i];
			}
			else if (a[i]>slarge && a[i]!=large)  {    // (&&a[i]!=large) this condition is for : if duplicate values are there then it should ignore it
				slarge=a[i];
				
				
			}
			
		}
		System.out.println("The largest element"+ large);
		System.out.println("The second largest element"+slarge);
		

	}

}
