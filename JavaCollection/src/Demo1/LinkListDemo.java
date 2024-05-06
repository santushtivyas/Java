package Demo1;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkListDemo {

	public static void main(String[] args) {
	
		LinkedList l1 = new LinkedList();
		l1.add("Santushti");
		l1.add("Vyas");
		l1.add("Vyas");
		l1.add("null");
		l1.add("null");
		l1.add(105);
		l1.add(124.7);
		l1.add('c');
		
		System.out.println(l1);
		Iterator itr = l1.iterator();
		while(itr.hasNext())

		{
			System.out.println(itr.next());
		}
		System.out.println(l1.getFirst());	
		l1.addFirst("Vyas");
		System.out.println(l1);
		l1.removeLast();
		System.out.println(l1);
		
	
	
		
		

	}

}
