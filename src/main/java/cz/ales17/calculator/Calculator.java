package cz.ales17.calculator;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class Calculator {
    public Calculator() {
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        String choice = "";
        // Checking if user wants to continue
        while (!(choice.equals("n"))) {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();
            System.out.println("Enter operation:\n1) num1 + num2\n2) num1 - num2\n3) num1 * num2\n4) num1 / num2");
            int operation = scanner.nextInt();
            // Formatting the result
            DecimalFormat format = new  DecimalFormat("#.##");
            System.out.println(format.format(getOutput(num1, num2, operation)));
            System.out.print("Continue? Y/N: ");
            choice = scanner.next().toLowerCase();
        }
        System.out.println("Thanks for using calculator.");
    }

    /**
     * Takes two numbers and returns result of chosen operation
     * @param num1
     * @param num2
     * @param operation
     * @return
     */
    public double getOutput(double num1, double num2, int operation) {
        return switch (operation) {
            case 1 -> sum(num1, num2);
            case 2 -> subtract(num1, num2);
            case 3 -> multiply(num1, num2);
            case 4 -> divide(num1, num2);
            default -> 0;
        };
    }

    /**
     * Returns sum of two numbers
     * @param num1
     * @param num2
     * @return
     */
    public double sum(double num1, double num2) {
        return num1 + num2;
    }

    /**
     * Returns subtraction of two numbers
     * @param num1
     * @param num2
     * @return
     */
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }
    /**
     * Returns multiplication of two numbers
     * @param num1
     * @param num2
     * @return
     */
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }
    /**
     * Returns division of two numbers
     * @param num1
     * @param num2
     * @return
     */
    public double divide(double num1, double num2) {
        return num1 / num2;
    }
}
