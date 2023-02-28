package inheritance;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerKim = new Customer();
		customerKim.setCustomerName("KimKyuHwan");
		customerKim.setCustomerID(100010);
		customerKim.bonusPoint = 0;
		System.out.println(customerKim.showCustomerInfo());
		
		VIPCustomer customerLee = new VIPCustomer();
		customerLee.setCustomerName("LeeKyuHwan");
		customerLee.setCustomerID(100011);
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
	}

}
