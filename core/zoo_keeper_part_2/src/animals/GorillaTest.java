package animals;

public class GorillaTest {

	public static void main(String[] args) {
		Gorilla gorilla = new Gorilla(100);
		//Gorilla throw three things
		gorilla.displayEnergy();
		gorilla.throwSomething();
		gorilla.displayEnergy();
		gorilla.throwSomething();
		gorilla.displayEnergy();
		gorilla.throwSomething();
		gorilla.displayEnergy();
		
		//Gorilla eat bananas twice
		gorilla.eatBananas();
		gorilla.displayEnergy();
		gorilla.eatBananas();
		gorilla.displayEnergy();
		
		//Gorilla climb once
		gorilla.climb();
		gorilla.displayEnergy();
		
	}

}
