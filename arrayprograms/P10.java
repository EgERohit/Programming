//WAP to print 2nd largest element in the array



package arrayprograms;

public class P10 {

	public static void main(String[] args) {
		
		int[]a= {10,15,15,8,6,14};
		int large=a[0];
		int slarge=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]>large) {
				slarge=large;
				large=a[i];
				
				
			}
			else if(a[i]>slarge &&a[i]!=large) {             // (&&a[i]!=large) this condition is for : if duplicate values are there then it should ignore it.
				slarge=a[i];
			}
			
		
			
			
		}	
		System.out.println( "the largest element :" +large);
		System.out.println("the 2nd largest element :" +slarge);
			
		}

	}


