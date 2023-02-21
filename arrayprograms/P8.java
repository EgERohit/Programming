//WAP to print largest element in the array



package arrayprograms;

public class P8 {

	public static void main(String[] args) {
		
		int[]a= {10,15,8,6,14};
		int large=a[0];
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]>large) {
				large=a[i];
			}
			
		}
		System.out.println("The largest elements is" + large);

	}

}
