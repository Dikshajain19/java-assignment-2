class Vehicle {
    protected String regnNumber;
    protected int speed;
    protected String color;
    protected String ownerName;

    public Vehicle(String regnNumber, int speed, String color, String ownerName) {
        this.regnNumber = regnNumber;
        this.speed = speed;
        this.color = color;
        this.ownerName = ownerName;
    }

    public void showData() {
        System.out.println("This is a vehicle class");
        System.out.println("Registration Number: " + regnNumber);
        System.out.println("Speed: " + speed);
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + ownerName);
    }
}

class Bus extends Vehicle {
    private int routeNumber;

    public Bus(String regnNumber, int speed, String color, String ownerName, int routeNumber) {
        super(regnNumber, speed, color, ownerName);
        this.routeNumber = routeNumber;
    }

    
    public void showData() {
        super.showData();
        System.out.println("Route Number: " + routeNumber);
    }
}

class Car extends Vehicle {
    private String manufacturerName;

    public Car(String regnNumber, int speed, String color, String ownerName, String manufacturerName) {
        super(regnNumber, speed, color, ownerName);
        this.manufacturerName = manufacturerName;
    }


    public void showData() {
        super.showData();
        System.out.println("Manufacturer Name: " + manufacturerName);
    }
}

public class ques10 {
    public static void main(String[] args) {
        Bus bus = new Bus("MP09AB1234", 60, "Red", "John Doe", 25);
        Car car = new Car("MP09CD5678", 120, "Blue", "Jane Doe", "Toyota");

        System.out.println("Bus Details:");
        bus.showData();

        System.out.println("\nCar Details:");
        car.showData();
    }
}
