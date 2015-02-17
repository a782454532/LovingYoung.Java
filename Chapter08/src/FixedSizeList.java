
import java.util.*;
public class FixedSizeList
{
	public static void main(String[] args)
	{
		List fixedList = Arrays.asList("疯狂Java讲义"
			, "轻量级Java EE企业应用实战");
		//获取fixedList的实现类，将输出Arrays$ArrayList
		System.out.println(fixedList.getClass());
		//遍历fixedList的集合元素
		for (int i = 0; i < fixedList.size() ; i++)
		{
			System.out.println(fixedList.get(i));
		}
		//试图增加、删除元素都会引发UnsupportedOperationException异常
		fixedList.add("疯狂Android讲义");
		fixedList.remove("疯狂Java讲义");
	}
}
