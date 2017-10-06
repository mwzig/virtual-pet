import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		VirtualPet myPet = new VirtualPet("Lucy the Therapy Dog", 25, 3, 3);
		Scanner input = new Scanner(System.in);

		String userAction = "1";
		do {
			System.out.println("********************************");
			System.out.println(myPet.getName());
			System.out.println("Hunger Level: " + myPet.getHungerLevel()  
			 + "  Thirst Level: " + myPet.getThirstLevel()
			 + "  Activity Level: " + myPet.getActivityLevel());
			System.out.println(myPet.getStatus());
			System.out.println("********************************");
			System.out.println("\nPress 1 to feed Lucy");
			System.out.println("Press 2 to give Lucy water");
			System.out.println("Press 3 to take Lucy for a walk");
			System.out.println("Press 4 to do nothing");
			System.out.println("Press 5 to quit");

			userAction = input.nextLine();
			int cupsKibble = 0;
			int cupsWater = 0;
			int milesToWalk = 0;

			switch (userAction) {
				case "1":
					System.out.println("Enter how many cups of kibble you would like to give Lucy? (1, 2, 3...)");
					cupsKibble = input.nextInt();
					input.nextLine();
					myPet.giveFood(cupsKibble);
					System.out.println("Thank you for feeding " + myPet.getName() + ".");
					break;
				case "2":
					System.out.println("Enter how many cups of water you would like to give Lucy (1, 2, 3...)");
					cupsWater = input.nextInt();
					input.nextLine();
					myPet.giveWater(cupsWater);
					System.out.println("Thank you for giving " + myPet.getName() + "water.");
					break;
				case "3":
					System.out.println("Enter how many miles you would like to walk Lucy (1, 2, 3...)");
					milesToWalk = input.nextInt();
					input.nextLine();
					myPet.goForWalk(milesToWalk);
					System.out.println("Thank you for walking " + myPet.getName() + ".");
					break;
				case "4":
					break;
				case "5":
					break;
				
			}
			// need to call a pass the time method here 
			//myPet.tick();
			if (userAction.equals("5")) {
				System.out.println("Thanks for playing!");
				
			}
			else {
				System.out.println("\nWhat else would you like to do?");
			}
			
		} while (!userAction.equals("5"));

	}

}
