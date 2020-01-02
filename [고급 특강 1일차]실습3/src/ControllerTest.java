
public class ControllerTest {
	public void run()
	{
		Controller[] c = {new TV(false), new Radio(true)};
		
		for(Controller controller : c)
		{
			controller.show();
		}
	}
}
