
// import the Scanner class
import java.util.Scanner;

public class App {

    // Scanner Object
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int product = multiply();
        System.out.println("The product is: " + product);

        double quotient = divide();
        System.out.println("The quotient is: " + quotient);

    }

    static int multiply() {
        System.out.println("Please enter two numbers to multiply");
        System.out.print("Enter first number: ");
        int x = scan.nextInt();

        System.out.print("Enter second number: ");
        int y = scan.nextInt();

        return x * y;
    
    }

    static double divide() {
        System.out.println("Please enter two numbers to divide");
        System.out.print("Enter first number: ");
        double x = scan.nextDouble();

        System.out.print("Enter second number: ");
        double y = scan.nextDouble();

        return x / y;
    
    }

}