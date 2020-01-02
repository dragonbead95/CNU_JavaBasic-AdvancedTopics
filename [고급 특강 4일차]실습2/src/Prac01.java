
public class Prac01 implements Runnable{

	public Prac01() {
		// Runnable 인터페이스의 무명 객체로 생성해서 hi가 나온다. 람다식때문에 new Runnable()이 생략된다.
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
