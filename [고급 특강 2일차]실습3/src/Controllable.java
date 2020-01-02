
public interface Controllable {
	
	
	default void repair() {
		System.out.println("서비스 센터에서 수리해야 한다.");
	}
	public static void reset() {
		System.out.println("내가 초기화 할 수 있다.");
	}
	
	public void power(boolean onOff);

}
