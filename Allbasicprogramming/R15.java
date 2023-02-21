//WAP to print all the odd digits in a number



package Allbasicprogramming;

public class R15 {

	public static void main(String[] args) {
	int n=12345;
	
	while(n!=0) {
		int d=n%10;
		if(d%2!=0) {
			System.out.println(d);
		}
		n=n/10;
	}

	}

}
