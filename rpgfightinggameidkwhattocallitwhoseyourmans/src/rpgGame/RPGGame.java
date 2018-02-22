package rpgGame;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RPGGame 
{
	public static void main(String[] straightbeans)
	{
		//Establish variables here
		//General Variables
		Scanner in = new Scanner(System.in);
		RPGMethod met = new RPGMethod(); //To use any methods, helps clean up the Game Class, menus are stored in there
		boolean fighting = true;
		Random rand = new Random(); //This is superior to math.random
		int choice; //Used to make choices
		//String name; might add names in the future...
		
		//Player Variables
		double playerAttack = 5;
		double playerHealth = 20;
		double playerPotion = 1;
		double potregen = 50; //Percent of how much health one potion will give you
		
		//Enemy Variables
		double monHealth;
		double monName;
		double monAttack;
		double monArmor = 1;
		
		//Location/Monster Variables/Arrays
		ArrayList<monster> myPool = new ArrayList<monster>();
		//Might need a loot array...
		
		
		/*
		 * So the plan for this array is that depending on what location you are will determine
		 * what monsters you encounter and how strong they will be. This should include adding
		 * new prefixes to monsters and limiting what monsters you should see from the entire
		 * monster pool and how strong the monsters will be.
		 * 
		 * On that note, it might make sense to make the array list have all monsters but 
		 * depending on location will only pick from a select few. 
		 * 
		 * 
		 * Note to self
		 * Add play menu to pick between traverse and view loot.
		 * Traverse gives random chance to fight or find new locations.
		 * Viewing Loot lets you view your currently found loot.
		*/
		
		
		//Create Monster Pool in separate class.
		monsterPool pool = new monsterPool();
		myPool = pool.createPool();
		
		
		
		System.out.print("Welcome to Loot Dungeon");
		System.out.print("\nLoading Loot Now...");
		met.pause(3000);
		met.clearspace();
		
		System.out.print("Glad you want to play this lil game, it's stil a WIP but, enjoy...");
		met.pause(2000);
		met.clearspace();
		
		//This will be a test fight to try getting a monster from the pool
		
		//Let the slashing and looting begin.
		FIGHT:
		while(fighting)
		{
			int monInfo = rand.nextInt(myPool.size());												//Picks the monster from the pool
			System.out.print(" @ You encounter a " + myPool.get(monInfo).getMonName() + "! @");
			monHealth = myPool.get(monInfo).getMonHealth();
			monAttack = myPool.get(monInfo).getMonAttack();
			monArmor = myPool.get(monInfo).getMonArmor();
			
			while(myPool.get(monInfo).getMonHealth() >= 0)
			{
				System.out.print("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
								+"\nYour HP:" + playerHealth + " ||| " + myPool.get(monInfo).getMonName() + " HP: " + monHealth
								+ "\nWhat would you like to do?"
								+ "\n 1.) Attack"
								+ "\n 2.) Drink Health Potion"
								+ "\n 3.) Flee"
								+ "\n ===> ");
				choice = in.nextInt();
				
				//Fighting Option
				if(choice == 1)
				{
					int damageDealt = ((int)(rand.nextInt((int)playerAttack)));
					int damageTaken = ((int)(rand.nextInt((int)monAttack)));
					
					monHealth -= damageDealt;
					playerHealth -= damageTaken;
					
					System.out.println("\n> You strike the " + myPool.get(monInfo).getMonName() + " for " + damageDealt + " damage");
					System.out.println("\n> You recieved " + damageTaken + " in retaliation");
					
					if(playerHealth <= 0)
					{
						System.out.print("Oh dear, you are dead");
						break;
						//Question is, is it perma-death or just go back to traversing area with full health
						//Seems too easy if there aren't really repercussions to death...
					}
				}
				//Drink Health Potion Option
				else if(choice == 2)
				{
					
				}
				//Run-Away Option
				else if(choice == 3)
				{
					
				}
				//Fail-Safe Option
				else
				{
					System.out.print("Invalid command. Deleting all files...");
					met.pause(1500);
					System.out.print("jk ;)");
				}
				
				
			}
			
			
			
		}
		
		
	}
}
