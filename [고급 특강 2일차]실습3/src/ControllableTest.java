
public class ControllableTest {
	public void run()
	{
		Controllable tv = new TV("A��");
		tv.power(true);
		tv.power(false);
		tv.repair();
		Controllable.reset();
		System.out.println();
		
		String who = "B��";
		Controllable2 tv2 = (String TV,boolean onOff) ->{
			String verb = onOff==true ? "�Ҵ�." : "����.";
			System.out.println(who + " " + TV + "������"+verb);
		};
		
		tv2.power("TV", true);
		tv2.power("TV", false);
		tv2.repair();
		Controllable2.reset();		
	}
}