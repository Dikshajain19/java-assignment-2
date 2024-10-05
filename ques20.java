public class ques20 {
    public static void main(String[] args) {
        
        try {
            int[] array = new int[-5]; 
        } catch (NegativeArraySizeException e) {
            System.out.println("Caught NegativeArraySizeException: " + e.getMessage());
        }

    
        try {
            int result = 10 / 0; 
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
    }
}
