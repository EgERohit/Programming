//Right sided triangle

package Practisepatternprogramming;

public class R6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		
		for(int i=1;i<=n;i++) {                  //Outer loop
			for(int j=1;j<=i;j++) {              //Increasing star
				System.out.print("  ");
			}
			for(int k=i;k<n;k++) {               //Decreasing star
				System.out.print("* ");
			}
			System.out.println("");
			
		}
	}

}
