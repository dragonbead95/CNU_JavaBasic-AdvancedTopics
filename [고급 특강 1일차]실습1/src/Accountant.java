import java.util.Scanner;

public class Accountant {
	private Customer[] customer = new Customer[10];
	private int count=0;
	private int size=0;
	private int i=0;
	private int del_i=0;
	
	public int taxCalculator(Customer customer)
	{
		int tax=0;
		int temp_totalSavings;
		int totalSalary = customer.getTotalSalary();
		int totalSavings = customer.getTotalSavings();
		
		if(totalSavings>=3000) {
			temp_totalSavings = 3000;
		}else {
			temp_totalSavings = totalSavings;
		}
		
		if(totalSalary-temp_totalSavings<1000)
		{
			tax = 0;
		}else if(totalSalary-temp_totalSavings>=1000 && 
				totalSalary-temp_totalSavings<3000)
		{
			tax = (int) ((totalSalary-temp_totalSavings)*0.1);
		}else if(totalSalary-temp_totalSavings>=3000 &&
				totalSalary-temp_totalSavings<6000)
		{
			tax = (int) ((totalSalary-temp_totalSavings)*0.2);
		}else if(totalSalary-temp_totalSavings>=6000)
		{
			tax = (int) ((totalSalary-temp_totalSavings)*0.3);
		}
		
		return tax;
	}
	
	// 고객 정보가 삽입되는 메소드
	public boolean addCustomer(String name, int totalSalary, int totalSavings, String tel)
	{
		if(size==customer.length)
		{
			resize();
		}
		customer[count++] = new Customer(name,totalSalary,totalSavings,tel);
		size++;
		return true;
	}
	
	//고객 정보가 삭제되는 메소드
	public boolean delCustomer(String name)
	{
		while(del_i<size)
		{
			if(customer[del_i].getName().equals(name))
			{
				System.arraycopy(customer, del_i+1, customer, del_i, size-del_i+1);
				customer[size] = null;
				size--;
				del_i = 0;
				return true;
			}else {
				del_i++;
				return delCustomer(name);
			}
		}
		return false;
	}
	
	//고객 정보를 찾아주는 메소드
	public Customer findCustomer(String name)
	{
		while(i<size) {
			if(customer[i].getName().equals(name))
			{
				int index = i;
				i = 0;
				return customer[index];
			}else {
				i++;
				return findCustomer(name);
			}
		}
		return null;
	}
	
	public void resize()
	{
		Customer[] temp = customer;
		customer = new Customer[temp.length*2];
		System.arraycopy(temp, 0, customer, 0, size);
	}
	
	public String toString()
	{
		StringBuffer buf = new StringBuffer();
		for(int i=0;i<size;i++)
		{
			buf.append(customer[i] + "\n");
		}
		return "고객 관리 정보\n" + buf;
	}
}
