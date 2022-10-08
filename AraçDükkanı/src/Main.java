import Entities.CommonVehicle;
import Entities.Customer;
import Business.CustomerManager;
import Business.VehicleManager;
import DataAccess.HibernateCustomerDao;
import DataAccess.HibernateVehicleDao;
import DataAccess.JdbcCustomerDao;
import DataAccess.JdbcVehicleDao;
import DataAccess.VehicleDao;

public class Main {

	public static void main(String[] args) throws Exception {
		VehicleManager vehiclemanager = new VehicleManager(new HibernateVehicleDao(), new JdbcCustomerDao());
		CustomerManager customermanager = new CustomerManager(new HibernateCustomerDao());

		Customer customer1 = new Customer("Ahmet", "Aycan", 28, "20.03.1994", "12345678901", "Turkey", "İstanbul");
		Customer customer2 = new Customer();
		customer2.setName("Elif");
		customer2.setLastname("Eski");
		customer2.setAge(20);
		customer2.setBirthday("21.07.2002");
		customer2.setNationalId("98765432109");
		customer2.setNational("Turkey");
		customer2.setCity("İzmir");

		CommonVehicle vehicle1 = new CommonVehicle("Wolkswagen", "Polo", 150000, "5+1", "2007", 15, 1, "None",
				"Car : Hatchback");
		CommonVehicle vehicle2 = new CommonVehicle();
		vehicle2.brand = "Ford";
		vehicle2.model = "Mustang";
		vehicle2.km = 105000;
		vehicle2.gears = "Automatic";
		vehicle2.year = "2015";
		vehicle2.age = 7;
		vehicle2.changePart = 0;
		vehicle2.damageRecord = "9000 TL";

		customermanager.add(customer1);
		customermanager.add(customer2);

		customermanager.change(customer1);
		customermanager.change(customer2);

		customermanager.del(customer1);
		customermanager.del(customer2);

		vehiclemanager.buyVehicle(vehicle2);
		vehiclemanager.buyVehicle(vehicle1);

		vehiclemanager.rentVehicle(customer1, vehicle2);
		vehiclemanager.rentVehicle(customer2, vehicle1);

		vehiclemanager.sellVehicle(customer2, vehicle1);
		vehiclemanager.sellVehicle(customer2, vehicle2);
	}

}
