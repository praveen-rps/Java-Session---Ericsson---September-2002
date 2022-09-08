package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,String> hmap = new HashMap<>();
		hmap.put("KA", "Karnataka");
		hmap.put("MH", "Maharastra");
		hmap.put("TS", "Telengana");
		hmap.put("TN", "Tamilnadu");
		System.out.println(hmap);
	//	hmap.put("TS", "Telengana State");
		hmap.putIfAbsent("TS", "Telengana State");
		System.out.println(hmap);
		
		//hmap.remove("TS");
	//	hmap.remove("TS","Telengana");
		
		hmap.replace("KA", "Karnataka State");
		
		System.out.println(hmap);
		
		Collection sname =  hmap.values();
		System.out.println(sname);
		
		Set codes = hmap.keySet();
		System.out.println(codes);
		
		System.out.println("Size of map : "+hmap.size());
		
		if(hmap.containsKey("TS"))
			System.out.println("Key ts found...");
		else
			System.out.println("key not found...");
		

		if(hmap.containsValue("Telengana state"))
			System.out.println("value found...");
		else
			System.out.println("value not found...");
		

	}

}
