package DataAccess;

import Entities.Customer;

public class JdbcCustomerDao implements CustomerDao {

	@Override
	public void add(Customer customer) {
		System.out.println(
				"Müşteri JDBC ile veritabanına eklendi : " + customer.getName() + " " + customer.getLastname());
	}

	@Override
	public void del(Customer customer) {
		System.out.println(
				"Müşteri JDBC ile veritabanından silindi : " + customer.getName() + " " + customer.getLastname());

	}

	@Override
	public void change(Customer customer) {
		System.out.println("Müşteri bilgisi JDBC ile veritabanından değiştirildi : " + customer.getName() + " "
				+ customer.getLastname());

	}
}
