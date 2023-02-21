//wap to check whether the number is perfect number or not



package Allbasicprogramming;

public class R11 {

	public static void main(String[] args) {
		int n=6;
		int sum=0;
		
		for(int i=1;i<=n;i++)
		{
		if(n%i==0) 
		{
			sum=sum+i;
		}
		}
		if(n==sum) {
			System.out.println("Perfect Number");
		}
		else
		{
System.out.println("Not a perfect number");
	}

}
}