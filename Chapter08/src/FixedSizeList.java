
import java.util.*;
public class FixedSizeList
{
	public static void main(String[] args)
	{
		List fixedList = Arrays.asList("���Java����"
			, "������Java EE��ҵӦ��ʵս");
		//��ȡfixedList��ʵ���࣬�����Arrays$ArrayList
		System.out.println(fixedList.getClass());
		//����fixedList�ļ���Ԫ��
		for (int i = 0; i < fixedList.size() ; i++)
		{
			System.out.println(fixedList.get(i));
		}
		//��ͼ���ӡ�ɾ��Ԫ�ض�������UnsupportedOperationException�쳣
		fixedList.add("���Android����");
		fixedList.remove("���Java����");
	}
}
