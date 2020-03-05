package _11_own_adventure;

import java.util.Random;

import javax.swing.JOptionPane;

public class OwnAdventure {

	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int petHappiness = 0;
		//for jelly bean cat
		String color = "none";
		Random ran = new Random ();
		int random = ran.nextInt(5);
		
		if (random == 0) {
		color = "Juicy pear";
		}else if (random == 1) {
			color = "Coconut";
		}else if (random == 2) {
				color = "Tooty Fruity";
		}else if (random == 3) {
					color = "Chocolate";
		}else if (random == 4) {
					color = "Licorice";
					}
			
	
		
		JOptionPane.showMessageDialog(null, "-Cake Castle-");
		JOptionPane.showMessageDialog(null, "Hello young adventurer!");
		String name = JOptionPane.showInputDialog("What is your name?");
		int pet = JOptionPane.showOptionDialog(null, "Choose a companion! " , "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Caramel Dragon", "Chocolate bunny", "Jelly bean cat","Gummy bear" }, null);

		if (pet == 0) {
		//caramel dragon
		JOptionPane.showMessageDialog(null,"You chose a caramel dragon as your companion.");
		
		}else if (pet == 1) {
				//chocolate bunny
				JOptionPane.showMessageDialog(null, "You chose a chocolate bunny as your companion.");
				
				
				}else if (pet == 2) {
					//jelly bean cat
					JOptionPane.showMessageDialog(null, "You chose a " + color + " jelly bean cat as your companion.");
					
					
					}else if (pet == 3) {
						//gummy bear
						JOptionPane.showMessageDialog(null, "You chose a gummy bear as your companion.");
						
						
						}

	String petname = JOptionPane.showInputDialog("What would you like to name your pet?");
	JOptionPane.showMessageDialog(null, "You venture into the woods with " + petname + ".");
	
	String path = JOptionPane.showInputDialog(null, "There is a path. Do you follow it? (type yes or no)");
		
	if (path.equals("yes")) {
	JOptionPane.showMessageDialog(null, "You follow the path to a small village just as it starts to get dark.");
	}else if (path.equals("no")) {
	JOptionPane.showMessageDialog(null, "You quickly get lost.");
	String bear = JOptionPane.showInputDialog("A giant Gummy bear suddenly appears, towering over you. Do you fight or run? (type fight or run)");
	
	if (bear.equals("fight")) {
	String spell = JOptionPane.showInputDialog("You quickly pull out your wand to fight the bear. What spell do you summon? (1 for Defense spell, 2 for attack spell");
	if (spell.equals("1")) {
	JOptionPane.showMessageDialog(null, "You summon a strong defense spell protecting you and " + petname + ".");
	}else {
	JOptionPane.showMessageDialog(null, "You launch a attack spell at the bear.");	
	JOptionPane.showMessageDialog(null, "You killed the Gummy bear!");
	JOptionPane.showMessageDialog(null, "You dont want to leave the bear here, so you and "+ petname + " head home to sell the catch.");
	}
	}else {
	JOptionPane.showMessageDialog(null, "You run away quickly and realize you are lost agian.");
	JOptionPane.showMessageDialog(null, "Ending 1 of ");
	}
	
	
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
