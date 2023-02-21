//WAP to to check whether the given number is Niven number or not 



package Allbasicprogramming;

public class R22 {

	public static void main(String[] args) {
		int n=27;
		int sum=0;
		int temp=n;
		while(n!=0) {
			int d=n%10;
			sum=sum+d;
			n=n/10;
		}
		if(temp%sum==0) {
			System.out.println("It is niven number :" + sum);
		}
		else
		{
			System.out.println("It is not an Niven number :" + sum);
		}

	}

}
