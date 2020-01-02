
public class TelePhone extends Phone{
	private String when;
	
	public TelePhone(String owner,String when)
	{
		super(owner);
		this.when = when;
	}
	
	public TelePhone(String owner)
	{
		super(owner);
	}
	
	public void autoAnswering()
	{
		System.out.println(super.owner + "은 부재중이다. " + when + "전화를 바란다.");
	}
	
	public String get()
	{
		return when;
	}
	
	public void set(String when)
	{
		this.when = when; 
	}
}
