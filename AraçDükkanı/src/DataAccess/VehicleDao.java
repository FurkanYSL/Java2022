package DataAccess;

import Entities.CommonVehicle;

public interface VehicleDao {
	void add(CommonVehicle vehicle);

	void del(CommonVehicle vehicle);

	void change(CommonVehicle vehicle);
}
