package collections;
import java.util.*;

public class Colle {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("purshi");
		list.add("deepu");
		list.add("arun");
		list.add("bharath");
		list.add("aishu");
		list.add("divya");
		list.add("sonu");
		list.add("suresh");
		list.add("mom");
		list.add("dad");
		
		list.add(2,"johnwick");
		list.remove(2);
		list.set(2,"sowmya");
		System.out.println(list.indexOf("deepu"));
		System.out.println(list.get(1));
		System.out.println(list.size());
		System.out.println(list.contains("deepu"));
		
		Iterator i=list.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
			
		}
		 list.removeAll(list);
		 System.out.println(list);
		
		
	}

}
