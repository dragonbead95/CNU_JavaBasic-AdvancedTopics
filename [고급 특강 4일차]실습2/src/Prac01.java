
public class Prac01 implements Runnable{

	public Prac01() {
		// Runnable �������̽��� ���� ��ü�� �����ؼ� hi�� ���´�. ���ٽĶ����� new Runnable()�� �����ȴ�.
//		Thread thread = new Thread(()-> System.out.println("Hi!"));
//		Thread thread = new Thread();
//		thread.start();	
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}
	
}
