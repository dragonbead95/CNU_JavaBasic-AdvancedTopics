
public class Customer {
	private String name;		// �̸�
	private int totalSalary;	// ������ �� �޿�
	private int totalSavings;	// ������ �� ����
	private String tel;			// ����ó(�̸���)
	
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
		return "�̸� :" + name + " �� �޿�:" + totalSalary +
				" �� ����ݾ� :" + totalSavings + " ����ó(�̸���) :" + tel;
	}
}
