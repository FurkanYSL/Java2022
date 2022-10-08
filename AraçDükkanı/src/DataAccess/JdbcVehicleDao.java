package DataAccess;

import Entities.CommonVehicle;

public class JdbcVehicleDao implements VehicleDao {

	@Override
	public void add(CommonVehicle vehicle) {
		System.out.println("Araç JDBC ile veritabanına eklendi");
	}

	@Override
	public void del(CommonVehicle vehicle) {
		System.out.println("Araç JDBC ile veritabanından silindi");

	}

	@Override
	public void change(CommonVehicle vehicle) {
		System.out.println("Araç bilgisi JDBC ile veritabanından değiştirildi");

	}

}
