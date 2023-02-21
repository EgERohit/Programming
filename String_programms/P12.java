//WAP to remove the spaces from the string.



package String_programms;

public class P12 {

	public static void main(String[] args) {
		String s ="Tomm hoilday";
		String out ="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				out=out+s.charAt(i);
			}
		}
System.out.println(out);;
	}

}
