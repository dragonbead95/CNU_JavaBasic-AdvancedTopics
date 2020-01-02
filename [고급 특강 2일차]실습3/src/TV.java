
public class TV implements Controllable{
	String who;
	
	public TV(String who)
	{
		this.who = who;
	}

	@Override
	public void power(boolean onOff) {
		// TODO Auto-generated method stub
		String verb = onOff == true ? "ÄÒ´Ù." : "²ö´Ù.";
		System.out.println(who + " TV Àü¿øÀ» " + verb);
	}
}
