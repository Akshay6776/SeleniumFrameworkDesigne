package Inheritance;

public class GovernmentEnggCollage extends VTU{
	
	@Override
	public void uniform() 
	{
		System.out.println("uniform -- GovernmentEnggCollage");
	}
	
	public void civilEngg() 
	{
		System.out.println("civilEngg -- GovernmentEnggCollage");
	}
	
	public void MechEngg() 
	{
		System.out.println("MechEngg -- GovernmentEnggCollage");
	}
	@Override
	public void rules() 
	{
		System.out.println("rules -- GovernmentEnggCollage");
	}

}
