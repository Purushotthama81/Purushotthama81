package collections;
import java.util.*;

public class Hash {

	public static void main(String[] args) {
		HashMap<Integer,String> Map=new HashMap<Integer,String>();
		 Map.put(1,"purshi");
		 Map.put(2,"deepu");
		 Map.put(3,"arun");
		 Map.put(4,"bharath");
		 Map.put(5,"aishu");
		 Map.put(6,"divya");
		 Map.put(7,"sonu");
		 Map.put(8,"suresh");
		 Map.put(9,"mom");
		 Map.put(10,"dad");
		 
		 System.out.println(Map.get(2));
		 System.out.println(Map.containsKey(2));
		 System.out.println(Map.containsValue("deepu"));
		 System.out.println(Map.isEmpty());
		 System.out.println(Map.size());
		 System.out.println(Map.keySet());
		 System.out.println(Map.remove(3, "arun"));
		 
		 HashMap<Integer,String> newmap=new HashMap<Integer,String>();
		 newmap.putAll(Map);
		 
		 System.out.println(Map);
		 System.out.println(newmap);
		 
		 
		 
		 
	
		
		
	}

}
