
public class Customer {
	private String name;		// 이름
	private int totalSalary;	// 본인의 총 급여
	private int totalSavings;	// 본인의 총 저축
	private String tel;			// 연락처(이메일)
	
	public Customer(String name, int totalSalary, int totalSavings, String tel)
	{
		this.name = name;
		this.totalSalary = totalSalary;
		this.totalSavings = totalSavings;
		this.tel = tel;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getTotalSalary()
	{
		return totalSalary;
	}
	
	public int getTotalSavings()
	{
		return totalSavings;
	}

	public String getTel()
	{
		return tel;
	}
	
	public String toString()
	{
		return "이름 :" + name + " 총 급여:" + totalSalary +
				" 총 저축금액 :" + totalSavings + " 연락처(이메일) :" + tel;
	}
}
