
public class Student extends General {
	private String studentNumber;
	private int midtermExam;
	private int finalExam;
	private double gradeAverage;

	public int getMidtermExam() {
		return midtermExam;
	}

	public void setMidtermExam(int midtermExam) {
		this.midtermExam = midtermExam;
	}

	public int getFinalExam() {
		return finalExam;
	}

	public void setFinalExam(int finalExam) {
		this.finalExam = finalExam;
	}

	public double getGradeAverage() {
		return gradeAverage;
	}

	public void setGradeAverage() {
		this.gradeAverage = ((getMidtermExam() * 40) / 100) + ((getFinalExam() * 60) / 100);
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

}
