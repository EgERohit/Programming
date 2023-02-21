//WAP to print all the elements whose digit sum is equal to 5. 



package arrayprograms;

public class p5 {

	public static void main(String[] args) {
	
		int []a= {19,23,41,65,18};
		
		
		
		for (int i = 0; i < a.length; i++) {
		
			int n=a[i];
			int sum=0;
			while(n!=0) {
				int d=n%10;
				sum=sum+d;
				n=n/10;
				
			}
			
			
		if(sum==5) {
			
			System.out.println(a[i]);
		}
		}
	}
}
	
		
		
	
		
		
		