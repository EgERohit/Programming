//WAP to check whether the number is Strong number or not



package Allbasicprogramming;

public class R23 {
	
	public static int factorial(int d) {
		int fact=1;
		for(int i=1;i<=d;i++) {
			fact=fact*i;
		}
		return fact;
		
	}

	public static void main(String[] args) {
		int n=145;
		int sum=0;
		int temp=n;
		
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
