package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Sales{
	String month;
	int amount;
	public Sales() {
		
	}
	
	public Sales(String month, int amount) {
		super();
		this.month = month;
		this.amount = amount;
	}

	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Sales [month=" + month + ", amount=" + amount + "]";
	}
	
	
}

public class EmployeeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,List> myshop = new HashMap<>();
		HashMap<Integer,List> profits = new HashMap<>();
		
		ArrayList<Integer> y1 = new ArrayList<>();
		ArrayList<Integer> y2 = new ArrayList<>();
		ArrayList<Integer> y3 = new ArrayList<>();
		y1.add(10);
		y1.add(14);
		y1.add(24);
		y1.add(19);
		
		y2.add(9);
		y2.add(6);
		y2.add(8);
		y2.add(10);
		
		y3.add(11);
		y3.add(17);
		y3.add(20);
		y3.add(14);
		
		profits.put(2019, y1);
		profits.put(2020, y2);
		profits.put(2021, y3);
		
		for(Map.Entry m : profits.entrySet()){    
		    System.out.println(m.getKey()+"--->");
		    List<Integer> lists = (List)m.getValue();
		    int count=1;
		    for(Integer n : lists) {
		    	
		    	System.out.println("Quarter-"+count+"-->"+n);
		    	count++;
		    }
		    
		}
		    //System.out.println(profits);
		Sales s1 = new Sales("jan",200);
		Sales s2 = new Sales("feb",150);
		Sales s3 = new Sales("Mar",320);
		ArrayList<Sales> msales = new ArrayList();
		msales.add(s1);
		msales.add(s2);
		msales.add(s3);
		
		myshop.put("RIL", msales);
		System.out.println(myshop);
		
		

	}

	
}
