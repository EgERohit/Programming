//WAP to reverse the string

package Practiseprogramming;

public class L9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     String s="ROHIT JADHAV";
	     String rev="";
	     
	     for(int i=s.length()-1;i>=0;i--) {
	    	 rev=rev+ s.charAt(i);
	     }
	     System.out.println(rev);
		}
	}

