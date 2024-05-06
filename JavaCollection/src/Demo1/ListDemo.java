package Demo1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		List l1 = new ArrayList();
		l1.add(10);
		l1.add(20);
		l1.add(10);
		l1.add(20);
		System.out.println(l1);
		Iterator itr = l1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
