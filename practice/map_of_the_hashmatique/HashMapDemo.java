import java.util.HashMap;

public class HashMapDemo {
  public static void main(String[] args) {
    HashMap<String,String> trackList = new HashMap<> ();

    trackList.put("Bros","Shake your hair, have some fun");
    trackList.put("Yuk Foo","You bore me to death, well deplore me");
    trackList.put("Sadboy", "But you think too much");
    trackList.put("The Last Man on Earth", "Do you wait for your dancing lessons to be sent from God?");
    // Pull out one of Songs by its track title
    String lyric = trackList.get("Sadboy");
    System.out.printf("Song: %s Lyrics: %s\n\n", "Sadboy", lyric);

    System.out.println("------List of Tracks and Lyrics-------------");
    for (String song : trackList.keySet()){   
        System.out.printf("Track: %s Lyrics: %s\n", song, trackList.get(song));
    }
  }
}