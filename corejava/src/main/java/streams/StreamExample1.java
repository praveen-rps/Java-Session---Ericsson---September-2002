package streams;
import java.util.*;
public class StreamExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> nos = new ArrayList<>();
		List<Integer> result = new ArrayList<>();
		nos.add(10);
		nos.add(20);
		nos.add(4);
		nos.add(17);
		nos.add(21);
		System.out.println(nos);
		
		for(int x:nos) {
			
				result.add(x+10);
		}
		System.out.println("Multiples of 5 are : "+result);

	}

}
