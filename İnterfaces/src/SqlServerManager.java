
public class SqlServerManager implements ICustomerDal {
	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Veritabanına Eklendi : Sql Server");
	}

	@Override
	public void del() {
		// TODO Auto-generated method stub
		System.out.println("Veritabanından Silindi : Sql Server");
	}

	@Override
	public void change() {
		// TODO Auto-generated method stub
		System.out.println("Veritabanında Değiştirildi : Sql Server");
	}

	@Override
	public void copy() {
		// TODO Auto-generated method stub
		System.out.println("Veritabanından Kopyalandı : Sql Server");
	}
}
