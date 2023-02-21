//WAP to convert all the vowels present in your name to %



package String_programms;

public class P8 {

	public static void main(String[] args) {
		
		String s="ROHIT";
		char[]ch=s.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
			{
				ch[i]='%';
			}
		}
		s=new String(ch);
		System.out.println(s);
	}

}
