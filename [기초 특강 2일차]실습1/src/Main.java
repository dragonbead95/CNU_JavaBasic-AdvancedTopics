import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrayMaxNum=10;
		FindMinMax findMinMax = new FindMinMax(arrayMaxNum);
		int max = findMinMax.findMax(0,arrayMaxNum-1);
		System.out.println("�迭�� �ִ� ���� : " + max);
		int min = findMinMax.findMin(0,arrayMaxNum-1);
		System.out.println("�迭�� �ּ� ���� : " + min);
		
		
		
	}

}
