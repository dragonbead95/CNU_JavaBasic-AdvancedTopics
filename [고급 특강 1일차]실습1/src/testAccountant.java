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
			System.out.println("1. 고객 정보 삽입");
			System.out.println("2. 고객 정보 삭제");
			System.out.println("3. 고객 정보 탐색");
			System.out.println("4. 고객 정보 전체 출력");
			System.out.println("5. 세금 계산");
			System.out.println("6. 종료");
			
			number = sc.nextInt();
			
			
			if(number==1)
			{
				System.out.println("이름을 입력해주세요 : ");
				name = sc.next();
				
				System.out.println("총 급여를 입력해주세요 : ");
				totalSalary = sc.nextInt();
				
				System.out.println("총 저축금액을 입력해주세요 : ");
				totalSavings = sc.nextInt();
				
				System.out.println("연락처(이메일)을 입력해주세요 : ");
				tel = sc.next();
				
				boolean result = account.addCustomer(name, totalSalary, totalSavings, tel);
				if(result==true)
				{
					System.out.println("삽입 성공");
				}else {
					System.out.println("삽입 실패");
				}
			}else if(number==2)
			{
				System.out.println("삭제할 이름을 입력해주세요 : ");
				name = sc.next();
				
				boolean result = account.delCustomer(name);
				if(result==true)
				{
					System.out.println("삭제 성공");
				}else {
					System.out.println("삭제 실패");
				}
			}else if(number==3)
			{
				System.out.println("탐색할 이름을 입력해주세요 : ");
				name = sc.next();
				c = account.findCustomer(name);
				
				if(c==null)
				{
					System.out.println("해당하는 고객이 없습니다.");
					continue;
				}
				
				System.out.println(c);
			}else if(number==4)
			{
				System.out.println(account);
			}
			else if(number==5)
			{
				System.out.println("이름을 입력해주세요 : ");
				name = sc.next();
				
				c = account.findCustomer(name);
				System.out.println(name + "님의 세금은 " + account.taxCalculator(c) + "만원 입니다.");
			}else if(number==6)
			{
				System.exit(1);
			}
			
		}
	}
}
