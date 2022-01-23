package animals;

public class Bat extends Mammal {
	public Bat(int energyLevel) {
		super(energyLevel);
	}

	public void fly() {
		System.out.println("Fly() Method. Sound of a bat taking off.");
		energyLevel -= 50;
	}
	
	public void eatHumans() {
		System.out.println("so well, nver mind, just increase its energy by 25.");
		energyLevel += 25;
	}
	
	public void atttackTown() {
		System.out.println("town on filre !!!!!");
		energyLevel -= 100;		
	}
	
	public String toString() {
		return String.format("Energy level %s", energyLevel);
	}
}
