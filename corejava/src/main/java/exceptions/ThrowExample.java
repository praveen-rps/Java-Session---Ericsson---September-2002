package exceptions;

public class ThrowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			throw new ArithmeticException();
		}
		catch(NullPointerException ne) {
			System.out.println(ne);
		}
		catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
		

	}

}
