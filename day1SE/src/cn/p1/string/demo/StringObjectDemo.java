package cn.p1.string.demo;

public class StringObjectDemo
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
//		String s1 = "abc";
//		String s2 = "abc";
		
		//intern() ���ַ����ؽ��в���   �����ַ�������Ĺ淶����ʾ��ʽ��
		String s1 = new String("abc"); // ���abc����new��String�����Լ�ά����
		String s2 = s1.intern(); // �����ַ������еĶ���  �ַ������еĶ��ǹ�����ַ�������
		System.out.println(s1==s2);
	}

}
