class TooHot extends Exception {
    public TooHot(String message) {
        super(message);
    }
}

class TooCold extends Exception {
    public TooCold(String message) {
        super(message);
    }
}

public class ques23 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide the temperature as a command line argument.");
            return;
        }

        try {
            double tempCelsius = Double.parseDouble(args[0]);
            checkTemperature(tempCelsius);
        } catch (NumberFormatException e) {
            System.out.println("Invalid temperature format. Please enter a valid number.");
        } catch (TooHot e) {
            System.out.println(e.getMessage());
        } catch (TooCold e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkTemperature(double temp) throws TooHot, TooCold {
        if (temp > 35) {
            throw new TooHot("Temperature is too hot!");
        } else if (temp < 5) {
            throw new TooCold("Temperature is too cold!");
        } else {
            System.out.println("Normal");
            double tempFahrenheit = (temp * 9/5) + 32;
            System.out.println("Temperature in Fahrenheit: " + tempFahrenheit);
        }
    }
}