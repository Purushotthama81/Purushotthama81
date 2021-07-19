package collections;
import java.util.*;

public class Hashset {

	public static void main(String[] args) {
	HashSet<String> set=new HashSet<>();
		set.add("purshi");
		set.add("deepu");
		set.add("arun");
		set.add("bharath");
		set.add("aishu");
		set.add("divya");
		set.add("sonu");
		set.add("suresh");
		set.add("mom");
		set.add("dad");
		
		System.out.println(set);
		set.remove("arun");
		System.out.println(set);
		System.out.println(set.contains("deepu"));
		System.out.println(set.contains("abc"));
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		 set.removeAll(set);
		 System.out.println(set);
		
		
		
	}

}
