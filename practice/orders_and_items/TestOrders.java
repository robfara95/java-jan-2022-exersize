import java.util.ArrayList;

import javax.swing.event.SwingPropertyChangeSupport;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item();
        item1.name = "macha";
        item1.price = 2.33;
        Item item2 = new Item();
        item2.name = "latte";
        item2.price = 5.22;
        Item item3 = new Item();
        item3.name = "drip Coffee";
        item3.price = 1.23;
        Item item4 = new Item();
        item4.name = "capuccino";
        item4.price = 7.88;
        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        order1.name = "Cindhuri";
        Order order2 = new Order();
        order2.name = "Jimmy";
        Order order3 = new Order();
        order3.name = "Noah";
        Order order4 = new Order();
        order4.name = "Sam";
       
        System.out.println("order1= " + order1);
        //printing order1 total
        System.out.println("order1.total "+ order1.total);
        //Add item1 to order2's item and increment the order totals
        order2.items.add(item1); 
        order2.total += item1.price;
        order3.items.add(item4); //Add the capp to order list and to tab
        order3.total += item4.price;
        order4.items.add(item2); //order4 added a latte. Update accord
        order4.total += item2.price; //

        order1.ready = true; //Cindhuris order is ready

        //sam order two more lattes
        order4.items.add(item2);
        order4.total += item2.price;
        order4.items.add(item2);
        order4.total += item2.price;

        //Jimi order is now ready
        order2.ready = true;
    
        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);
    }
}

