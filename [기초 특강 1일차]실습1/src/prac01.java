import java.util.Scanner;

public class prac01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int maxDay = 30;
		boolean vaildInput = false;
		
		System.out.println("년과 월을 입력하면 그 달의 말일을 알려드립니다.(ex: 2003 2)");
		System.out.print("입력 > ");
		int year = scan.nextInt();
		int month = scan.nextInt();
		
		switch(month)
		{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				maxDay=31;
				vaildInput=true;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				maxDay=30;
				vaildInput=true;
				break;
			case 2:
				if((year%4==0) && (year%100 !=0) || (year%400)==0)
				{
					maxDay = 29;
				}else {
					maxDay = 28;
				}
				vaildInput = true;
				break;
			default:
				vaildInput = false;
				break;
				
		}
		
		if(vaildInput)
		{
			System.out.println(year + "년 " + month + "월의 말일은 " + maxDay + "입니다.");
		}else {
			System.out.println("입력이 잘못 되었습니다.");
		}
	}

}
