import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestArrayList {
	public void run()
	{
		ArrayList<String> arrayList = new ArrayList<String>();
		ArrayList<String> arrayList2 = new ArrayList<String>();
		
		arrayList.add("����");
		arrayList.add("�����");
		arrayList.add("������");
		arrayList.add("��");
		arrayList.add("�䳢");
		
		System.out.println("arrayListSet " + arrayList);
		arrayList.forEach(v->System.out.print(v + " "));
		
		System.out.println();
		
		System.out.println("���ڿ��� 2�� �ܾ� ���");
		// ���ڿ��� 2�� �ܾ ���
		for(Iterator<String> it = arrayList.iterator();it.hasNext();)
		{
			String str = it.next();
			
			if(str.length()==2)
			{
				System.out.print(str + " ");
			}
		}
		System.out.println();
		
		arrayList2.add("�糪��");
		arrayList2.add("�ڳ���");
		arrayList2.add("�䳢");
		
		Set hashset1 = new HashSet<String>(arrayList);
		Set hashset2 = new HashSet<String>(arrayList2);
		
		System.out.println("hashset1, hashset2 ���� ���");
		System.out.println(hashset1);
		System.out.println(hashset2);
		
		System.out.println();
		
		hashset1.addAll(hashset2);
		System.out.println("hashset1�� hashset2�� ������ ���");
		System.out.println(hashset1);
		
		hashset1.retainAll(hashset2);
		System.out.println("hashset1�� hashset2�� ������ ���");
		System.out.println(hashset1);
		
	}
}
