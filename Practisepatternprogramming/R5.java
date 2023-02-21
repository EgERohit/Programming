//Right sided Triangle

package Practisepatternprogramming;

public class R5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=8;
		for(int i=1;i<=n;i++) {         //Outer loop
			for(int j=i;j<n;j++) {      //Decreasing space
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++) {     //Increasing star
				System.out.print("* ");
			}
			System.out.println();
	}

}
}
