//WAp to display factorial of the numbers range in 1-5



package Allbasicprogramming;

public class R5 {
	public static void main(String[] args) {
		
		
		for(int i=1;i<=5;i++) {
			int fact=1;
			for(int j=1;j<=i;j++) {
				fact=fact*j;
			}
			System.out.println(fact);
		}
	}

}
