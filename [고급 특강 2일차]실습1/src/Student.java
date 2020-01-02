
public class Student<T extends Comparable> implements Comparable{
	private String name;
	private T score;
	
	public Student(String name, T score)
	{
		this.name = name;
		this.score = score;
	}
	
	public String getterName()
	{
		return name;
	}
	
	public T getterScore()
	{
		return score;
	}
	
	public void setterName(String name)
	{
		this.name = name;
	}
	
	public void setterScore(T score)
	{
		this.score = score;
	}

	@Override
	public int compareTo(Object object) {
		// TODO Auto-generated method stub
		// 학점 비교 코드를 여기에 작성
		if(this.score.compareTo(((Student)object).getterScore())>0)
		{
			return 1;
		}else if(this.score.compareTo(((Student)object).getterScore())<0) {
			return -1;
		}else
		{
			return 0;
		}
	}	
}
