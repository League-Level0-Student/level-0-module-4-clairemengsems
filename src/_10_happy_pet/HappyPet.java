package _10_happy_pet;
import java.util.Random;

import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	
	public static void main(String[] args) {
		String color = "none";
		Random ran = new Random ();
		int random = ran.nextInt(5);
		
		if (random == 0) {
		color = "black";
		}else if (random == 1) {
			color = "white";
		}else if (random == 2) {
				color = "tan";
		}else if (random == 3) {
					color = "brown";
		}else if (random == 4) {
					color = "spotted";
					}
			
			
		int happinessLevel = 0;
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		JOptionPane.showMessageDialog(null, "Hello! Welcome to Coco's pet cafe.");
		JOptionPane.showMessageDialog(null, "Here we serve drinks and have adoptable animals.");
		String petType = JOptionPane.showInputDialog("What pet would you like to adopt? (cat, dog, bird, mouse)");
		
		if (petType.equals("cat")) {
		JOptionPane.showMessageDialog(null, "Meow! You adopted a "+ color + " cat.");
		}else if (petType.equals("dog")) {
			JOptionPane.showMessageDialog(null, "Woof! You adopted a "+ color + " dog.");
			}else if (petType.equals("bird")) {
				JOptionPane.showMessageDialog(null, "Squack! You adopted a "+ color + " bird.");
			}else if (petType.equals("mouse")) {
				JOptionPane.showMessageDialog(null, "Squeak! You adopted a "+ color + " mouse.");
			}else {
				JOptionPane.showMessageDialog(null, "Sorry, we don't have that here.");
				System.exit(0);
			}
		
		String petName = JOptionPane.showInputDialog("What would you like to name your "+ petType + "?");
		JOptionPane.showMessageDialog(null, "We hope you take good care of " + petName + "!");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
		JOptionPane.showMessageDialog(null, "Make sure to keep "+ petName + " happy!");		
while (happinessLevel < 100) {
	
	

		
		
			int task = JOptionPane.showOptionDialog(null, "What would you like to do with " + petName + "?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Play", "Feed", "Groom","Give Treat" }, null);
if (task == 0) {
	// play
happinessLevel = happinessLevel + 15;	
JOptionPane.showMessageDialog(null, petName + " seemed to like that!");
JOptionPane.showMessageDialog(null, petName + "'s Happiness Level: " + happinessLevel);
}else if (task == 1) {
	//feed
	happinessLevel = happinessLevel + 10;	
	JOptionPane.showMessageDialog(null, petName + " rushed to the food bowl.");
	JOptionPane.showMessageDialog(null, petName + "'s Happiness Level: " + happinessLevel);
	}else if (task == 2) {
		//groom
		if (petType.equals("cat")) {
		happinessLevel = happinessLevel - 10;	
		JOptionPane.showMessageDialog(null, petName + " didn't really like that.");
		}else {
			happinessLevel = happinessLevel + 15;	
			JOptionPane.showMessageDialog(null, petName + " liked being groomed.");	
		}
		JOptionPane.showMessageDialog(null, petName + "'s Happiness Level: " + happinessLevel);
		}else if (task == 3) {
			//give treat
			happinessLevel = happinessLevel + 10;	
			JOptionPane.showMessageDialog(null, petName + " seemed very excited to eat the treat!");
			JOptionPane.showMessageDialog(null, petName + "'s Happiness Level: " + happinessLevel);
			}
			// 5. Use user input to call the appropriate method created in step 4.

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}
if (happinessLevel >= 100) {
JOptionPane.showMessageDialog(null, "Good job on taking care of " + petName + "!");
}


	}
	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
}