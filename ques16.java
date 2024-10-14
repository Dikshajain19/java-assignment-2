class Example {
    static int staticVar = 10;9
    int instanceVar;
    static {
        System.out.println("Static block executed.");
        staticVar = 20;
    }

    static void staticMethod() {
        System.out.println("Static method called.");
        System.out.println("Static variable: " + staticVar);
    }

    void instanceMethod() {
        System.out.println("Instance method called.");
        System.out.println("Instance variable: " + instanceVar);
    }
}

public class ques16 {
    public static void main(String[] args) {
        // Accessing static variable and method without creating an object
        System.out.println("Accessing static members without creating an object:");
        Example.staticMethod();

        // Creating an object of the Example class
        Example obj = new Example();
        obj.instanceVar = 30;

        // Accessing instance method
        System.out.println("\nAccessing instance members through an object:");
        obj.instanceMethod();
    }
}
