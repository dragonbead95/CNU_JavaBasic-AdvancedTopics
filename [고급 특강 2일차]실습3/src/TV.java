
public class TV implements Controllable{
	String who;
	
	public TV(String who)
	{
		this.who = who;
	}

	@Override
	public void power(boolean onOff) {
		// TODO Auto-generated method stub
		String verb = onOff == true ? "�Ҵ�." : "����.";
		System.out.println(who + " TV ������ " + verb);
	}
}
