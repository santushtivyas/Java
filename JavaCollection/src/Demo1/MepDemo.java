package Demo1;

import java.util.HashMap;
import java.util.Map;

public class MepDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map m = new HashMap();
		m.put(101, "Santushti");
		m.put(102, "Arpita");
		m.put(103, "Mayank");
		m.put(104, "Jagrati");
		
		System.out.println(m);
		
		System.out.println(m.containsKey(101));
		System.out.println(m.containsValue("Savita"));
		
		m.replace(104,"Anjana");
		System.out.println(m);
		
		System.out.println(m.get(102));
		m.remove(102);
		System.out.println(m);
		System.out.println(m.size());
		m.clear();
		System.out.println(m);
		

	}

}
