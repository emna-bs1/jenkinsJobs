public class Calculator {

    // allows subtraction operation on two given numbers
    public double subtract(double a, double b) {
        return a - b;
    }

    //allows division operation on two given numbers
    public double divide(double a, double b) {
        return a / b;
    }

    //allows addition operation on two given numbers
    public double add(double a, double b) {
        return a + b;
    }

    //added to check if job's automatic rebuild works
    public double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("addition: " + calc.add(78, 44));
        System.out.println("subtraction: " + calc.subtract(7, -5));
        System.out.println("division" + calc.divide(10, 3.1));
        System.out.println("\nIt works like a charm!");
        System.out.println("multiplication" + calc.multiply(17, 3));
    }
}