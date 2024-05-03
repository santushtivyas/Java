package Demo1;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList l1 =new ArrayList();
		l1.add(100);
		l1.add(200);
		l1.add(300);
		
		
	
		System.out.println(l1);
		
		System.out.println(l1.add("aaa"));
		
		System.out.println(l1);
		
		System.out.println(l1.contains(400));
		
		System.out.println(l1.isEmpty());
		
		System.out.println(l1.size());
		
		l1.clear();
		System.out.println(l1);
		
		ArrayList l2 =new ArrayList();
		l2.add(400);
		l2.add(500);
		l2.add(600);
		l2.add("b");
		
		System.out.println(l2);
		l2.remove("b");
		l2.remove(0);
		System.out.println(l2);
		
		ArrayList l3 =new ArrayList();
		l3.add("aaa");
		l3.add("bbb");
		l3.add("ccc");
		
		ArrayList l4 =new ArrayList();
		l4.add("bbb");
		l4.add("ddd");
		l4.add("eee");
		l3.addAll(l4);
		System.out.println(l3);
		l3.removeAll(l4);
		
		System.out.println(l3);
		System.out.println(l4);
		
	}

}
