import java.util.Scanner;


class TooOlderException extends Exception {
    public TooOlderException(String message) {
        super(message);
    }
}


class TooYoungerException extends Exception {
    public TooYoungerException(String message) {
        super(message);
    }
}

public class ques24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter candidate name: ");
        String name = scanner.nextLine();

        System.out.print("Enter candidate age: ");
        int age = scanner.nextInt();

        try {
            checkEligibility(name, age);
        } catch (TooOlderException | TooYoungerException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkEligibility(String name, int age) throws TooOlderException, TooYoungerException {
        if (age > 45) {
            throw new TooOlderException("Too older: " + name);
        } else if (age < 20) {
            throw new TooYoungerException("Too younger: " + name);
        } else {
            System.out.println("Eligible: " + name);
        }
    }
}

