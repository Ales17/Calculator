package cz.ales17.calculator;

import java.util.Scanner;

public class Calculator {
    public Calculator() {}

    public void start() {
        Scanner scanner = new Scanner(System.in);
        String choice = "";
        while (!(choice.equals("n"))) {
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();
            System.out.println("Enter operation:\n1) +\n2) -\n3) *\n4) /");
            int operation = scanner.nextInt();
            int output = switch (operation) {
                case 1 -> sum(num1, num2);
                case 2 -> subtract(num1, num2);
                case 3 -> multiply(num1, num2);
                case 4 -> divide(num1, num2);
                default -> 0;
            };

            System.out.println(output);
            System.out.print("Continue? Y/N: ");
            choice = scanner.next().toLowerCase();
        }

        System.out.println("Bye, bye");
    }
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public int divide(int num1, int num2) {
        return num1 / num2;
    }
}
