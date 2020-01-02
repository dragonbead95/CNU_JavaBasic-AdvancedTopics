
public class Assign01Worker extends Thread{
	public void run()
	{
		for(int i=0;i<5;i++)
		{	
			try {
				System.out.println("Worker : " + i);
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
