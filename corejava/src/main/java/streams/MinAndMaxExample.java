package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MinAndMaxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nos = new ArrayList<>();
		List<Integer> result = new ArrayList<>();
		nos.add(10);
		nos.add(20);
		nos.add(4);
		nos.add(17);
		nos.add(21);
		//System.out.println(nos);
		Comparator<Integer> c = (c1,c2)->-(c1-c2);
		Integer m1 = nos.stream().map(x->x+1).min(c).get();
		Integer m2 = nos.stream().map(x->x+1).max(c).get();
		System.out.println(nos.stream().map(x->x+1).collect(Collectors.toList()));
		System.out.println("Left most value "+m1);
		System.out.println("Right most value "+m2);

	}

}
