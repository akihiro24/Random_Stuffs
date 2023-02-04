import java.util.Scanner;

public class ArithObject {
    
    public static void main(String[] args) {
    int x,y;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 1st number:");
    x = sc.nextInt();
    System.out.println("Enter 2nd number:");
    y = sc.nextInt();
    
     ArithClass arith = new ArithClass();
      try {
         System.out.println("Sum: " + arith.sum(x, y));
         System.out.println("Difference: " + arith.difference(x, y));
         System.out.println("Product: " + arith.product(x, y));
         System.out.println("Quotient: " + arith.quotient(x, y));
         System.out.println("Modulus: " + arith.modulus(x, y));
      } catch (Exception e) {
         System.out.println("An error occurred: " + e.getMessage());
        }
  
    }

}
