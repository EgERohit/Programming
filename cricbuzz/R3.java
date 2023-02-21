package cricbuzz;



public class R3 {

	public static void main(String[] args) {
		int n=145;
		int temp=n;
		int sum=0;
		
		while(n!=0) {
			int d=n%10;
			sum=sum+d;
			n=n/10;
		}
		if(sum==temp) {
			System.out.println("Strong number");
		}
		else {
			System.out.println("Not a strong number");
		}
		
	}
public static int factorial(int d) {
	int fact=1;
	for(int i=1;i<=d;i++)
	{
		fact=fact*i;
	}
	return fact;
}
}
