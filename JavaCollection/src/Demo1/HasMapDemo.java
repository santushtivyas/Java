package Demo1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HasMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hm = new HashMap();
		
		hm.put(101, "Santushti");
		hm.put(102, "Arpita");
		hm.put(103, "Mayank");
		hm.put(104, "Jagrati");
		
		System.out.println(hm);
		
		for(Map.Entry me: hm.entrySet())
		{
			System.out.println(me.getKey()+"->"+me.getValue());
		}
		
//		Set set = hm.entrySet();
//		System.out.println(hm);
//		
//		Iterator itr = set.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//			
//		}
		

	}

}
