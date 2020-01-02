
public class Student {
	private String name;
	private int score;
	
	public Student(String name,String score)
	{
		this.name = name;
		this.score = Integer.parseInt(score);
	}
	
	public Student()
	{
		
	}
	
	public Student add(String name,String score)
	{
		return new Student(name,score);
	}
	
	public String toString()
	{
		return "이름 : " + name + " 점수 : " + score;
	}
	
	public String grade()
	{
		if(score<60)
		{
			return "F";
		}else if(score>=60 && score<70)
		{
			return "D";
		}else if(score>=70 && score<80)
		{
			return "C";
		}else if(score>=80 && score<90)
		{
			return "B";
		}else if(score>=90 && score<=100)
		{
			return "A";
		}else {
			return "에러";
		}
		
	}

}
