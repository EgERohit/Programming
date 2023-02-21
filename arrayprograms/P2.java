//WAP to print all the even elements of the array 

package arrayprograms;

public class P2 {

	public static void main(String[] args) {

		int[] a = { 21, 22, 13, 3, 10 };

		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
			}

		}

	}

}
