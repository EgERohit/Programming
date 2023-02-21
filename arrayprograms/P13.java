//WAP to sort an array using bubble 



package arrayprograms;



public class P13 {

	public static void main(String[] args) {
		
		int []a= {14,2,9,68,25,59,31};
		for (int i = 0; i < a.length; i++) {             //it is for performing the task again
			for (int j = i+1; j < a.length; j++) {      //it is for performing the task
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			
			
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
