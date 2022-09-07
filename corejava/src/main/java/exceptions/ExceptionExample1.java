package exceptions;

public class ExceptionExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 10, b = 0, c;
			String str ="hai";
			c = a / b;
			System.out.println("The character at index 2 is : "+str.charAt(8));
					
			System.out.println("the value of c: " + c);
			
			System.out.println("End of the program");
			System.out.println("end of try block...");
		} 
		
		catch (ArithmeticException e) {
			System.out.println("Inside the arithmetic exception catch blockl..");
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("Inside the indexout of boundcatch blockl..");
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("Inside the indexout of boundcatch blockl..");
		}
		
		 finally {
			System.out.println("Inside the finally block");
		}
		System.out.println("AFter the finally block...");

	}

}
