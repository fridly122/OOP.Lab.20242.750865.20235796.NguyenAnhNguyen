import javax.swing.JOptionPane;

public class Calculator {
    public static void main(String[] args) {
        // Get first number
        String input1 = JOptionPane.showInputDialog(null, "Enter the first number:", "Input", JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(input1);

        // Get second number
        String input2 = JOptionPane.showInputDialog(null, "Enter the second number:", "Input", JOptionPane.INFORMATION_MESSAGE);
        double num2 = Double.parseDouble(input2);

        // Perform calculations
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = (num2 != 0) ? (num1 / num2) : Double.NaN; // Handle division by zero

        // Display results
        String message = "Sum: " + sum + 
                         "\nDifference: " + difference + 
                         "\nProduct: " + product + 
                         "\nQuotient: " + quotient;
        
        JOptionPane.showMessageDialog(null, message, "Results", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
