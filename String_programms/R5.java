//WAP to change the first letter of the string into uppercase.


package String_programms;

public class R5 {

	public static void main(String[] args) {
		String s ="that is my first program";
		String[]a=s.split(" ");
		for (int i = 0; i < a.length; i++) {
			char temp=(char)(a[i].charAt(0)-32);
			a[i]=temp +a[i].substring(1);
			System.out.print(a[i] + " ");
			
		}

	}

}
