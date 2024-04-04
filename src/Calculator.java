public class Calculator {

    // Method to sum two real numbers and print the result
    public void sum(float number1, float number2) {
        float result = number1 + number2;
        System.out.println("The sum is: " + result);
    }

    // Main method to test the sum function
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Test the sum method with two numbers
        calc.sum(5.5f, 4.5f);
    }
}