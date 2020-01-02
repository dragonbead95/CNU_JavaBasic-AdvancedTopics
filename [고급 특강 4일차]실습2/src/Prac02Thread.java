
public class Prac02Thread extends Thread{
	public Prac02Thread() {
		System.out.println("Prac02Thread-");
	}
	public void run()
	{
		System.out.println("run1-");
	}
	
	public void run(String s)
	{
		System.out.println("run2-");
	}
}
