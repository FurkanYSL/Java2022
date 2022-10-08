package DataAccess;

import Entities.Customer;

public interface CustomerDao {
	void add(Customer customer);

	void del(Customer customer);

	void change(Customer customer);
}
