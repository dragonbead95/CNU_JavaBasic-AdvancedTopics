
@FunctionalInterface
public interface Controllable2 {
	public void power(String TV, boolean onOff);
	
	default void repair() {
		System.out.println("���� ���Ϳ��� �����ؾ� �Ѵ�.");
	}
	
	static void reset()
	{
		System.out.println("���� �ʱ�ȭ �� �� �ִ�.");
	}
}
