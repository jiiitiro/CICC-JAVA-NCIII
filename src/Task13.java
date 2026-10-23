public class Task13 {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2022, 4);
        System.out.println(car.displayDetails());

        // lambda version (needs: import java.util.function.Consumer;)
//        Consumer<Car> printDetails = c -> System.out.println(c.displayDetails());
//        printDetails.accept(new Car("Toyota", "Camry", 2022, 4));
    }
}
class Vehicle {
    protected String make;
    protected String model;
    protected int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
}
class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }

//    public void displayDetails() {
//        System.out.println("Car Details:");
//        System.out.println("Make: " + make);
//        System.out.println("Model: " + model);
//        System.out.println("Year: " + year);
//        System.out.println("Number of Doors: " + numberOfDoors);
//    }

    public String displayDetails() {
        return "Car Details:\n" +
                "Make: " + make + "\n" +
                "Model: " + model + "\n" +
                "Year: " + year + "\n" +
                "Number of Doors: " + numberOfDoors;
    }
}
