package Demo1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HasSetDemo {

	public static void main(String[] args) {
		
		ArrayList l1 =new ArrayList();
		l1.add(100);
		l1.add(200);
		l1.add(300);
		
		HashSet hs = new HashSet(l1);
		//hs.addAll(l1);
		//hs.clear();

		hs.add(10);
		hs.add("Santushti");
		hs.add(null);
		hs.add("vyas");
		hs.add("Santushti");
		hs.add(null);
		hs.add(5);
		hs.add(2.2);
		
		System.out.println(hs);
		System.out.println(hs.contains("Santushti"));
		
		
		
		
		Iterator itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
	}

}
