
public interface Controllable {
	
	
	default void repair() {
		System.out.println("���� ���Ϳ��� �����ؾ� �Ѵ�.");
	}
	public static void reset() {
		System.out.println("���� �ʱ�ȭ �� �� �ִ�.");
	}
	
	public void power(boolean onOff);

}
