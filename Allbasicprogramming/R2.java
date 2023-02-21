//WAP to display numbers from 5-1



package Allbasicprogramming;

public class R2 {
	
	public static void odd(int n) {
		int sum=0;
		
		
		
		if(n>=1) {
			System.out.println(n);
			demo(--n);
		}
		
	}

	public static void main(String[] args) {
		
		int n=odd(5);
		

	}

}
