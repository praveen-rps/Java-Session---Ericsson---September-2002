package corejava;

abstract class OnlineShopping {
	
	int shopId;
	String shopName;
	int gstno;
	
	OnlineShopping(){
		System.out.println("Inside the online shopping constructor");
	}

	public void selectGoods() {
		// code related to selection of goods
		System.out.println("goods are selected manualy");
	}
	public abstract void payment();
	public void shipment() {
		// code related to shipment;
		System.out.println("Goods are to be carried by person only");
	}
}

class CreditCardPaymentShops extends OnlineShopping {

	@Override
	public void payment() {
		// credit payment related code;
		System.out.println("credit card payment is accepted..");
	}
}

class UpiOrCashPaymentShops extends OnlineShopping {

	@Override
	public void payment() {
		// cash or upi payment related code;
		System.out.println("upi or cash payment is accepted..");
	}
}

public class AbstractClassesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCardPaymentShops shop1 = new CreditCardPaymentShops();
		UpiOrCashPaymentShops shop2 = new UpiOrCashPaymentShops();
		
		shop1.selectGoods();
		shop1.shipment();
		shop1.payment();
		
		shop2.selectGoods();
		shop2.shipment();
		shop2.payment();
	}
}
