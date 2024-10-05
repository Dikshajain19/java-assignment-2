import java.util.Scanner;


class NegativeAgeException extends Exception {
    public NegativeAgeException(String message) {
        super(message);
    }
}

public class ques26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        try {
            validateAge(name, age);
        } catch (NegativeAgeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void validateAge(String name, int age) throws NegativeAgeException {
        if (age < 0) {
            throw new NegativeAgeException("Age cannot be negative: " + age);
        } else {
            System.out.println("Name: " + name + ", Age: " + age);
        }
    }
}
