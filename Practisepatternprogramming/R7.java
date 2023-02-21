//Hill Pattern

package Practisepatternprogramming;

public class R7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;

		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<i;k++){
					System.out.print("* ");
		}
		for(int l=1;l<=i;l++) {
			System.out.print("* ");
		}
		System.out.println();

	}

}
}
