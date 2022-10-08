package Business;

import DataAccess.CustomerDao;
import DataAccess.VehicleDao;
import Entities.CommonVehicle;
import Entities.Customer;

public class VehicleManager {
	private VehicleDao vehicledao;
	private CustomerDao customerdao;

	public VehicleManager(VehicleDao vehicledao, CustomerDao customerdao) {
		this.vehicledao = vehicledao;
		this.customerdao = customerdao;
	}

	public void buyVehicle(CommonVehicle vehicle) throws Exception {
		if (vehicle.age > 20)
			throw new Exception("Araç Yaşı 20 den büyük ise satın alınamaz");
		System.out.println("Araç alınmıştır : " + vehicle.brand + " " + vehicle.model);
		vehicledao.add(vehicle);
	}

	public void sellVehicle(Customer customer, CommonVehicle vehicle) throws Exception {
		if (customer.getAge() < 18)
			throw new Exception("18 yaşından küçüklere araba satılı yapılmamaktadır");
		System.out.println("Araç yeni sahibine hayırlı olsun : " + customer.getName() + " " + customer.getLastname());
		vehicledao.del(vehicle);
		customerdao.add(customer);
	}

	public void rentVehicle(Customer customer, CommonVehicle vehicle) throws Exception {
		if (customer.getAge() < 20)
			throw new Exception("18 yaşından küçüklere araba satılı yapılmamaktadır");
		System.out.println("Araç geçici sahibine hayırlı olsun : " + customer.getName() + " " + customer.getLastname());
		vehicledao.change(vehicle);
		customerdao.add(customer);
	}
}
