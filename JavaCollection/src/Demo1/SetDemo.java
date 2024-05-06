package Demo1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set s =new HashSet();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(20);
		System.out.println(s);
		Iterator itr = s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
