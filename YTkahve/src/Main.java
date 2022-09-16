
public class Main {

	public static void main(String[] args) {
	
		BaseCustomerManager customerManager=new StarbucksCustomerManager(new CustomerCheckManager());
		
		Customer customer1=new Customer();
		customer1.dateOfBirth="1997";
		customer1.firstName="Burak";
		customer1.id=1;
		customer1.lastName="Mustafa";
		customer1.tc="1234";
		
		customerManager.save(customer1);

	}

}
