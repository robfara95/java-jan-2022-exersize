package listAssignmentfolder;

public class ListTester {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
//        sll.displaySingleEntry(sll.find(1), 1);
        
        sll.addTail(3);        
        sll.addTail(4);
        sll.addTail(10);
        sll.removeAt(2);
        
        sll.addTail(5);
        sll.addTail(15);
        sll.addTail(2);
        System.out.println("---bef delete---");
        sll.printValues(); 
        sll.removeTail();
        sll.removeTail();
        sll.removeTail();
        sll.removeTail();
        sll.removeTail();
        sll.removeTail();
        sll.removeTail();
        System.out.println("---after delete---");
        sll.printValues();
    }
}

