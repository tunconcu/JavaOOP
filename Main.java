
public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinesi");
		product1.setUnitPrice(200);
		product1.setDiscount(25);
		product1.setImageUrl("coffee.jpg");
		product1.setUnitsInStock(5);
		

		Product product2 = new Product();
		product2.setName("Deloi Kahve Makinesi");
		product2.setUnitPrice(250);
		product2.setDiscount(20);
		product2.setImageUrl("coffee1.jpg");
		product2.setUnitsInStock(3);
		

		Product product3 = new Product();
		product3.setName("Chante Kahve Makinesi");
		product3.setUnitPrice(300);
		product3.setDiscount(15);
		product3.setImageUrl("coffee2.jpg");
		product3.setUnitsInStock(8);
		
		
		Product[] products = {product1,product2,product3};
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		
		individualCustomer.setId(1);
		individualCustomer.setCustomerNumber("0535555555");
		individualCustomer.setPhoneNumber("123123123");
		individualCustomer.setFirstName("Tunc");
		individualCustomer.setLastName("Oncu");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setCorporateAdress("antalya");
		corporateCustomer.setCorporateName("Descron");
		corporateCustomer.setPhoneNumber("242322222");
		corporateCustomer.setId(2);
		corporateCustomer.setCustomerNumber(null);
		
		Customer[] customer = {individualCustomer,corporateCustomer};
		
		for (Customer customer2 : customer) {
			System.out.println(customer2.getCustomerNumber());
		}
		
    }
}


