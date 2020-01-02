
public class Subject<T extends Comparable>{
	private Student<Integer>[] std = new Student[10];
	private int count=0;
	
	public void inputStudent(String name, int score)
	{
		std[count++] = new Student<>(name,score);
	}
	
	public <T extends Comparable> Student maxScoreStudent()
	{
		Student<Integer> temp = std[0];
		
		for(int i=1;i<count;i++)
		{
			if(temp.compareTo(std[i])<0)
			{
				temp = std[i];
			}
		}
		return temp;
	}
	
	public Student findScore(String name)
	{
		for(int i=0;i<std.length;i++)
		{
			
			if(std[i].getterName().compareTo(name)==0)
			{
				return std[i];
			}
		}
		return null;
	}
}
