import java.util.ArrayList;

public class Order {
  private String name;
  private boolean ready;
  ArrayList<Item> items;

  Order () {
    this("Guest");
  }

  Order(String name) {
    this.name = name;
    this.items = new ArrayList<Item>();
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name){
    this.name = name;
  }

  public boolean getReady() {
    return this.ready;
  }

  public void setReady (boolean ready) {
    this.ready = ready;
  }

  public ArrayList<Item> getItems() {
    return items;
  }

  public void setItems(ArrayList<Item> items) {
    this.items = items;
  }

  public void addItem(Item item) {
    items.add(item);
  }

  public String getStatusMessage() {
    if (this.ready) {
      return "Your order is ready";
    } else {
      return "Thank you for waiting. Your order will be ready soon";
    }
  }

  public void display() {
    System.out.printf("Customer Name: %s\n", name);
    for (Item item: items){
      System.out.printf("%s - $%.2f\n",item.getName(),item.getPrice());
    }
    System.out.printf("Total - $%.2f\n",getOrderTotal());
  }

  public double getOrderTotal() {
    double total = 0;
    for (Item item: items){
      total += item.getPrice();
    }
    return total;
  }
}
