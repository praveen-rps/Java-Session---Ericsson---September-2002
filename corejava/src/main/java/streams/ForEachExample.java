package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<Integer> c= n->{
			System.out.println(n*n);
		};
		
		List<Integer> nos = new ArrayList<>();
		nos.add(4);
		nos.add(7);
		nos.add(5);
		nos.add(9);
		nos.add(10);
		nos.forEach(System.out::println);
		System.out.println("Elements after appliying consumer");
		nos.forEach(c);

	}

}
