
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
		System.out.println(super.owner + "�� �������̴�. " + when + "��ȭ�� �ٶ���.");
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
