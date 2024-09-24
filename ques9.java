
import java.util.Scanner;

abstract class ThreeDObject {
    abstract double wholeSurfaceArea();
    abstract double volume();
}

class Box extends ThreeDObject {
    double length, width, height;

    Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

   
    double wholeSurfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }

   
    double volume() {
        return length * width * height;
    }
}

class Cube extends ThreeDObject {
    double side;

    Cube(double side) {
        this.side = side;
    }

    
    double wholeSurfaceArea() {
        return 6 * side * side;
    }

    
    double volume() {
        return side * side * side;
    }
}

class Cylinder extends ThreeDObject {
    double radius, height;

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }


    double wholeSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    double volume() {
        return Math.PI * radius * radius * height;
    }
}

class Cone extends ThreeDObject {
    double radius, height;

    Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    
    double wholeSurfaceArea() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + slantHeight);
    }

   
    double volume() {
        return (Math.PI * radius * radius * height) / 3;
    }
}

public class ques9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("To calculate surface and volume of box enter 1");
        System.out.println("To calculate surface and volume of cube enter 2");
        System.out.println("To calculate surface and volume of cylinder enter 3");
        System.out.println("To calculate surface and volume of cone enter 4");
        System.out.println("enetr your choice : ");
        int choice=scanner.nextInt();
        switch(choice){
            case 1:
            System.out.println("Enter dimensions for Box (length, width, height):");
            Box box = new Box(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
            System.out.println("Box Surface Area: " + box.wholeSurfaceArea());
            System.out.println("Box Volume: " + box.volume());
            break;
            case 2:
            System.out.println("Enter side length for Cube:");
            Cube cube = new Cube(scanner.nextDouble());
            System.out.println("Cube Surface Area: " + cube.wholeSurfaceArea());
            System.out.println("Cube Volume: " + cube.volume());
            break;
            case 3:
            System.out.println("Enter dimensions for Cylinder (radius, height):");
            Cylinder cylinder = new Cylinder(scanner.nextDouble(), scanner.nextDouble());
            System.out.println("Cylinder Surface Area: " + cylinder.wholeSurfaceArea());
            System.out.println("Cylinder Volume: " + cylinder.volume());
            case 4:
            System.out.println("Enter dimensions for Cone (radius, height):");
            Cone cone = new Cone(scanner.nextDouble(), scanner.nextDouble());
            System.out.println("Cone Surface Area: " + cone.wholeSurfaceArea());
            System.out.println("Cone Volume: " + cone.volume());


        }

        scanner.close();
    }
}
