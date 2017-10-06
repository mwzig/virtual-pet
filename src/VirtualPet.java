
public class VirtualPet {

	// attributes
	private String name;
	private int weight;
	
	private int hungerLevel;
	private int thirstLevel;
	private int activityLevel = 0;

	private boolean needsToPee = false;
	private boolean needsToPoop = false;

	// constructor
	public VirtualPet(String name, int hungerLevel, int thirstLevel, int activityLevel) { 
		this.name = name;
		this.hungerLevel = hungerLevel;
		this.thirstLevel = thirstLevel;;
		this.activityLevel = activityLevel;
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
		if (hungerLevel >= 50) {
			needsSomething = true;
			status += name + " is hungry! ";
		}
		if (thirstLevel >= 50) {
			needsSomething = true;
			status += name + " is thirsty! ";
		}
		if ((activityLevel < 33) || needsToPee || needsToPoop) {
			needsSomething = true;
			status += name + " needs a walk, please. ";
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

	void giveFood() {

		hungerLevel= 0;
		needsToPoop = true;
		
	}

	void giveWater() {

		thirstLevel = 0;
		needsToPee = true;

	}

	void goForWalk() {

		activityLevel = 75; 
		needsToPee = false;
		needsToPoop = false;

	}

}
