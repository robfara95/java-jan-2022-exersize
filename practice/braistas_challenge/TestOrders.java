public class TestOrders {
    public static void main(String[] args) {
    
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order("Robert");
        Order order4 = new Order("Guppy");
        Order order5 = new Order("Puppy");
        Item item1 = new Item("macha", 2.33);
        Item item2 = new Item("latte", 5.22);
        Item item3 = new Item("drip Coffee", 1.23);
        Item item4 = new Item("capuccino", 7.88);
        order1.addItem(item4);
        order1.addItem(item2);
        order2.addItem(item1);
        order2.addItem(item2);
        order3.addItem(item3);
        order3.addItem(item3);
        order4.addItem(item4);
        order4.addItem(item1);
        order5.addItem(item2);
        order5.addItem(item3);
        System.out.println("---display order1-----");
        order1.display();
        System.out.println("---display order2-----");
        order2.display();
        System.out.println("---display order3-----");
        order3.display();
        System.out.println("---display order4-----");
        order4.display();
        System.out.println("---display order5-----");
        order5.display();
        System.out.println("---display order2 setready true----");
        order2.setReady(true);
        System.out.println(order2.getStatusMessage());
        System.out.println("---display order1 setready false----");
        order1.setReady(false);
        System.out.println(order1.getStatusMessage());
        
        
 
    }
}

