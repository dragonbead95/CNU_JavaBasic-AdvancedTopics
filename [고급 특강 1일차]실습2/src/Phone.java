
public class Phone {
	protected String owner;
	
	public Phone(String owner)
	{
		this.owner = owner;
	}
	
	public void talk()
	{
		System.out.println(owner + "은 통화중이다.");
	}
	
	public String get()
	{
		return owner;
	}
	
	public void set(String owner)
	{
		this.owner = owner; 
	}
	
}
