//WAP to check string is palindrome or not

package Practiseprogramming;

public class L10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Level     ";
		s.trim();
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
			
		}
		if(s.equalsIgnoreCase(rev)) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not a palindrome");
		}
	}

}
