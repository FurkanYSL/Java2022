public class CustomerManager {
	
	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}

	public void add() {
		customerDal.add();
	}
	
	public void del() {
		customerDal.del();
	}
	
	public void change() {
		customerDal.change();
	}
	
	public void copy() {
		customerDal.copy();
	}
}
