//WAP to print smallest element in the array



package arrayprograms;

public class P9 {

	public static void main(String[] args) {
		
		int[]a= {10,15,8,6,14};
		int small=a[0];
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]<small) {
				small=a[i];
			}
			
		}
		System.out.println("The smallest elements is :" + small);

	}

}
