//Decreasing Triangle Number Pattern

package Practisenumberpatternprogramming;

import java.util.Scanner;

public class S2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print("1 ");
			}
			System.out.println(" ");
		}

	}

}
