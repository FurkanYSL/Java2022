package DataAccess;

import Entities.Customer;

public class HibernateCustomerDao implements CustomerDao {

	@Override
	public void add(Customer customer) {
		System.out.println(
				"Müşteri Hibernate ile veritabanına eklendi : " + customer.getName() + " " + customer.getLastname());
	}

	@Override
	public void del(Customer customer) {
		System.out.println(
				"Müşteri Hibernate ile veritabanından silindi : " + customer.getName() + " " + customer.getLastname());

	}

	@Override
	public void change(Customer customer) {
		System.out.println("Müşteri bilgisi Hibernate ile veritabanından değiştirildi : " + customer.getName() + " "
				+ customer.getLastname());

	}

}
