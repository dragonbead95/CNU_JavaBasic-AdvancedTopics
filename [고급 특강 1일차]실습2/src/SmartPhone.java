
public class SmartPhone extends TelePhone{
	private String game;
	
	public SmartPhone(String name, String game)
	{
		super(name);
		this.game = game;
	}
	
	public void playGame()
	{
		System.out.println(super.owner + "는 " + game + " 게임을 하는 중이다.");
	}
	
	public String get()
	{
		return game;
	}
	
	public void set(String game)
	{
		this.game = game; 
	}
	
	
}
