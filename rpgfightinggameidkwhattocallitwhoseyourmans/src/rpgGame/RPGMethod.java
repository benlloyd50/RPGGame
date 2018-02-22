package rpgGame;

public class RPGMethod
{
	//Establish variables here
	private double c;
	
	
	
	public RPGMethod()
	{
		
	}
	
	/**
	 * In the future I might clean up the game class and add menus to this
	 * However, I would need to take into consideration the possibility of
	 * certain things like a health check not syncing up and how many vars
	 * I would have to bring over. Overall, for now I will flood the tester
	 * because am lazy.
	 */
	
	
	public void clearspace()
	{
		System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	}
	
	public void pause(int sec)
	{
		try {
		    Thread.sleep(sec);                 //Pauses program for "sec" millisecond long
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
	}
	
	
	
	
	
	
}
