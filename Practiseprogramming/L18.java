//WAP to convert lowercase to uppercase


package Practiseprogramming;

public class L18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="january";
		char[]ch=s.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
		ch[i]=(char) (ch[i]-32);
		}
		s=new String(ch);
		System.out.println(s);

	}

}
