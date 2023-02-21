// WAP to check an string element is present at which index it is present 




package arrayprograms;

public class P12 {

	public static void main(String[] args) {
		
		String []a= {"R","O","H","I","T"};
		String search="H";
		boolean b=true;    //not present
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]==search) {
				System.out.println("The element is present" +i);
				b=false;
				break;
			}
			
		}
		if(b==true) {
			System.out.println("The element is not present" );
		}
		
		
	}

}
