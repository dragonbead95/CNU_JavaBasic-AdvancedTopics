import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] std = new Student[2];
		Student	st = new Student();
		Scanner sc = new Scanner(System.in);
		String name;
		String score;
		
		// 입력
		for(int i=0;i<std.length;i++)
		{
			System.out.print("이름을 입력해주세요 : ");
			name = sc.next();
			System.out.print("점수를 입력해주세요 : ");
			score = sc.next();
			
			std[i] = st.add(name, score);
		}
		
		for(Student s : std)
		{
			System.out.println(s + " 등급 : " + s.grade());
		}
	}

}
