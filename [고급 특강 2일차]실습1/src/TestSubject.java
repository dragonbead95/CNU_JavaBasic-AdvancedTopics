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
			System.out.println("1. 학생 정보 입력");
			System.out.println("2. 최고점수 학생 보기");
			System.out.println("3. 학생 성적 보기");
			
			number = sc.nextInt();
			
			if(number==1)
			{
				System.out.print("이름을 입력해주세요 ");
				name = sc.next();
				System.out.print("점수를 입력해주세요 ");
				score = sc.nextInt();
				
				englishSubject.inputStudent(name, score);
			}else if(number==2)
			{
				Student<Integer> std = englishSubject.maxScoreStudent();
				System.out.println("최고 점수 학생");
				System.out.println("이름 : " + std.getterName() + "\n점수 : " + std.getterScore());
			}else if(number==3)
			{
				System.out.print("이름을 입력해주세요 ");
				name = sc.next();
				Student<Comparable>std = null;
				
				try {
					std = englishSubject.findScore(name);
				}catch(NullPointerException n)
				{
					System.out.println("null 값이 반환되었습니다.");
					continue;
				}
				
				System.out.println("이름 : " + name + "\n점수 : " + std.getterScore());
			}
		}
	}
}
