
public class prac02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int row=0;row<5;row++)
		{
			for(int colum=0; colum<5;colum++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int row=5;row>0;row--)
		{
			for(int colum=0; colum<row;colum++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int row=0;row<5;row++)
		{
			int colum;
			for(colum=0; colum<4-row;colum++)
			{
				System.out.print(" ");
			}
			for(; colum<5;colum++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		int size = 4;
		int count=0;
		for(int i=0;i<size-1;i++)
		{
			for(int j=0;j<size-i;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=0; j<i+1;j++)
			{
				System.out.print(++count + " ");
			}
			System.out.println();
			count=0;
		}
		
		for(int i=size+1;i<size*2+1;i++)
		{
			for(int j=0;j<i-size;j++)
			{
				System.out.print(" ");
						}
			for(int j=0;j<(size*2-i)+1; j++)
			{
				System.out.print(++count + " ");
				
			}
			System.out.println();
			count=0;
		}
		
	}

}
