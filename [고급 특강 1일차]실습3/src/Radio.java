
public class Radio extends Controller{

	public Radio(boolean power)
	{
		this.power = power;
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		if(this.power==true)
		{
			System.out.println(getName() + "�� �������ϴ�.");
		}else {
			System.out.println(getName() + "�� �������ϴ�.");
		}
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "����";
	}
	
}
