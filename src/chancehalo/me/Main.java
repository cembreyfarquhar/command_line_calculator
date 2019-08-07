package chancehalo.me;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String xInput;
        String operInput;
        String yInput;

        boolean running = true;
        while (running) {
            String input = scanner.nextLine();
            if (input.equals("q")) {
                System.out.println("Goodbye!");
                running = false;
            } else if (input.split(" ").length == 3) {
                // valid format for an expression
                if (!isNumber(input.split(" ")[0]) || !isNumber(input.split(" ")[2])) {
                    System.out.println("not a valid number");
                } else {
                    // numbers are valid
                    if (isValidOperator(input.split(" ")[1])) {
                        // operator is valid

                    }
                }
                System.out.println("Good");
            } else {
                System.out.println("Please enter a valid expression");
            }
        }

    }

    private static boolean isValidOperator(String s) {
        if (s.equals("+") || s.equals("-")|| s.equals("*")|| s.equals("/") || s.equals("%")) {
            return true;
        } else return false;
    }

    public static boolean isNumber(String x) {
        try {
            double d = Double.parseDouble(x);
        } catch (NumberFormatException | NullPointerException nfe) {
            return false;
        }
        return true;
    }

    public static double add(double x, double y) {
        return x + y;
    }

    public static double subtract(double x, double y) {
        return x - y;
    }

    public static double divide(double x, double y) {
        return x / y;
    }

    public static double multiply(double x, double y) {
        return x * y;
    }

    public static double remainder(double x, double y) {
        return x % y;
    }
}
