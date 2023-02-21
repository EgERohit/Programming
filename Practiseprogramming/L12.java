//WAP to swap the string without using 3rd variable


package Practiseprogramming;

public class L12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Hello";
		String s2="Rohit";
		String s=s1+s2;               //HelloRohit
//		System.out.println(s);
		System.out.println("Before swapping :" +s1 +" "+s2);
		s2=s.substring(0, s.length()-s2.length());
//		System.out.println(s2);
		s1=s.substring(s2.length());
		System.out.println("After swapping :" +s1 +" "+s2);
		

	}

}
