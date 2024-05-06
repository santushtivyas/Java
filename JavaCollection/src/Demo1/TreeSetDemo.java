package Demo1;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts = new TreeSet();
		
		ts.add(50);
		ts.add(30);
		ts.add(40);
		ts.add(10);
		ts.add(60);
		ts.add(20);
		System.out.println(ts);
		ts.remove(20);
		System.out.println(ts);
		ts.clear();
		System.out.println(ts);
		
		

	}

}
