package rpgGame;

public class monster 
{
	
	private String monName = "";	//The monster's name, set to null for concatenation reasons.
	private double monHealth;		//Health of monster
	private double monAttack;		//Attack power of monster
	private double monArmor;		//Special Modifier for harder enemies and harder modes
	
	public monster(String monName, double monHealth, double monAttack, double monArmor)
	{
		this.monArmor = monArmor;
		this.monAttack = monAttack;
		this.monHealth = monHealth;
		this.monName = monName;
		//Might add something here for grabbing from location array to get special prefixes for monsters.
	}
	
	public monster(String monName, double monHealth, double monAttack)
	{
		this.monAttack = monAttack;
		this.monHealth = monHealth;
		this.monName = monName;
		//Might add something here for grabbing from location array to get special prefixes for monsters.
	}
	
	public String getMonName()
	{
		return monName;
	}
	
	public double getMonHealth()
	{
		return monHealth;
	}
	
	public double getMonAttack()
	{
		return monAttack;
	}
	
	public double getMonArmor()
	{
		return monArmor;			
	}
	
}