public class App {
    public static void main(String[] args) throws Exception {

        String today = "Monday";

        switch (today) {
            case "Monday":
                System.out.println("I attend f2f classes at NU Manila");
                break;
            case "Tuesday":
                System.out.println("I attend online classes using MS Teams");
                break;
            case "Wednesday":
                System.out.println("Wednesday is rest day");
                break;
            case "Thursday":
                System.out.println("I attend lecture classes on my Major Subjects");
                break;
            case "Friday":
                System.out.println("Some or all of the subjects are taken asynchronously");
                break;
            case "Saturday":
                System.out.println("I attend PE Subject virtually");
                break;
            case "Sunday":
                System.out.println("Sunday is also my rest day");
                break;
            default:
                System.out.println("Incorrect Day");
        }

    }
}