package CoreJavaonly;

import java.util.LinkedList;
import java.util.Queue;

public class p12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q=new LinkedList();
		q.offer("hi");
		q.offer(10);
		q.offer(null);
		System.out.println(q);
		System.out.println(q.peek());
		
		System.out.println(q.poll());
	}

}
