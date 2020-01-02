import java.util.Scanner;

public class TestSubject {
	private Scanner sc = new Scanner(System.in);
	private Subject<Student> englishSubject = new Subject();
	private int number;
	private String name;
	private int score;
	
	public void run()
	{
		
		while(true)
		{
			System.out.println("1. �л� ���� �Է�");
			System.out.println("2. �ְ����� �л� ����");
			System.out.println("3. �л� ���� ����");
			
			number = sc.nextInt();
			
			if(number==1)
			{
				System.out.print("�̸��� �Է����ּ��� ");
				name = sc.next();
				System.out.print("������ �Է����ּ��� ");
				score = sc.nextInt();
				
				englishSubject.inputStudent(name, score);
			}else if(number==2)
			{
				Student<Integer> std = englishSubject.maxScoreStudent();
				System.out.println("�ְ� ���� �л�");
				System.out.println("�̸� : " + std.getterName() + "\n���� : " + std.getterScore());
			}else if(number==3)
			{
				System.out.print("�̸��� �Է����ּ��� ");
				name = sc.next();
				Student<Comparable>std = null;
				
				try {
					std = englishSubject.findScore(name);
				}catch(NullPointerException n)
				{
					System.out.println("null ���� ��ȯ�Ǿ����ϴ�.");
					continue;
				}
				
				System.out.println("�̸� : " + name + "\n���� : " + std.getterScore());
			}
		}
	}
}
