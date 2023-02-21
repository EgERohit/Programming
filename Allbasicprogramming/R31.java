package Allbasicprogramming;

public class R31 {

	public static int factorial(int d) {
		int fact=1;
		for(int i=1;i<=d;i++) {
			fact=fact*i;
		}
		return fact;
		
	}

	public static void main(String[] args) {
	
		int sum=0;
		
		
		for(int n=1;n<=1000;n++) {
			
		while(n!=0) {
			int d=n%10;
			n=n/10;
			sum=sum+factorial(d);
		
		}
		if(sum==temp) {
			System.out.println( sum+"It is String number");
		}
		else
		{
			System.out.println( sum+"It is not a String number");
		}
		
		
	
		
	}
	}

}
