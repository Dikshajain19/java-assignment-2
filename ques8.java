class Parent {
    public static void display() {
        System.out.println("Static method in Parent class");
    }
}

class Child extends Parent {
    public static void display() {
        System.out.println("Static method in Child class");
    }
}

public class ques8 {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Parent child = new Child();

        // Method hiding
        parent.display(); // Calls Parent's static method
        child.display();  // Calls Parent's static method
    }
}
