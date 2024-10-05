class CustomArithmeticException extends Exception {
    public CustomArithmeticException(String message) {
        super(message);
    }
}


public class ques22 {
  
    public static double calculate(double a, double b) throws CustomArithmeticException {
        if (b == 0) {
            throw new CustomArithmeticException("Division by zero is not allowed.");
        }
        if (a < 0) {
            throw new CustomArithmeticException("Square root of a negative number is not allowed.");
        }
        return Math.sqrt(a) / b;
    }

    public static void main(String[] args) {
        try {
            double result = calculate(-4, 0);
            System.out.println("Result: " + result);
        } catch (CustomArithmeticException e) {
            System.out.println("CustomArithmeticException caught: " + e.getMessage());
        }
    }
}
