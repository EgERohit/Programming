//WAP to display number from 1-50 without using loop (i.e - method recursion) 



package Allbasicprogramming;

public class R1 {
	
public static void demo(int n) {
	if(n<=50) {
		System.out.println(n);
		demo(++n);
	}
}
		


	

	public static void main(String[] args) {
		demo(1);
		

	}

}



