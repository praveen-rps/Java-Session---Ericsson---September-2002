package exceptions;

class InsufficientFundsException extends RuntimeException {

	public InsufficientFundsException(){
		super("You should always maintain balance of 2000");
	}

}
