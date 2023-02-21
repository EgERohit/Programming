package CoreJavaonly;

public class p5 {

	int i=10;
	
	public void finalize() {
		System.out.println("clean-up activities");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		p5 ref=new p5();
		System.out.println(ref.i);
		
		//System.out.println(ref);
		
		System.gc();
		
	}

}
