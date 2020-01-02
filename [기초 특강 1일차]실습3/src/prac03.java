
public class prac03 {
	public static void main(String args[])
	{
		int row = 5;
		int[] a = new int[row+1];
		a[0] = 1;
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5-i;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=i; j!=0; j--)
			{
				a[j] = a[j] + a[j-1];
			}
			
			for(int j=0;j<a.length; j++)
			{
				if(a[j] != 0)
					System.out.print(a[j] + " ");
			}
			
			System.out.println();
		}
		
	}
}
