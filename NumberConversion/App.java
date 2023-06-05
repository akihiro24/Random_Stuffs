public class App {
    public static void main(String[] args) {

        int[] decimals = {65, 100, 5, 25, 10};
        String[] binaryStrings = {"11111", "10001", "1010", "11011", "100"};

        System.out.println("DEC2BIN:");
        for (int decimal : decimals) {
            String binary = Dec2Bin(decimal);
            System.out.println(decimal + " ---> " + binary);
        }

        System.out.println("BIN2DEC:");
        for (String binaryString : binaryStrings) {
            int decimal = Bin2Dec(binaryString);
            System.out.println(binaryString + " ---> " + decimal);
        }
    }

    //Converts Decimal to Binary
    public static String Dec2Bin(int n) {
        StringBuilder binary = new StringBuilder();
        while (n > 0) {
            binary.insert(0, n % 2);
            n /= 2;
        }
        return binary.toString();
    }

    public static int Bin2Dec(String n) {
        int decimal = 0;
        for (char c : n.toCharArray()) {
            decimal = decimal * 2 + (c - '0');
        }
        return decimal;
    }
}
