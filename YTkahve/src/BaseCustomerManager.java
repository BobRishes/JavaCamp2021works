
public abstract class BaseCustomerManager implements CustomerSevice {

	public void save(Customer customer) {
		
		System.out.println("Saved to Database:"+customer.firstName);
	
		
	}

}
