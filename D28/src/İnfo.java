
public class İnfo {

	public İnfo(String name, String surname, String phoneNumber, int age, String motherName, String fatherName,
			String birthYear, String birthMounth, int birthDay, String birthDate) {
		System.out.println("~~~Yapıcı Metod Çalıştı~~~");
		this.name = name;
		this.surname = surname;
		this.phoneNumber = phoneNumber;
		this.age = age;
		this.motherName = motherName;
		this.fatherName = fatherName;
		this.birthYear = birthYear;
		this.birthMounth = birthMounth;
		this.birthDay = birthDay;
		this.birthDate = birthDate;
	}
	
	public void print() {
		System.out.println("************************************");
		System.out.println(this.name);
		System.out.println(this.surname);
		System.out.println(this.phoneNumber);
		System.out.println(this.age);
		System.out.println(this.motherName);
		System.out.println(this.fatherName);
		System.out.println(this.birthYear);
		System.out.println(this.birthMounth);
		System.out.println(this.birthDay);
		System.out.println(this.birthDate);
		System.out.println("************************************");
	}
	
	private String name;
	private String surname;
	private String phoneNumber;
	private int age;
	private String motherName;
	private String fatherName;
	private String birthYear;
	private String birthMounth;
	private int birthDay;
	private String birthDate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}

	public String getBirthMounth() {
		return birthMounth;
	}

	public void setBirthMounth(String birthMounth) {
		this.birthMounth = birthMounth;
	}

	public int getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(int birthday) {
		this.birthDay = birthday;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
}
