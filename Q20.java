public class Main {
    public static void main(String[] args) {

        try {
            
            if (args.length < 2) {
                throw new ArrayIndexOutOfBoundsException("Please provide two numbers.");
            }

            
            int numerator = Integer.parseInt(args[0]);
            int denominator = Integer.parseInt(args[1]);

            
            int result = numerator / denominator;

            System.out.println("Numerator: " + numerator);
            System.out.println("Denominator: " + denominator);
            System.out.println("Result: " + result);

        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Missing command-line arguments.");
        } 
        catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integers.");
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } 
        catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        }
    }
}public class Q20 {
    public static void main(String[] args) {

        try {
            
            if (args.length < 2) {
                throw new ArrayIndexOutOfBoundsException("Please provide two numbers.");
            }

            
            int numerator = Integer.parseInt(args[0]);
            int denominator = Integer.parseInt(args[1]);

            
            int result = numerator / denominator;

            System.out.println("Numerator: " + numerator);
            System.out.println("Denominator: " + denominator);
            System.out.println("Result: " + result);

        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Missing command-line arguments.");
        } 
        catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integers.");
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } 
        catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        }
    }
}public class Main {
    public static void main(String[] args) {

        try {
            
            if (args.length < 2) {
                throw new ArrayIndexOutOfBoundsException("Please provide two numbers.");
            }

            
            int numerator = Integer.parseInt(args[0]);
            int denominator = Integer.parseInt(args[1]);

            
            int result = numerator / denominator;

            System.out.println("Numerator: " + numerator);
            System.out.println("Denominator: " + denominator);
            System.out.println("Result: " + result);

        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Missing command-line arguments.");
        } 
        catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integers.");
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } 
        catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        }
    }
}
