package main;

import java.util.Scanner;

public class InfiniteTerrainSystem {

	private static Scanner scan;

	public static void main(String[] args) {
		
		System.out.println("Welcome to The Infinite Terrain. You are surrounded by grey clouds and only have a compass "
						+ " to guide you to your treasure! ");
		System.out.println("Type the direction you want to go: 'north','south','west' or 'east'!");
		System.out.println("Bear in mind that there are pits in which you can fall into");
		System.out.println("Good luck adventurer! [Hint: The treasure is not that far out]");
		
		boolean badInput = true;

		int steps = 0;
		int stepCount = 0;
		int stepsToGoal = 12;
		

			while (stepCount < 12 & stepsToGoal != 0) {
				scan = new Scanner(System.in);
				System.out.println("Where would you like to go?");
				
				String direction = scan.nextLine();
				System.out.println("How many steps would you like to take?");
				do {
					try {
						steps = Integer.parseInt(scan.nextLine());
						badInput = false;
					} catch (Exception ex) {
						System.out.println("Those aren't steps. Please enter a correct number of steps!");
					}
				} while (badInput);
				System.out.println("You went " + steps + " steps to the " + (direction));
			
					if (steps > 12 ) {
					System.out.println("You went too far and fell into a pit. Try again");
					break;
			
					}else if(stepsToGoal == 0 & direction.equals("north")) {
					System.out.println("Congratulations!That was the right decision. You win!");
					break;
					
					}else if (steps <= 12 & direction.equals("north")){
					stepsToGoal= stepsToGoal-steps;
					System.out.println("The direction is good, but try " +stepsToGoal+ " steps more ");
	
					}else if (!direction.equals("north")) {
					System.out.println("You went to the wrong direction and got lost...");
					break;
					
					}else {
					System.out.println("You got lost.");
					break;
					}		
			}
	}
}

