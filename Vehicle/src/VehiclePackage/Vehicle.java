package VehiclePackage;

public abstract class Vehicle {
	private int year;
	private double speed;
	public Vehicle(int year, double speed) {
		super();
		this.year = year;
		this.speed = speed;
	}
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public abstract String move();
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	@Override
	public String toString() {
		return "Vehicle [year=" + year + ", speed=" + speed + "]";
	}
	
}
