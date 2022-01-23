package animals;

public class BatTest {

	public static void main(String[] args) {
		Bat bat = new Bat(300);
		
		bat.displayEnergy();
		bat.atttackTown();
		bat.atttackTown();
		bat.atttackTown();
		
		bat.displayEnergy(); 
		bat.eatHumans();
		bat.eatHumans();
		
		bat.displayEnergy();
		bat.fly();
		bat.fly();
		
		bat.displayEnergy();
		

	}

}
