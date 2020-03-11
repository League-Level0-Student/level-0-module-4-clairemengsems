package _11_own_adventure;

import java.util.Random;

import javax.swing.JOptionPane;

public class OwnAdventure {

	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money = 100;
		
		if (money < 0) {
		money = 0;
		}
		
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
			money = money - 60;
		JOptionPane.showMessageDialog(null,"You chose a caramel dragon as your companion.");
		
		}else if (pet == 1) {
				//chocolate bunny
			money = money - 30;
				JOptionPane.showMessageDialog(null, "You chose a chocolate bunny as your companion.");
				
				
				}else if (pet == 2) {
					//jelly bean cat
					money = money - 10;
					JOptionPane.showMessageDialog(null, "You chose a " + color + " jelly bean cat as your companion.");
					
					
					}else if (pet == 3) {
						//gummy bear
						money = money - 40;
						JOptionPane.showMessageDialog(null, "You chose a gummy bear as your companion.");
						
						
						}
	JOptionPane.showMessageDialog(null, "You have " + money + " dollars.");
	String petname = JOptionPane.showInputDialog("What would you like to name your pet?");
	JOptionPane.showMessageDialog(null, "You venture into the woods with " + petname + ".");
	
	String path = JOptionPane.showInputDialog(null, "There is a path. Do you follow it? (type yes or no)");
	//yes path	
	if (path.equals("yes")) {
	JOptionPane.showMessageDialog(null, "You follow the path for a while, but it dissapears.");
	//ending 7 (no path..)
	JOptionPane.showMessageDialog(null, "Ending 7 of 7");	
		
	//no path
	}else if (path.equals("no")) {
	JOptionPane.showMessageDialog(null, "You quickly get lost.");
	//gummy bear
	String bear = JOptionPane.showInputDialog("A giant Gummy bear suddenly appears, towering over you. Do you fight or run? (type fight or run)");
	
	//fight
	if (bear.equals("fight")) {
	String spell = JOptionPane.showInputDialog("You quickly pull out your wand to fight the bear. What spell do you summon? (1 for Defense spell, 2 for attack spell");
	if (spell.equals("1")) {
	JOptionPane.showMessageDialog(null, "You summon a strong defense spell protecting you and " + petname + ".");
	JOptionPane.showMessageDialog(null, "After realizing he can't get to you, the gummy bear walks away.");
	petHappiness = petHappiness + 20;
	JOptionPane.showMessageDialog(null, "You keep walking.");
	//jelly bean cat
	JOptionPane.showMessageDialog(null, "You notice a tiny marshmellow jelly bean cat next to a berry bush.");
	String cat = JOptionPane.showInputDialog("What do you do? (1-Ignore it and keep walking or 2-ITS MINE)");
	//ignore the jelly bean cat :'( 
	if (cat.equals(1)) {
	JOptionPane.showMessageDialog(null, "You ignore the cat and keep on walking.");	
	
	//hot chocolate river
	JOptionPane.showMessageDialog(null, "You find yourself at a hot chocolate river.");
	JOptionPane.showMessageDialog(null, "It is very hot, but there are some chocolate rocks that you can hop across.");
	String river = JOptionPane.showInputDialog("Do you cross the river? (type yes or no)");
	
	//crossing river
	if (river.equals("yes")) {
	JOptionPane.showMessageDialog(null, "You hold " + petname + " and hop across the river quickly." );	
	JOptionPane.showMessageDialog(null, "You safely make it to the mint grass on the other side of the river.");
	
	//night
	JOptionPane.showMessageDialog(null, "It is now dark.");
	String tent = JOptionPane.showInputDialog("Do you set up camp? ( type yes or no)");
	
	//setting up camp
	if (tent.equals("yes")) {
	JOptionPane.showMessageDialog(null, "You set up camp with " + petname + ".");	
	JOptionPane.showMessageDialog(null, "You see " + petname + " come back with some fruit snacks from a berry bush." );
	JOptionPane.showMessageDialog(null, "You and "+ petname + " cook the fruit snacks as well as some canned twizzlers over the campfire.");
	JOptionPane.showMessageDialog(null, "Then you sleep until the next morning.");
	JOptionPane.showMessageDialog(null, "Camping is so fun that you and " + petname + " decide to be explorers and not search for cake castle.");
	//ending 5 (becoming explorers)
	JOptionPane.showMessageDialog(null, "Ending 5 of 7");	
	

	//not setting up camp
	}else {
	JOptionPane.showMessageDialog(null, "You keep walking in the dark.");
	JOptionPane.showMessageDialog(null, "You cant see and fall into a deep ditch.");	
	JOptionPane.showMessageDialog(null, "You're trapped!");
	//ending 2 (trapped in ditch in the dark)
	JOptionPane.showMessageDialog(null, "Ending 2 of 7");	
	}
		
	//not crossing river	
	}else {
	JOptionPane.showMessageDialog(null, "You back away from the river, but fall backwards into a deep ditch.");	
	JOptionPane.showMessageDialog(null, "You're trapped!");
	//ending 3 (trapped in ditch)
	JOptionPane.showMessageDialog(null, "Ending 3 of 7");	
	}
	
	//adopt the jelly bean cat!	
	}else {
	JOptionPane.showMessageDialog(null, "You pick up the jelly bean cat.");
	JOptionPane.showMessageDialog(null, petname + " likes the jelly bean cat!");
	if (pet == 2) {
	petHappiness= petHappiness + 40;	
	}else {
	petHappiness = petHappiness + 20;
	}
	String petname2 = JOptionPane.showInputDialog("What would you like to name the marshmello jelly bean cat?");
	JOptionPane.showMessageDialog(null,petname + " and " + petname2 + " get along very well together!");
	if ( pet == 2) {
	JOptionPane.showMessageDialog(null, "You keep walking with " + petname + " and " + petname2 + " in your pockets.");
	}else {
	JOptionPane.showMessageDialog(null, "You keep walking with " + petname + " walking next to you and " + petname2 + " in your pocket.");	
	}
	JOptionPane.showMessageDialog(null, "Suddenly, you catch a glimpse of cake through the thick peppermint trees. ");
	JOptionPane.showMessageDialog(null, "You made it to cake castle!");
	// ending 4 (cake castle)
	JOptionPane.showMessageDialog(null, "Ending 4 of 7");
	
	}
	}else {
	JOptionPane.showMessageDialog(null, "You launch a attack spell at the bear.");	
	JOptionPane.showMessageDialog(null, "You killed the Gummy bear!");
	JOptionPane.showMessageDialog(null, "You dont want to leave the bear here, so you and "+ petname + " head home to sell the catch.");
	money = money + 40;
	JOptionPane.showMessageDialog(null, "You now have " + money + " dollars!");
	JOptionPane.showMessageDialog(null, "realizing you can make a lot of money from selling your kills, you and " + petname + " become merchants!");
	//ending 6 (becoming merchants)
	JOptionPane.showMessageDialog(null, "Ending 6 of 7");
	}
	//run
	}else {
	JOptionPane.showMessageDialog(null, "You run away quickly and realize you are lost agian.");
	//ending 1 (lost)
	JOptionPane.showMessageDialog(null, "Ending 1 of 7");
	}
	
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
