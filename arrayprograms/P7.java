//take input for elements of an array



package arrayprograms;
import java.util.*;
public class P7 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int n=sc.nextInt();
		int []a=new int[n];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter the elements");
			a[i]=sc.nextInt();
			}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] +" ");
		}

	}

}
