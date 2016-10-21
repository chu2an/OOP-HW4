package fcu.iecs.oop;

public class psyduck
{
	private String name;
	public float weight;
	public float height;
	public int hp;
	/*public int powerup()
	{
		System.out.println("power up");
		hp=hp+100;
		return hp;
	}
	public void evolve()
	{
		System.out.println("evolve");
		weight=weight+5;
		height=height+10;
	}*/
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
}
