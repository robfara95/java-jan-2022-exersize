import java.util.ArrayList;

public class OrderKiosk {
  private ArrayList<Item> menu;
  private ArrayList<Order> orders;

  public OrderKiosk () {
    menu = new ArrayList<Item> ();
    orders = new ArrayList<Order> ();
  }

  public void addMenuPrice(String name, double price) {
    menu.add(new Item(name, price));
    Item it = menu.get(menu.size() - 1);
    it.setIndex(menu.size() - 1);
  }

  public void displayMenu() {
    for (Item itemEntry : menu) {
      System.out.printf("%d.%s -- $%.2f\n", itemEntry.getIndex(),itemEntry.getName(), itemEntry.getPrice());
    }
  }

  public void newOrder() {
    // Shows the user a message prompt and then sets their input to a variable, name
      System.out.println("Please enter customer name for new order:");
      String name = System.console().readLine();
  
    // Your code:
      // Create a new order with the given input string
      // Show the user the menu, so they can choose items to add.
       displayMenu();
    // Prompts the user to enter an item number
      System.out.println("Please enter a menu item index or q to quit:");
      String itemNumber = System.console().readLine();
      Order orderNew = new Order(name);
      // Write a while loop to collect all user's order items
        while(!itemNumber.equals("q")) {
          int itemNbr = 0;
          try {
            itemNbr = Integer.parseInt(itemNumber);
            if (itemNbr >= menu.size() || itemNbr < 0) {
              itemNumber = readNextInput("must enter q or valid nbr entry between 0 and " + (menu.size() - 1));
              continue;
            }
          } catch (NumberFormatException e) {
            itemNumber = readNextInput("must enter q or valid nbr entry between 0 and " + (menu.size() - 1));
            continue;
          }
          
          Item itm = menu.get(itemNbr);
          
          orderNew.addItem(itm);
          orders.add(orderNew);
          
          // Get the item object from the menu, and add the item to the order
          // Ask them to enter a new item index or q again, and take their input
          itemNumber = readNextInput(null);
          // System.out.println("Please enter a menu item index or q to quit:");
          // itemNumber = System.console().readLine();
         
      }
      // After you have collected their order, print the order details 
    // as the example below. You may use the order's display method.
    orderNew.display();
      
  }

  private String readNextInput(String message) {
    System.out.println("Please enter a menu item index or q to quit:");
    if (message != null) {
      System.out.println(message);
    }
    
    return System.console().readLine();
  }

}