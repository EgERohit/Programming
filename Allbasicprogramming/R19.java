//WAP to check whether the number is palindrome or not



package Allbasicprogramming;

public class R19 {

	public static void main(String[] args) {
		int n=121;
		int rev=0;
		int temp=n;
		
		while(n!=0) {
			int d=n%10;
			rev=rev*10+d;
			n=n/10;
			
		}
		if(rev==temp) {
			System.out.println("Palindrome" +rev);
		}
		else {
			System.out.println("Not a palindrome" +rev);
		}

	}

}
