//WAP to print all the elements of 2-D array



package arrayprogramms01092022;

public class P2 {

	public static void main(String[] args) {
		
		int[][]a= {{1,2,3},{4,5,6},{7,8}};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]);
				
			}
		}
	}

}
