//Take input from an user

package Practiseprogramming;
import java.util.*;
public class L3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n= sc.nextInt();
		int []a=new int [n];
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter the number of elements");
			 a[i]=sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] +" ");
		}
	
		
	}

}
