package listAssignmentfolder;

public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        this.head = null;
    }
    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void addTail(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
            
        }
    } 
    
    public void removeTail() {
    	if (this.head == null) {
    		return;
    	}
    	Node current = this.head;
    	Node prev = null;
    	while (current.next != null) {
    		prev = current;
    		current = current.next;
    	}
    	
    	if (prev == null) {
    		head = null;
    	} else {
    		prev.next = null;
    	}
    	
    	current = null;
    }
    
    public void removeAt(int searchNodeId) {
       	if (this.head == null) {
    		return;
    	}
    	
    	Node current = this.head;
    	Node prevEntry = null;
    	int index = 0;
    	while (index <= searchNodeId && current != null) {
    		if (searchNodeId == index) {
    			if (index == 0) {
    				if (current.next == null) {
    					this.head = null;    					
    				} else {
    					this.head = current.next;
    				}
    				current = null;
    			} else {
    				prevEntry.next = current.next;
    			}
    			current = null;
    			return; 
    		}
    		
    		prevEntry = current;
    		current = current.next;
    		index++;
    	}
    	
    	
    }
    
    public Node find(int searchNodeId) {
    	if (this.head == null) {
    		return null;
    	}
    	
    	Node current = this.head;
    	int index = 0;
    	while (index <= searchNodeId && current != null) {
    		if (searchNodeId == index) {
    			return current; 
    		}
    		current = current.next;
    		index++;
    	}
    	
    	return current;
    }
    
    public void printValues() {
    	System.out.println("---------------------");
    	Node current = this.head;
    	while (current != null) {
    		System.out.printf("%d\n", current.value);
    		current = current.next;
    	}
    	
    }
    
    public void displaySingleEntry(Node entry, int srcIdx) {
        if (entry != null) {
        	System.out.printf("Serching index %d: value is %d\n", srcIdx,entry.value);
        } else {
        	System.out.printf("Index %s does not exists\n", srcIdx);
        }
    }
}

