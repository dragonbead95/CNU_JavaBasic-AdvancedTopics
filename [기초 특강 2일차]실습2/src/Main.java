import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] std = new Student[2];
		Student	st = new Student();
		Scanner sc = new Scanner(System.in);
		String name;
		String score;
		
		// �Է�
		for(int i=0;i<std.length;i++)
		{
			System.out.print("�̸��� �Է����ּ��� : ");
			name = sc.next();
			System.out.print("������ �Է����ּ��� : ");
			score = sc.next();
			
			std[i] = st.add(name, score);
		}
		
		for(Student s : std)
		{
			System.out.println(s + " ��� : " + s.grade());
		}
	}

}
