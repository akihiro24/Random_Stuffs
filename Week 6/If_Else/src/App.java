public class App {
    public static void main(String[] args) throws Exception {

        // Sequential Structure
        // Methods are called in order.

        // Step 1
        lakad();

        // Step 2
        sakayJeep();

        // Step 3
        sakayJeep1();

        // Step 4
        lakadulit();

    }

    static void lakad() {
        System.out.println("Walk for 7 mins to jeepney stop");
    }

    static void sakayJeep() {
        System.out.println("Ride jeep to Divisoria");
        System.out.println("Exit jeep at Divisoria");
    }

    static void sakayJeep1() {
        System.out.println("Ride jeep to Legarda");
        System.out.println("Exit jeep at Legarda");
    }

    static void lakadulit() {
        System.out.println("Walk to NU Manila");
    }

}