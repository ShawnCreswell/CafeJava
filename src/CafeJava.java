
public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app.
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready ";
        String displayTotalMessage = "Your total is $";

        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double coffePrice = 1;
        double cappuccino = 2.5;
        double lattePrice = 2.2;

        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;

        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:

//        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
        // ** Your customer interaction print statements will go here ** //


//        System.out.println(customer1 + " ordered a coffee\n" ); // Displays
//        System.out.println(customer4 + " ordered a cappuccino\n" ); // Displays
//        System.out.println(isReadyOrder4 ? customer4 + readyMessage + displayTotalMessage + cappuccino : customer4 + pendingMessage); // Displays
//        System.out.println(customer2 + " ordered 2 lattes\n");
//        System.out.println(isReadyOrder2 ? customer2 + readyMessage + displayTotalMessage + (lattePrice + lattePrice): customer2 + pendingMessage);
        System.out.println(displayTotalMessage + (lattePrice - coffePrice));

    }
}
