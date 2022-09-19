public class App {
    public static void main(String[] args) throws Exception {

        // Conditional Structure
        boolean isSuspended = false;
        boolean isHoliday = true;
        boolean ihaveNoMoney = true;

         if (isSuspended) {
            System.out.println("Classes are suspended! Stay at home and rest");
        }
        
        else if (isHoliday) {
            System.out.println("Spend time with family");
        }

        else if (ihaveNoMoney) {
            System.out.println("Ask your parents to drive you to NU");
            }
    
        else{

    // Hindi Suspended
    maypasok();

    // Step 1
    lakad();

    // Step 2
    sakayJeep();

    // Step 3
    sakayJeep1();

    // Step 4
    lakadulit();
        }

}

    static void maypasok(){
        System.out.println("There are classes, go to school!");
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