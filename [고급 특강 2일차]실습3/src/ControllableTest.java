
public class ControllableTest {
	public void run()
	{
		Controllable tv = new TV("A는");
		tv.power(true);
		tv.power(false);
		tv.repair();
		Controllable.reset();
		System.out.println();
		
		String who = "B는";
		Controllable2 tv2 = (String TV,boolean onOff) ->{
			String verb = onOff==true ? "켠다." : "끈다.";
			System.out.println(who + " " + TV + "전원을"+verb);
		};
		
		tv2.power("TV", true);
		tv2.power("TV", false);
		tv2.repair();
		Controllable2.reset();		
	}
}