
public class Main {

	public static void main(String[] args) {

		CustomerManager customermanager1 = new CustomerManager(new OracleManager());

		// customermanager1.customerDal = new OracleManager();
		customermanager1.add();
		customermanager1.change();
		customermanager1.copy();
		customermanager1.del();
	}

}
