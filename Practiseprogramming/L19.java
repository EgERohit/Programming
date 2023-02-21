//WAP to change the first letter of the string into uppercase.

package Practiseprogramming;

import java.util.Scanner;

public class L19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your string");
		String str=sc.nextLine();

//		String s="hello my name is rohit";
		String[]a=str.split(" ");
		
		for (int i = 0; i < a.length; i++) {
			char temp=(char) (a[i].charAt(0)-32);
			a[i]=temp+a[i].substring(1);
			System.out.print(a[i]+" ");
		}
		

	}

}
