public class Primitive2Wrapper
{
	public static void main(String[] args) 
	{
		boolean bl = true;
		//ͨ����������b1�������ͱ�����װ�ɰ�װ�����
		Boolean blObj = new Boolean(bl);	
		int it = 5;
		//ͨ����������it�������ͱ�����װ�ɰ�װ�����
		Integer itObj = new Integer(it);
		//��һ���ַ���ת����Float����
		Float fl = new Float("4.56");
		//��һ���ַ���ת����Boolean����
		Boolean bObj = new Boolean("false");
		//�����������ʱ������java.lang.NumberFormatException�쳣
		//Long lObj = new Long("ddd");

		//ȡ��Boolean�������boolean����
		boolean bb = bObj.booleanValue();
		//ȡ��Integer�������int����
		int i = itObj.intValue();
		//ȡ��Float�������float����
		float f = fl.floatValue();
	}
}
