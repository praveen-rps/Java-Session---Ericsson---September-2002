package exceptions;

public class ExceptionExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10, b = 0, c;
		String str = "hai";

		try {
				c=a/b;
				System.out.println("The value of c" +c);
		} catch (ArithmeticException e) {
				System.out.println("Denominator is zero, please change it");
		}

		
		
		try {
				System.out.println(str.charAt(8));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("There is no character at index 8");
		}

	}

}
