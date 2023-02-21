//WAP to print last word from the string.

package Practiseprogramming;

public class L20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		String s="Harshank  jhvvy asuxjakh jcbajc  patil";
		String []a=s.split(" ");
		
//		String lastword= a[a.length-1];
//		System.out.println(lastword);
		
		String lastword= s.substring(s.lastIndexOf(" ")+1);
		System.out.println(lastword);
	}

}
