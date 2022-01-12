public class CafeJava {
  public static void main(String[] args) {
      // APP VARIABLES
      // Lines of text that will appear in the app. 
      String generalGreeting = "Welcome to Cafe Java, ";
      String pendingMessage = ", your order will be ready shortly";
      String readyMessage = ", your order is ready";
      String displayTotalMessage = "Your total is $";
      
      // Menu variables (add yours below)
      double mochaPrice = 3.5;
      double dripCoffeePrice = 2.25;
      double lattePrice = 4.2;
      double cappucinoPrice = 5.25;
  
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
      System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    // ** Your customer interaction print statements will go here ** //
      System.out.println(customer1 + pendingMessage);

      if (isReadyOrder4) {
        System.out.println(customer4 + readyMessage + "; " + displayTotalMessage + cappucinoPrice);
      } else {
        System.out.println(customer4 + pendingMessage);
      }

      System.out.println(customer2 + " " + displayTotalMessage + (lattePrice * 2));

      isReadyOrder2 = false;
      if (isReadyOrder2) {
        System.out.println(customer2 + readyMessage);
      } else {
        System.out.println(customer2 + pendingMessage);
      }

      System.out.printf("%s %s %.2f\n", customer3, displayTotalMessage, (lattePrice - dripCoffeePrice));

      mochaPrice = 4.5;
      dripCoffeePrice = 3.25;
      lattePrice = 5.2;
      cappucinoPrice = 6.25;
      isReadyOrder1 = true;
      isReadyOrder2 = false;
      isReadyOrder3 = true;
      isReadyOrder4 = false;
      System.out.printf("%s %s %.2f\n", customer1, displayTotalMessage,mochaPrice);
      System.out.printf("%s %s %.2f\n", customer2, displayTotalMessage,dripCoffeePrice);
      System.out.printf("%s %s %.2f\n", customer3, displayTotalMessage,lattePrice);
      System.out.printf("%s %s %.2f\n", customer4, displayTotalMessage,cappucinoPrice);
       
  }
}
