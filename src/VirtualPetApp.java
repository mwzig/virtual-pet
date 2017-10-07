import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		String name = "Lucy";
		String nameDescriptor = "the Therapy Dog";
		int hungerLevel = 5;
		int thirstLevel = 5;
		int activityLevel = 25;

		VirtualPet myPet = new VirtualPet(name, nameDescriptor, hungerLevel, thirstLevel, activityLevel);
		Scanner input = new Scanner(System.in);

		String userAction;
		do {
			System.out.println("**************************************************************************");
			System.out.println(myPet.getFullName());
			System.out.println("Hunger Level: " + myPet.getHungerLevel() + "  Thirst Level: " + myPet.getThirstLevel()
					+ "  Activity Level: " + myPet.getActivityLevel());
			System.out.println(myPet.getStatus());
			System.out.println("**************************************************************************");
			System.out.println("\nPress 1 to feed " + myPet.getName() + ".");
			System.out.println("Press 2 to give " + myPet.getName() + " water.");
			System.out.println("Press 3 to take " + myPet.getName() + " for a walk.");
			System.out.println("Press 4 to play ball with " + myPet.getName() + ".");
			System.out.println("Press 5 to do nothing.");
			System.out.println("Press 6 to quit.");

			userAction = input.nextLine();

			switch (userAction) {
			case "1":
				myPet.eat();
				System.out.println("Thank you for feeding " + myPet.getName() + ".");
				break;
			case "2":
				myPet.drink();
				System.out.println("Thank you for giving " + myPet.getName() + " water.");
				break;
			case "3":
				myPet.goForWalk();
				System.out.println("Thank you for walking " + myPet.getName() + ".");
				break;
			case "4":
				myPet.fetchBall();
				System.out.println("Thank you for playing ball with " + myPet.getName() + ".");
				break;
			case "5":
				break;

			}
			// need to call a pass the time method here
			myPet.tick();
			if (userAction.equals("6")) {
				System.out.println("Thanks for playing the VirtualPet game!");

			} else {
				System.out.println("\nWhat else would you like to do?");
			}

		} while (!userAction.equals("6"));

	}

}
