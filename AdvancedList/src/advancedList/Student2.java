package advancedList;

public class Student2 implements Comparable<Student2>{
	private String studentName;
	private double gpa;
	private int age;
	@Override
	public String toString() {
		return "Student2 [studentName=" + studentName + ", gpa=" + gpa + ", age=" + age + "]";
	}
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
	public Student2(String studentName, double gpa, int age) {
		super();
		this.studentName = studentName;
		this.gpa = gpa;
		this.age = age;
	}
	public Student2() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int compareTo(Student2 o2) {
		
		return Integer.compare(this.getAge(), o2.getAge());
	}
}
