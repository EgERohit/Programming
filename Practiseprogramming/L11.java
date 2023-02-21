
//WAP to interchange the position on first name and surname.
package Practiseprogramming;

public class L11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="ROHIT JADHAV";
		String[]a=s.split(" ");
		
		for(int i=a.length-1;i>=0;i--) {		
			System.out.print(a[i]+" ");
		}
	}

}
