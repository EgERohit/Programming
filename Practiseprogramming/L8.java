//WAP to check element is present at which index


package Practiseprogramming;

public class L8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []a= {10,2,15,36,49,21};
		int search=49;
		boolean b=true;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]==search) {
				System.out.println("The element is present"+ i);
				b=false;
				break;
				
			}
			
		}
		if (b==true) {
			System.out.println("The element is not present");
		}

	}

}
