//WAP to perform multiplication of 2 matrix.



package ArrayPrograms2;

public class P1 {

public static void main(String[] args) {
		
		int[][]a= {{1,2,3},{4,5,6},{7,8,9}};
		int[][]b= {{1,1,2},{1,3,1},{1,0,0}};
		
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				
				int sum=0;
				for (int k = 0; k < b.length; k++) {
					sum=sum+a[i][k]*b[k][j];
				}
				System.out.print(sum+" ");
				
			}
			System.out.println();
		}

	}

}