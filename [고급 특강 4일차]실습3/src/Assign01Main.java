
public class Assign01Main extends Thread{
	private int alphabet = 'a';
	public void run()
	{
		while(alphabet<='z')
		{
			try {
				Thread.sleep(1);
				System.out.println("Main : " + alphabet);
				alphabet++;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
