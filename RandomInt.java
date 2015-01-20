public class RandomInt
{
	public static void main(String[] args)
	{
		String str="";
		int value;
		for(int i=0;i<6;i++)
		{
			value=(int)(Math.random()*26+97);
			str+=(char)value;
		}
		System.out.println(str);
	}
}
