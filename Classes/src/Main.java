
public class Main {

	public static void main(String[] args) {
		Student student1 = new Student();
		Teacher teacher1 = new Teacher();

		student1.name = "Abdullah Furkan";
		student1.surname = "YEŞİL";
		student1.school = "Mehmet Akif ERSOY University";
		student1.department = "Software Engineering";
		student1.phoneNumber = "00000000000";
		student1.setStudentNumber("1111111111");
		student1.setMidtermExam(40);
		student1.setFinalExam(60);
		student1.setGradeAverage();

		teacher1.name = "Akif";
		teacher1.surname = "SAYGIN";
		teacher1.school = "Mehmet Akif ERSOY University";
		teacher1.department = "Computer Science";
		teacher1.degree = "Master";
		teacher1.phoneNumber = "22222222222";
		teacher1.graduatedUniversity = "Gümüşhane University";
		teacher1.graduatedYear = "2019";
		teacher1.setTeacherPassword("3333333333");

		System.out.println("***************************************");
		System.out.println("Name : " + student1.name);
		System.out.println("Surname : " + student1.surname);
		System.out.println("School : " + student1.school);
		System.out.println("Department : " + student1.department);
		System.out.println("Phone Number : " + student1.phoneNumber);
		System.out.println("Student Number : " + student1.getStudentNumber());
		System.out.println("Midterm Exam : " + student1.getMidtermExam());
		System.out.println("Final Exam : " + student1.getFinalExam());
		System.out.println("Grade Average : " + student1.getGradeAverage());
		System.out.println("***************************************");
		System.out.println("Name : " + teacher1.name);
		System.out.println("Surname : " + teacher1.surname);
		System.out.println("School : " + teacher1.school);
		System.out.println("Department : " + teacher1.department);
		System.out.println("Phone Number : " + teacher1.phoneNumber);
		System.out.println("Graduated University : " + teacher1.graduatedUniversity);
		System.out.println("Graduated Year : " + teacher1.graduatedYear);
		System.out.println("Teacher Password : " + teacher1.getTeacherPassword());
		System.out.println("***************************************");
	}

}
