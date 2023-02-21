//WAP to convert all the vowels to %.



package String_programms;

public class R1 {

	public static void main(String[] args) {
	String s = "April";
	char[] c = s.toCharArray();
	for (int i = 0; i < c.length; i++) {
		if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'||c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U') {
		c[i]='%';
		}
		
	}
	s=new String(c);
	System.out.println(s);

	}

}
