
public class AdJava04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread1 = new Thread(new Assign01Main());
		Thread thread2 = new Thread(new Assign01Worker());
		thread1.start();
		thread2.start();
	}

}
