package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTraversingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> hmap = new HashMap<>();
		hmap.put("KA", "Karnataka");
		hmap.put("MH", "Maharastra");
		hmap.put("TS", "Telengana");
		hmap.put("TN", "Tamilnadu");
		
	//	Set<Map.Entry<String,String>> hentries = hmap.entrySet();
		for(Map.Entry m : hmap.entrySet()){    
		    System.out.println(m.getKey()+"--->"+m.getValue());   
		
	}

	}
}
