
public class VirtualPet {

	// attributes
	private String name;
	private int weight;
	private int cupsKibbleNeeded;
	private int cupsWaterNeeded;
	private int nbrMilesNeedsToWalk;

	private int hungerLevel = 75;
	private int thirstLevel = 75;
	// activityLevel of 33-66 is happy and exercised
	// activityLevel of 67 or higher is highly exercised
	// activityLevel of 0-33 is needing exercise
	private int activityLevel = 0;

	private boolean needsToPee = false;
	private boolean needsToPoop = false;

	// constructor
	public VirtualPet(String name, int weight, int cupsKibbleNeeded, int cupsWaterNeeded) {
		this.name = name;
		this.weight = weight;
		this.cupsKibbleNeeded = cupsKibbleNeeded;
		this.cupsWaterNeeded = cupsWaterNeeded;
	}

	// getters
	public String getName() {
		return name;
	}

	public int getHungerLevel() {
		return hungerLevel;
	}

	public int getThirstLevel() {
		return thirstLevel;
	}

	public int getActivityLevel() {
		return activityLevel;
	}

	String getStatus() {
		String status = "";
		boolean needsSomething = false;
		if (hungerLevel > 75) {
			needsSomething = true;
			status += name + " is hungry! ";
		}
		if (thirstLevel > 75) {
			needsSomething = true;
			status += name + " is thirsty! ";
		}
		if ((activityLevel < 33) || needsToPee || needsToPoop) {
			needsSomething = true;
			status += name + " needs a walk, please.";
			status += "(";
			if (activityLevel < 33) {
				status += "Needs exercise! ";
			}
			if (needsToPee) {
				status += "Needs to pee! ";
			}
			if (needsToPoop) {
				status += "Needs to poop!";
			}
			status += ")";
		}

		return status;
	}

	void tick() {
		hungerLevel += 5;
		thirstLevel += 5;
		activityLevel -= 5;
	}

	void giveFood(int cupsKibble) {

		if (cupsKibble > cupsKibbleNeeded) {
			weight += 1;
			hungerLevel = 0;
		} else if (cupsKibble < cupsKibbleNeeded) {
			weight -= 1;
			hungerLevel = 5;
		} else {
			hungerLevel = 0;
		}
		needsToPoop = true;

	}

	void giveWater(int cupsWater) {

		if (cupsWater >= cupsWaterNeeded) {
			thirstLevel = 0;
		} else {
			thirstLevel = 10;
		}
		needsToPee = true;

	}

	void goForWalk(int nbrMiles) {

		if (nbrMiles > nbrMilesNeedsToWalk) {
			activityLevel = 75;
		} else if (nbrMiles < nbrMilesNeedsToWalk) {
			activityLevel = 25;
		} else { // nbrMiles = nbrMilesNeedsToWalk
			activityLevel = 50; 
		}
		needsToPee = false;
		needsToPoop = false;

		System.out.println("activityLevel is now " + activityLevel);
	}

}
