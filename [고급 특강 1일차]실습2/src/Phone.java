
public class Phone {
	protected String owner;
	
	public Phone(String owner)
	{
		this.owner = owner;
	}
	
	public void talk()
	{
		System.out.println(owner + "�� ��ȭ���̴�.");
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
