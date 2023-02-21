//WAP to check whether the reverse number is odd or not



package Allbasicprogramming;

public class R18 {

	public static void main(String[] args) {
		int n=158;
		int rev=0;
		
		while(n!=0) {
			int d=n%10;
			rev=rev*10+d;
			n=n/10;
		}
		if(rev%2!=0) {
			System.out.println("odd number" +rev);
		}
		else {
			System.out.println("Not an odd number" +rev);
		}

	}

}
