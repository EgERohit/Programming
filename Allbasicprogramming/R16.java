//WAP to add all the odd digits from a number 



package Allbasicprogramming;

public class R16 {

	public static void main(String[] args) {
		int n=12345;
		int sum=0;
		
		while(n!=0) {
			int d=n%10;
			if(d!=0) {
				sum=sum+d;
				n=n/10;
			}
		
			System.out.println(sum);
		}

	}

}
