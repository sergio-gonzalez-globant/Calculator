public class Calculator {

    // Method to sum two real numbers and print the result
    public void sum(float number1, float number2) {
        float result = number1 + number2;
        System.out.println("The sum is: " + result);
    }

    // Method to substract real numbers and print the result
    public void substract(float number1, float number2) {
        float result = number1 - number2;
        System.out.println("The substraction is: " + result);
    }

    // Method to multiply two real numbers and print the result
    public void multiply(float number1, float number2) {
        float result = number1 * number2;
        System.out.println("The multiplication result is: " + result);
    }

    // Method to divide two real numbers and print the result
    public void divide(float number1, float number2) {
        // Check if the divisor is not zero to avoid division by zero error
        if (number2 != 0) {
            float result = number1 / number2;
            System.out.println("The division result is: " + result);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }

    // Main method to test the sum, multiplication, and division functions
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Test the sum method with two numbers
        calc.sum(5.5f, 4.5f);

        // Test the multiplication method with two numbers
        calc.multiply(5.5f, 4.5f);

        // Test the division method with two numbers
        calc.divide(5.5f, 4.5f);

        // Test division by zero
        calc.divide(5.5f, 0f);
    }
}