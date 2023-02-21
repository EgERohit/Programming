// WAP to check an element is present at which index it is present 



package arrayprograms;

public class P11 {

	public static void main(String[] args) {
		
		int[]a= {3,4,1,2,5,6};
		int search=2;
		boolean b=true;   //not present
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==search) {
				System.out.println("The element is present:" + i);
				b=false;
				break;
			}
			
			}
		if(b==true) {
			System.out.println("the element is not present");
		}
		
		
		}

	}



