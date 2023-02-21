package Patterns;

import java.util.Scanner;

public class p7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows and columns");
		int n=sc.nextInt();
		  for(int i=1;i<=n;i++) {
				
			   for(int j=1;j<=n;j++)
			   {
				   if(j==n/2+1||i==1||(i==n&&j==n/2+1)||(i==6&&j==1)||(j==2&&i==6)) {               //i==j --> for left cross    i+j==n+1--> for right cross
					   System.out.print("* ");
				   }
				   else {
					   System.out.print("  ");
				   }
			   }
			   System.out.println();
	}

}
}