package lambdas;

import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Supplier<String> otps = () -> {
			String otp = "";
			for (int i = 1; i <= 6; i++) {
				otp = otp + (int) (Math.random() * 10);
			}
			return otp;
		};

		System.out.println(otps.get());
		System.out.println(otps.get());
		System.out.println(otps.get());

	}

}
