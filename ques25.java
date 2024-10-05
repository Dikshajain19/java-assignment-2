
class UsernameTooShortException extends Exception {
    public UsernameTooShortException(String message) {
        super(message);
    }
}


class PasswordMismatchException extends Exception {
    public PasswordMismatchException(String message) {
        super(message);
    }
}

public class ques25 {
  
    public static void validateCredentials(String username, String password, String correctPassword) 
            throws UsernameTooShortException, PasswordMismatchException {
        if (username.length() < 6) {
            throw new UsernameTooShortException("Username must be at least 6 characters long");
        }
        if (!password.equals(correctPassword)) {
            throw new PasswordMismatchException("Password does not match");
        }
        System.out.println("Credentials are valid");
    }

    public static void main(String[] args) {
        String username = "user"; // Example username
        String password = "pass123"; // Example password
        String correctPassword = "securepassword"; // Predefined correct password

        try {
            validateCredentials(username, password, correctPassword);
        } catch (UsernameTooShortException | PasswordMismatchException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
