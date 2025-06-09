package advancedList;

public class Student {
	private String studentName;
	private double gpa;
	private int age;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String studentName, double gpa, int age) {
		super();
		this.studentName = studentName;
		this.gpa = gpa;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", gpa=" + gpa + ", age=" + age + "]";
	}
}
