
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class ques19 {

    public static void riskyMethod() throws CustomException {
        throw new CustomException("This is a custom exception");
    }

    public static void main(String[] args) {
        try {
            int result = 10 / 0; 
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }

        try {
            riskyMethod();
        } catch (CustomException e) {
            System.out.println("Caught CustomException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed after custom exception");
        }

        try {
            throw new NullPointerException("Explicitly thrown NullPointerException");
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed after NullPointerException");
        }
    }
}
