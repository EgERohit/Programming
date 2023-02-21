//WAP to display sum of all the elements of the array 

package arrayprograms;

public class P3 {

	public static void main(String[] args) {

		int[] a = { 21, 22, 13, 3, 10 };
		int sum = 0;

		for (int i = 0; i < a.length; i++) {

			sum = sum + a[i];

		}
		System.out.println(sum);

	}

}
