package chancehalo.me;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        while (running) {
            String input = scanner.nextLine();
            switch (input) {
                case "q":
                    System.out.println("Goodbye");
                    running = false;
                default: System.out.println("Not a valid command...");
            }
        }

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
