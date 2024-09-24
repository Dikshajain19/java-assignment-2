class Animal {

    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass
class Dog extends Animal {
    
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class ques6 {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();

        myAnimal.sound(); 
        myDog.sound(); 
    }
}