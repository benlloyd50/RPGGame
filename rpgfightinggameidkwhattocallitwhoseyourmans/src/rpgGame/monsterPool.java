/**
 * This class creates all monsters for the pool of monsters you will encounter.
 * 
 * Also includes a short description of what said monster is.
 */
package rpgGame;

import java.util.ArrayList;

public class monsterPool 
{
	private ArrayList<monster> monsterPool = new ArrayList<monster>();
	
	
	public ArrayList<monster> createPool()
	{
		//Made out of 100% bone
		monster skeleton = new monster("Skeleton", 10, 3);
		monsterPool.add(skeleton);
		
		//Comes from swampy areas, its figure is indistinguishable
		monster murkfigure = new monster("Murkfigure", 15, 4);
		monsterPool.add(murkfigure);
		
		//It came from a farm, although he is rather aggressive, kind of a cock
		monster chicken = new monster("Chicken", 3, 1);
		monsterPool.add(chicken);
		
		//They say beauty is in the eye of the Beholder
		monster Beholder = new monster("The Beholder", 50, 3, 2);
		monsterPool.add(Beholder);
		
		
		//Many more to come....
		
		
		
		return monsterPool;
	}
}
