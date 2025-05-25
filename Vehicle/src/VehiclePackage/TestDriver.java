package VehiclePackage;

public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create two Car objects
        Car car1 = new Car(2020, 120.5, "Toyota Camry");
        Car car2 = new Car(2022, 150.0, "Honda Civic");

        // Print car details
        System.out.println("Car 1 Details:");
        System.out.println(car1);
        System.out.println(car1.move());
        System.out.println();

        System.out.println("Car 2 Details:");
        System.out.println(car2);
        System.out.println(car2.move());
        System.out.println();

        // Compare cars by speed
        System.out.println("Comparing cars by speed:");
        if (car1.compareTo(car2) < 0) {
            System.out.println(car1.getModel() + " is slower than " + car2.getModel());
        } else if (car1.compareTo(car2) > 0) {
            System.out.println(car1.getModel() + " is faster than " + car2.getModel());
        } else {
            System.out.println(car1.getModel() + " and " + car2.getModel() + " have the same speed");
        }
    }

}
