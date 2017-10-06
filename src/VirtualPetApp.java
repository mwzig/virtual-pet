import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		
		VirtualPet myPet = new VirtualPet();
		Scanner input = new Scanner(System.in);
		
		
		String userAction = "1";
		do { 
			System.out.println(myPet.getName());
			System.out.println("Hunger Level: " + myPet.getHungerLevel());
			System.out.println("Thirst Level: " + myPet.getThirstLevel());
			System.out.println("Tiredness Level: " + myPet.getTiredLevel());
			System.out.println("\nPress 1 to feed Lucy");
			System.out.println("Press 2 to give Lucy water");
			System.out.println("Press 3 to take Lucy for a walk");
			System.out.println("Press 4 to quit");
			
			userAction = input.nextLine();
			
			
		}
		while (!userAction.equals("4"));
				
			
	}

}
