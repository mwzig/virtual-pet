import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		VirtualPet myPet = new VirtualPet();
		Scanner input = new Scanner(System.in);

		String userAction = "1";
		do {
			System.out.println("********************************");
			System.out.println(myPet.getName());
			System.out.println("Hunger Level: " + myPet.getHungerLevel());
			System.out.println("Thirst Level: " + myPet.getThirstLevel());
			System.out.println("Tiredness Level: " + myPet.getTiredLevel());
			System.out.println("\nPress 1 to feed Lucy");
			System.out.println("Press 2 to give Lucy water");
			System.out.println("Press 3 to take Lucy for a walk");
			System.out.println("Press 4 to quit");

			userAction = input.nextLine();
			int cupsKibble = 0;
			int cupsWater = 0;
			int milesToWalk = 0;

			switch (userAction) {
				case "1":
					System.out.println("Enter how many cups of kibble you would like to give Lucy? (1, 2, 3...");
					cupsKibble = input.nextInt();
					break;
				case "2":
					System.out.println("Enter how many cups of water you would like to give Lucy (1, 2, 3...)");
					cupsWater = input.nextInt();
					break;
				case "3":
					System.out.println("Enter how many miles you would like to walk Lucy (1, 2, 3...)");
					milesToWalk = input.nextInt();
					break;
				case "4":
					break;
			}
			// need to call a pass the time method here 
			myPet.passTheTime();
			System.out.println("\n");
		} while (!userAction.equals("4"));

	}

}
