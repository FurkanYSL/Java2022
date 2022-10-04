
public class Main {

	public static void main(String[] args) {
		İnfo info = new İnfo("Aslı","ÇALIŞKAN","+905555555555",19,"Betül","Ahmet","2003","July",25,"25.06.2003");
		info.print();
		
		info.setName("Aslı");
		info.setSurname("ÇALIŞKAN");
		info.setPhoneNumber("+905555555555");
		info.setAge(19);
		info.setMotherName("Betül");
		info.setFatherName("Ahmet");
		info.setBirthYear("2003");
		info.setBirthMounth("July");
		info.setBirthDay(25);
		info.setBirthDate("25.06.2003");
		System.out.println(info.getName());
		System.out.println(info.getSurname());
		System.out.println(info.getPhoneNumber());
		System.out.println(info.getAge());
		System.out.println(info.getMotherName());
		System.out.println(info.getFatherName());
		System.out.println(info.getBirthYear());
		System.out.println(info.getBirthMounth());
		System.out.println(info.getBirthDay());
		System.out.println(info.getBirthDate());
		System.out.println("************************************");
	}
	
}
