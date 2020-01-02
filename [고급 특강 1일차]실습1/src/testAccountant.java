import java.util.Scanner;

public class testAccountant {
	
	Accountant account = new Accountant();
	Customer c;
	Scanner sc = new Scanner(System.in);
	private int number;
	private String name;
	private int totalSalary;
	private int totalSavings;
	private String tel;
	
	public void run()
	{
		while(true)
		{
			System.out.println("1. �� ���� ����");
			System.out.println("2. �� ���� ����");
			System.out.println("3. �� ���� Ž��");
			System.out.println("4. �� ���� ��ü ���");
			System.out.println("5. ���� ���");
			System.out.println("6. ����");
			
			number = sc.nextInt();
			
			
			if(number==1)
			{
				System.out.println("�̸��� �Է����ּ��� : ");
				name = sc.next();
				
				System.out.println("�� �޿��� �Է����ּ��� : ");
				totalSalary = sc.nextInt();
				
				System.out.println("�� ����ݾ��� �Է����ּ��� : ");
				totalSavings = sc.nextInt();
				
				System.out.println("����ó(�̸���)�� �Է����ּ��� : ");
				tel = sc.next();
				
				boolean result = account.addCustomer(name, totalSalary, totalSavings, tel);
				if(result==true)
				{
					System.out.println("���� ����");
				}else {
					System.out.println("���� ����");
				}
			}else if(number==2)
			{
				System.out.println("������ �̸��� �Է����ּ��� : ");
				name = sc.next();
				
				boolean result = account.delCustomer(name);
				if(result==true)
				{
					System.out.println("���� ����");
				}else {
					System.out.println("���� ����");
				}
			}else if(number==3)
			{
				System.out.println("Ž���� �̸��� �Է����ּ��� : ");
				name = sc.next();
				c = account.findCustomer(name);
				
				if(c==null)
				{
					System.out.println("�ش��ϴ� ���� �����ϴ�.");
					continue;
				}
				
				System.out.println(c);
			}else if(number==4)
			{
				System.out.println(account);
			}
			else if(number==5)
			{
				System.out.println("�̸��� �Է����ּ��� : ");
				name = sc.next();
				
				c = account.findCustomer(name);
				System.out.println(name + "���� ������ " + account.taxCalculator(c) + "���� �Դϴ�.");
			}else if(number==6)
			{
				System.exit(1);
			}
			
		}
	}
}
