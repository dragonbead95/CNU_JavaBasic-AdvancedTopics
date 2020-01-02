
public class TestPhone {
	public void run()
	{
		Phone[] phones = {new Phone("����"),new TelePhone("�α�","����"),
						new SmartPhone("����","������")};
		
		for(int i=0;i<phones.length;i++)
		{
			if(phones[i] instanceof SmartPhone)
			{
				SmartPhone smartphone = (SmartPhone) phones[i];
				smartphone.playGame();
			}
			else if(phones[i] instanceof TelePhone)
			{
				TelePhone telephone = (TelePhone) phones[i];
				telephone.autoAnswering();
			}else
			{
				phones[i].talk();
			}
		}
		
		
	}
}
