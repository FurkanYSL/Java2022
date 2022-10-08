package Business;

import DataAccess.CustomerDao;
import Entities.Customer;

public class CustomerManager {
	private CustomerDao customerDao;

	public CustomerManager(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	public void add(Customer customer) {
		customerDao.add(customer);
	}

	public void del(Customer customer) {
		customerDao.del(customer);
	}

	public void change(Customer customer) {
		customerDao.change(customer);
	}
}
