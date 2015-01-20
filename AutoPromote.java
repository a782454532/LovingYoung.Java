public class AutoPromote
{
	public static void main(String[] args)
	{
		short sValue=5;
		System.out.println(sValue);
		//无法从int自动转换至short
		sValue=(short)(sValue-2);
		System.out.println(sValue);
	}
}
