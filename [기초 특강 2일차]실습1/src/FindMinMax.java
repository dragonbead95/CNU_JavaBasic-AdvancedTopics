import java.util.Arrays;
import java.util.Random;

public class FindMinMax {
	private int _maxArraySize;
	private int[] _intArray = null;
	private int i =0;
	private int min = -1;
	private int max = -1;
	
	public FindMinMax(int maxSize){
		this._maxArraySize = maxSize;
		makeArray();
	}
	
	private void makeArray()
	{
		_intArray = new int[_maxArraySize];
		Random random = new Random();
		
		for(int i=0;i<_intArray.length;i++)
		{
			_intArray[i] = random.nextInt(this._maxArraySize);
		}
	}
	
	public int findMin(int low, int high)
	{
		if(min==-1)
		{
			min = _intArray[0];
		}
		
		while(low<high)
		{
			if(min>_intArray[low])
			{
				min = _intArray[low];
			}
			low++;
			return findMin(low,high);
		}
		return min;
	}
	
	public int findMax(int low, int high)
	{
		if(max==-1)
		{
			max = _intArray[0];
		}
		
		while(low<high)
		{
			if(max<_intArray[low])
			{
				max = _intArray[low];
			}
			low++;
			return findMax(low,high);
		}
		return max;
	}
}
