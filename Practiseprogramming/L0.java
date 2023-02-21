//WAP to sort an array using bubble 


package Practiseprogramming;

public class L0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]a= {2,18,3,91,65,26};
		
		for (int i = 0; i < a.length; i++) {                                 //it is for performing the task again
			for (int j = i+1; j < a.length; j++) {                            //it is for performing the task
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+ " ");
		}
	}

}
