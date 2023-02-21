//WAP to sort character from your number using insertion order.



package arrayprograms;

public class P16 {

	public static void main(String[] args) {
		char []a= {'R','O','H','I','T'};
		for(int i=1;i<a.length;i++) {
			char temp=a[i];
			int j=i;
			while(j>0 && temp < a[j-1]) {
				a[j]=a[j-1];
				j=j-1;
				
			}
			a[j]=temp;
		}
		
		for (int i = 0; i < a.length; i++) {     //for print the array elements
			System.out.print(a[i] + " ");
		}

	}

}
