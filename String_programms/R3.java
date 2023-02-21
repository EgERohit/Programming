//WAP to convert lowercase to uppercase

package String_programms;

public class R3 {

	public static void main(String[] args) {
	String s="april";
	char []c =s.toCharArray();
	for (int i = 0; i < c.length; i++) {
		c[i]=(char) (c[i] -32);
		
	}
	
	s=new String(c);
	System.out.println(s);

	}
}
