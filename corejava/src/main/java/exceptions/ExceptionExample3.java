package exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionExample3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter a value");
		br.read();

	}

}
