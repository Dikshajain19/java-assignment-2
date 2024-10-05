import java.util.HashMap;
import java.util.Map;

class NoMatchFoundException extends Exception {
    public NoMatchFoundException(String message) {
        super(message);
    }
}

public class ques21 {
    private static Map<String, String> capitals = new HashMap<>();

    static {
        capitals.put("India", "New Delhi");
        capitals.put("USA", "Washington, D.C.");
        capitals.put("France", "Paris");
        capitals.put("Japan", "Tokyo");
        capitals.put("Australia", "Canberra");
        // Add more countries and their capitals as needed
    }

    public static String getCapital(String country) throws NoMatchFoundException {
        if (capitals.containsKey(country)) {
            return capitals.get(country);
        } else {
            throw new NoMatchFoundException("No match found for country: " + country);
        }
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java CapitalFinder <country>");
            System.exit(1);
        }

        String country = args[0];
        try {
            String capital = getCapital(country);
            System.out.println("The capital of " + country + " is " + capital + ".");
        } catch (NoMatchFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
