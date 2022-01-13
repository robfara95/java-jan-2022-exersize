import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class TestCafe {
    public static void main(String[] args) {
        
    /* 
      You will need add 1 line to this file to create an instance 
      of the CafeUtil class. 
      Hint: it will need to correspond with the variable name used below..
    */
    	
        /* ============ App Test Cases ============= */
        CafeUtil appTest = new CafeUtil();
        System.out.println("\n----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week 10: %s \n\n", appTest.getStreakGoal(10));
    
        System.out.println("----- Order Total Test-----");
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        System.out.printf("Order total: %s \n\n",appTest.getOrderTotal(lineItems));
        
        System.out.println("----- Display Menu Test-----");
        
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("drip coffee");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");
        appTest.displayMenu(menu);

        System.out.println("---Display menu item and price------");
        List<Double> menuPrice = Arrays.asList(2.3, 3.4,5.6,7.6);
        appTest.displayMenu(menu, menuPrice);
   
        System.out.println("\n----- Add Customer Test-----");
        ArrayList<String> customers = new ArrayList<String>();
        // --- Test 4 times ---
        for (int i = 0; i < 4; i++) {
            appTest.addCustomer(customers);
            System.out.println("\n");
        }

        appTest.printPriceChart("Columbian Coffee Ground", 15.00, 3, 0);
        appTest.printPriceChart("Columbian Coffee Ground", 2.00, 4, 0);
        appTest.printPriceChart("Columbian Coffee Ground - Discount", 2.00, 4, 0.50);

        System.out.println("--------Adding customer no fix amount------------");
        ArrayList<String> customers2 = new ArrayList<String>();
        appTest.addCustomer2(customers2);
    }
}
