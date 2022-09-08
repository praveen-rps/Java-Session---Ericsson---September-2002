package collections;
import java.util.*;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs = new HashSet();
		hs.add("India");
		hs.add("China");
		hs.add("Japan");
		hs.add("Nepal");
		hs.add("China");
		hs.add(null);
		System.out.println(hs);
		
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("Mumbai");
		lhs.add("Chennai");
		lhs.add("Hyderabad");
		lhs.add("Pune");
		lhs.add("Noida");
		System.out.println(lhs);
		
		TreeSet<String> ts = new TreeSet();
		ts.add("Zimbawbe");
		ts.add("America");
		ts.add("Swedan");
		ts.add("Norway");
		ts.add("America");
		System.out.println(ts);

	}

}
