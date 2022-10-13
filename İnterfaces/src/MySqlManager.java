
public class MySqlManager implements ICustomerDal {

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Veritabanına Eklendi : MySql");
	}

	@Override
	public void del() {
		// TODO Auto-generated method stub
		System.out.println("Veritabanından Silindi : MySql");
	}

	@Override
	public void change() {
		// TODO Auto-generated method stub
		System.out.println("Veritabanında Değiştirildi : MySql");
	}

	@Override
	public void copy() {
		// TODO Auto-generated method stub
		System.out.println("Veritabanından Kopyalandı : MySql");
	}

}
