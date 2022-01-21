public class Item {
  private String name;
  private double price;
  public int index;

  public Item (String name, double price) {
    this.name = name;
    this.price = price;
  }

  public void setIndex(int index) {
    this.index = index;
  }

  public int getIndex() {
    return index;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public double getPrice() {
    return this.price;
  }
}
