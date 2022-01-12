import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        return String.format("Hello, %s. Lovely to see you", name);
    }

    public String guestGreeting() {
      return "Hello fine guest. Lovelt to see you";
    }
    
    public String dateAnnouncement() {
        Date today = new Date();
        return String.format("it is currently %s", today);
    }
    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        if (conversation.indexOf("Alexis") >= 0) {
          return "Right away, sir. She certainlay isn't sophisticated enought for that";
        } else if(conversation.indexOf("Alfred") >= 0) {
          return "At Your servide. As you wish, naturally";
        } else {
          return "Right. And with that I shall retire";
        }
        
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

