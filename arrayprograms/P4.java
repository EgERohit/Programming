//WAP to find product of all the odd elements of the array 



package arrayprograms;

public class P4 {

	public static void main(String[] args) {
	
		int []a= {21,22,13,3,11};
		int prod=1;
	
		
		for (int i = 0; i < a.length; i++) {
			
		if(a[i]%2!=0) {
			prod=prod*a[i];
		}
		
				}
		System.out.println(prod);
			
			
			
			
		}
		

	}


