package inheritance;

public class OverridingTest {

	public static void main(String[] args) {

/*		Customer customerLee = new Customer(100010, "LEE");
		int price = customerLee.calcPrice(10000);
		System.out.println("지불금액은 " + price + "이고, " + customerLee.showcustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer(100010, "KIM", 100);
		price = customerKim.calcPrice(10000);
		System.out.println("지불금액은 " + price + "이고, " + customerKim.showcustomerInfo());
		*/
		
		Customer customerWho = new VIPCustomer(100010, "Who", 100);
		int price = customerWho.calcPrice(10000);
		System.out.println("지불금액은 " + price + "이고, " + customerWho.showcustomerInfo());
		
		Customer customerGold = new GoldCustomer();
	}

}
