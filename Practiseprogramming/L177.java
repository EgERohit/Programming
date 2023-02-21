//WAP to convert all the consonants to #.

package Practiseprogramming;

public class L177 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= "January";
		char[]ch=s.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]!='a'&&ch[i]!='e'&&ch[i]!='i'&&ch[i]!='o'&&ch[i]!='u'&&ch[i]!='A'&&ch[i]!='E'&&ch[i]!='I'&&ch[i]!='O'&&ch[i]!='U') {
				ch[i]='#';
			}
			s=new String(ch);
			
		}
		System.out.print(s);
	}

}
