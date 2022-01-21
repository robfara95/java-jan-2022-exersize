public class CoffeeKiosk {
  public static void main(String[] args) {
    OrderKiosk orderKiosk = new OrderKiosk();
    orderKiosk.addMenuPrice("Banna", 2.00);
    orderKiosk.addMenuPrice("Coffee", 1.50);
    orderKiosk.addMenuPrice("Latte", 4.50);
    orderKiosk.addMenuPrice("capuccino", 3.00);
    orderKiosk.addMenuPrice("muffin", 4.00);

    orderKiosk.newOrder();
  }
}
