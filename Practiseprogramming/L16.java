//WAP to remove the spaces from the string.

package Practiseprogramming;

public class L16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="A FOR APPLE fvsd";
		String out="";
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				out=out+s.charAt(i);
				
			}
		}
		System.out.println(out);
		

	}

}
