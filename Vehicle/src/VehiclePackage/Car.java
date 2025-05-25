package VehiclePackage;

public class Car extends Vehicle implements Comparable{
	private String model;

	
	@Override
	public String move() {
		return "The car " + model + " driving with a " + super.getSpeed() + "km/h.";
		
	}

	public Car(int year, double speed, String model) {
		super(year, speed);
		this.model = model;
	}


	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Car(int year, double speed) {
		super(year, speed);
		// TODO Auto-generated constructor stub
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	@Override
	public String toString() {
		return "Car [model=" + model + " " + super.toString() + " ]";
	}
	
	@Override
	public int compareTo(Car second) {
		return Double.compare(this.getSpeed(), second.getSpeed());
			
	}
	
	
}
