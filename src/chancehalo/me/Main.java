package chancehalo.me;

public class Main {

    public static void main(String[] args) {
        double result = add(5, 2);
        System.out.println(result);
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
