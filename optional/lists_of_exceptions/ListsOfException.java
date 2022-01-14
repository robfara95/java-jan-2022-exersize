import java.util.ArrayList;

public class ListsOfException {
  public static void main(String[] args) {
    ArrayList<Object> myList = new ArrayList<>();
    myList.add("13");
    myList.add("hello world");
    myList.add(48);
    myList.add("Goodbye World");


    for (int i = 0; i < myList.size(); i++) {
        try {
          Integer castedValue = (Integer) myList.get(i);
          System.out.println("-----------------------");
          System.out.println("castedvalue " + castedValue);
        } 
        catch (ClassCastException e) {
          System.out.println("-----------------------");
          System.out.println("Error Value: " +  myList.get(i) + " " + myList.get(i).getClass());
          
          System.out.println("e:" + e);
          System.out.println("e.getMessage(): " + e.getMessage());
          e.printStackTrace();
        }
        
    }

  }
}