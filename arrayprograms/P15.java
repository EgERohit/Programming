//WAP to perform insertion sort



package arrayprograms;

public class P15 {

	public static void main(String[] args) {
		int[]a= {5,1,3,4,2,6};
		for(int i=1;i<a.length;i++) {
			int temp=a[i];
			int j=i;
			while(j>0 && temp<a[j-1]) {
				a[j]=a[j-1];
				j=j-1;
			}
			a[j]=temp;
		}
		for (int i = 0; i < a.length; i++) {           // //for print the array elements
			System.out.print(a[i]+ " ");
		}
	}

}
