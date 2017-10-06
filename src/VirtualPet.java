
public class VirtualPet {

	// attributes
	private String name = "Lucy the therapy dog";
	private int cupsKibbleNeeded = 3;
	private int cupsWaterNeeded = 3;
	private int nbrMilesNeedsToWalk = 5;

	private String favToy;

	// hunger level: too full = 0, not hungry = 1; hungry =2
	private int hungerLevel;
	// thirst level: not thirsty = 0, thirsty =1
	private int thirstLevel;
	private int tiredLevel;
	private boolean needsToPee;
	private boolean needsToPoop;
	private int weight = 50;

	// constructor
	public VirtualPet() {
		
	}
	
	public String getName() {
		return name;
	}
	
	public int getHungerLevel() {
		return hungerLevel;
	}
	
	public int getThirstLevel() {
		return thirstLevel;
	}
	
	public int getTiredLevel() {
		return tiredLevel;
	}
	
	void giveFood(int cupsKibble) {

		if (cupsKibble > cupsKibbleNeeded) {
			weight += 1;
			hungerLevel = 0;
		} else if (cupsKibble < cupsKibbleNeeded) {
			weight -= 1;
			hungerLevel = 1;
		} else {
			hungerLevel = 0;
		}
		needsToPoop = true;

	}

	void giveWater(int cupsWater) {

		if (cupsWater >= cupsWaterNeeded) {
			thirstLevel = 0;
		} else {
			thirstLevel = 1;
		}

		needsToPee = true;
	}

	void visitPatients() {

	}

	boolean catchFrisbee() {
		return true;
	}

	void goForWalk(int nbrMiles) {
		if (nbrMiles > nbrMilesNeedsToWalk) {
			tiredLevel = 3;
		} else if (nbrMiles < nbrMilesNeedsToWalk) {
			tiredLevel = 2;
		} else {
			tiredLevel = 0; // not tired

		}

	}

	String getStatus() {
		String status = "Lucy is fine";
		return status;
	}
}
