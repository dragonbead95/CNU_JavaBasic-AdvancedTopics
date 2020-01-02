
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
			System.out.println(getName() + "가 켜졌습니다.");
		}else {
			System.out.println(getName() + "가 꺼졌습니다.");
		}
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "라디오";
	}
	
}
