public class DivisionExample {
    public static void main(String[] args) {
        try {
            int number1 = 100;
            int number2 = 0;
            int result = number1 / number2;

            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
            System.out.println("Using default divisor: 1");

            int result = 100 / 1; // fallback value
            System.out.println("Result: " + result);
        }

        System.out.println("Program completed successfully.");
    }
}