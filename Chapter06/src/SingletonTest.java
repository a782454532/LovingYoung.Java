class Singleton
{
	//ʹ��һ����������������������ʵ��
	private static Singleton instance;
	//��������ʹ��private���Σ����ظù�����
	private Singleton(){}
	//�ṩһ����̬���������ڷ���Singletonʵ��
	//�÷������Լ����Զ���Ŀ��ƣ���ֻ֤����һ��Singleton����
	public static Singleton getInstance()
	{
		//���instanceΪnull����������������Singleton����
		//���instance��Ϊnull��������Ѿ�������Singleton����
		//���������´����µ�ʵ��
		if (instance == null)
		{
			//����һ��Singleton���󣬲����仺������
			instance = new Singleton();
		}
		return instance;
	}
}
public class SingletonTest
{
	public static void main(String[] args)
	{
		//����Singleton������ͨ����������
		//ֻ��ͨ��getInstance�������õ�ʵ��
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		//�����true
		System.out.println(s1 == s2);
	}
}