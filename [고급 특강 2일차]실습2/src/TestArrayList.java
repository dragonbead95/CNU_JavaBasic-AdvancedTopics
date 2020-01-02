import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestArrayList {
	public void run()
	{
		ArrayList<String> arrayList = new ArrayList<String>();
		ArrayList<String> arrayList2 = new ArrayList<String>();
		
		arrayList.add("나비");
		arrayList.add("고양이");
		arrayList.add("강아지");
		arrayList.add("말");
		arrayList.add("토끼");
		
		System.out.println("arrayListSet " + arrayList);
		arrayList.forEach(v->System.out.print(v + " "));
		
		System.out.println();
		
		System.out.println("문자열이 2인 단어 출력");
		// 문자열이 2인 단어만 출력
		for(Iterator<String> it = arrayList.iterator();it.hasNext();)
		{
			String str = it.next();
			
			if(str.length()==2)
			{
				System.out.print(str + " ");
			}
		}
		System.out.println();
		
		arrayList2.add("당나귀");
		arrayList2.add("코끼리");
		arrayList2.add("토끼");
		
		Set hashset1 = new HashSet<String>(arrayList);
		Set hashset2 = new HashSet<String>(arrayList2);
		
		System.out.println("hashset1, hashset2 내용 출력");
		System.out.println(hashset1);
		System.out.println(hashset2);
		
		System.out.println();
		
		hashset1.addAll(hashset2);
		System.out.println("hashset1과 hashset2의 합집합 출력");
		System.out.println(hashset1);
		
		hashset1.retainAll(hashset2);
		System.out.println("hashset1과 hashset2의 교집합 출력");
		System.out.println(hashset1);
		
	}
}
