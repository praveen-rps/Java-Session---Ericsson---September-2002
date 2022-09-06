package lambdas;

import java.util.function.Supplier;

public class PasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String symbols="ABCDEFGHIJKLMNOPQRSTUVWXYZ#$@";
		Supplier<Integer> d=()->(int)(Math.random()*10); 
		Supplier<Character> c=()->symbols.charAt((int)(Math.random()*29));
		
		String pwd ="";
		
		for(int i=1;i<=8;i++) {
			if(i%2==0)
				pwd=pwd+d.get();
			else
				pwd=pwd+c.get();
		}
		System.out.println(pwd);

	}

}
