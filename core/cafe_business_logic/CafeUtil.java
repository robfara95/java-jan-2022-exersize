import java.util.ArrayList;
import java.util.List;

public class CafeUtil {
  public int getStreakGoal (int numWeeks) {
    int sum = 0;
     int cnt = 0;
    for (int i = 1; i <= numWeeks; i++) {
      sum += i;
      cnt++;
    }
    System.out.println("cnt " + cnt);
    return sum;
  }

  public double getOrderTotal(double[] prices) {
    double sum = 0.0;
    for (int i = 0; i < prices.length; i++) {
        sum += prices[i];
    }
    return sum;
  }

  public void displayMenu(ArrayList<String> menuItems) {
    int itemNbr = 0;
    for (String item : menuItems) {
        System.out.printf("%d %s\n",(itemNbr++),item);
    }
  }

  public boolean displayMenu(ArrayList<String> menuItems, List<Double> menuPrice) {
    if (menuItems.size() != menuPrice.size()) {
        return false;
    }
    for (int i = 0; i < menuItems.size(); i++){
      System.out.printf("%d %s -- $%.2f\n", i, menuItems.get(i), menuPrice.get(i));
    }

    return true;
  }

  public void addCustomer(ArrayList<String> customers) {
    System.out.println("Please enter your name: ");
    String userName = System.console().readLine();
    System.out.printf("Hello, %s! ", userName);
    System.out.printf("There are %d people in front of you\n", customers.size());  
    customers.add(userName);
    System.out.println(customers); 
  }

  public void addCustomer2(ArrayList<String> customers) {
    System.out.println("Please enter your name or enter q to quit: ");
    String userName = System.console().readLine();;
    while(!userName.toUpperCase().equals("Q")) {
      System.out.printf("Hello, %s! ", userName);
      System.out.printf("There are %d people in front of you\n", customers.size());  
      customers.add(userName);
      System.out.println(customers);
      
      System.out.println("Please enter your name or enter q to quit: ");
      userName = System.console().readLine();
    }

  }

  void printPriceChart(String product, double price, int maxQuantity, double discount) {
    System.out.printf("%s\n", product);
    double totalPrice = price;
    
    for (int i = 0; i < maxQuantity; i++) {
        System.out.printf("%s - $%.2f\n", (i+1), totalPrice);
        totalPrice += (price - discount);
    }
  }


}