//WAP to check if the string is palindrome or not.



package String_programms;

public class P4 {

	public static void main(String[] args) {
		String s= "Level ";
		s=s.trim();
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
			
		}
		if(s.equalsIgnoreCase(rev)) {
			System.out.println("It is palindrome");
		}
		else {
			System.out.println("It is not palindrome");
		}
	}

}
