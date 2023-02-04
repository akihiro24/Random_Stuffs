public class ArithClass {
    
    int sum(int x, int y) {
    return x + y;
    }
    int difference(int x, int y) {
    return x - y;
    }
    int product(int x, int y) {
    return x * y;
    }
    int quotient(int x, int y) throws Exception {
    if (y == 0) {
    throw new Exception("Cannot divide by zero");
    }
    return x / y;
    }
    int modulus(int x, int y) throws Exception {
    if (y == 0) {
    throw new Exception("Cannot divide by zero");
    }
    return x % y;
    }
    
}
