package DataAccess;

import Entities.CommonVehicle;

public class HibernateVehicleDao implements VehicleDao {

	@Override
	public void add(CommonVehicle vehicle) {
		System.out.println("Araç Hibernate ile veritabanına eklendi");
	}

	@Override
	public void del(CommonVehicle vehicle) {
		System.out.println("Araç Hibernate ile veritabanından silindi");

	}

	@Override
	public void change(CommonVehicle vehicle) {
		System.out.println("Araç bilgisi Hibernate ile veritabanından değiştirildi");

	}

}
