//WAP to find the result of a number raise to power



package Allbasicprogramming;

import java.util.Scanner;

public class R21 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int n=sc.nextInt();
	
		int p=2;
		int res=1;
		
		for(int i=1;i<=p;i++) {
			res=res*n;
		}
		System.out.println(res);
		

	}

}
