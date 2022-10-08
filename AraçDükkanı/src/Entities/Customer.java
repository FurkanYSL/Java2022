package Entities;

public class Customer {
	private String name;
	private String lastname;
	private int age;
	private String Birthday;
	private String nationalId;
	private String national;
	private String city;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBirthday() {
		return Birthday;
	}

	public void setBirthday(String birthday) {
		Birthday = birthday;
	}

	public String getNationalId() {
		return nationalId;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}

	public String getNational() {
		return national;
	}

	public void setNational(String national) {
		this.national = national;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Customer(String name, String lastname, int age, String birthday, String nationalId, String national,
			String city) {
		this.name = name;
		this.lastname = lastname;
		this.age = age;
		Birthday = birthday;
		this.nationalId = nationalId;
		this.national = national;
		this.city = city;
	}

	public Customer() {

	}

}
