package interfaceex;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customer = new Customer();
		
		Buy buyer = customer;		//타입을 어떤 변수에 바인딩했느냐에 따라 호출할 수 있는게 한정적임
		buyer.buy();
		
		Sell seller = customer;
		seller.sell();
		
		customer.order();
		buyer.order();
		seller.order();
	}

}
