package arts;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Museum {
	List<Art> art = new ArrayList<>();

	public static void main(String[] args) {
		Museum musem = new Museum();
		
		Painting paint1 = new Painting("New York City", "Guppy Anderson", "City Streets", "Oil");
		Painting paint2 = new Painting("City Streets", "Rory Gallagher", "Rogers Park", "Watercolor");
		Painting paint3 = new Painting("Sunnyvale, CA", "Steve Jobs", "Labtop Computerss", "Acrylic");
		System.out.println("------Paintings---------------------------");
		paint1.viewArt();
		paint2.viewArt();
		paint3.viewArt();
		
		Sculpture sculpture1 = new Sculpture("The Bronx", "Felix Pappalardi", "Bass Guitar", "Marble");
		Sculpture sculpture2 = new Sculpture("Mississippi Delta", "Hound Dog Taylor", "Blues Artist", "Bronze");
		System.out.println("-----Sculpture---------------------------");
		sculpture1.viewArt();
		sculpture2.viewArt();
		
		musem.addEntry(paint1);
		musem.addEntry(paint2);
		musem.addEntry(paint3);
		musem.addEntry(sculpture1);
		musem.addEntry(sculpture2);
		musem.displayEntries(false);
		musem.displayEntries(true);
		musem.displayEntries(true);
		
	}
	
	public void addEntry(Art artEntry) {
		art.add(artEntry);
	}
	
	public void displayEntries(boolean shuffle) {
		if (shuffle) {
			Collections.shuffle(art);
			System.out.println("-----Display Entries-Shuffled--------------------------");
		} else {
			System.out.println("-----Display Entries---------------------------");
		}

		
		for (Art entry: art) {
			entry.viewArt();
		}
	}

}
