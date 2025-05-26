package generics;

public class Test <T>{
	T gpa;
	
	public Test(T gpa){
		this.gpa = gpa;
	}
	public void print() {
		System.out.println("gpa = " + gpa);
	}
}
