package corejava;

interface IOnlineShopping {
	
	int gst=100001;

	void selectGoods();

	void shipment();

	void payment();
	default void otp() {
		System.out.println("please provide this otp to complete transaction");
	}
	
	public static void security() {
		System.out.println("security feature is enabled...");
	}
}

class VillageSideShops implements IOnlineShopping{

	public void selectGoods(){
		System.out.println("Gst is : "+gst);
		System.out.println("goods are selected from shop only");
	}
	public void shipment(){
		System.out.println("goods need to be carried by person only");
	}
	public void payment(){
		System.out.println("only cash payments are allowed...");
	}
}

class MunicipalitySideShops implements IOnlineShopping{

	public void selectGoods(){
		System.out.println("goods are selected from shop or online only");
	}
	public void shipment(){
		System.out.println("goods need to be carried by person or shop ");
	}
	public void payment(){
		System.out.println("either cash  or upi payments are allowed...");
	}
	
}

public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IOnlineShopping.security();
		
		VillageSideShops shop1 = new VillageSideShops();
		
		MunicipalitySideShops shop2 = new MunicipalitySideShops();
		
		shop1.selectGoods();
		shop1.shipment();
		shop1.payment();
		
		
		shop2.selectGoods();
		shop2.shipment();
		shop2.payment();
		shop2.otp();

	}

}
