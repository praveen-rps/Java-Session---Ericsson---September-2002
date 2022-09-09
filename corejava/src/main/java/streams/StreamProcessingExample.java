package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamProcessingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> p = x->x%5==0;
		Function<Integer,Integer> f = x->x+5;
		List<Integer> nos = new ArrayList<>();
		List<Integer> result = new ArrayList<>();
		nos.add(10);
		nos.add(20);
		nos.add(4);
		nos.add(17);
		nos.add(21);
		System.out.println(nos);
		//Stream s = nos.stream();
		//Stream s1 = s.filter(p);
		//System.out.println(s1.collect(Collectors.toList()));
		
		//result = nos.stream().filter(p).collect(Collectors.toList());
		//System.out.println(result);
		
		//long cnt = nos.stream().filter(p).count();
		//System.out.println("Count after filtering: "+cnt);
		Comparator<Integer> c= (c1,c2)-> -(c1-c2);
		
		result = nos.stream().map(f).sorted(c).collect(Collectors.toList());
		System.out.println(result);
		
		Stream s=Stream.of(99,999,9999,99999);
		s.forEach(System.out:: println);
		
	}

}
