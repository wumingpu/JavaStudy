package cn.p1.string.demo;

public class StringDemo
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		/*
		 * String����ص㣺
		 * �ַ�������һ������ʼ���Ͳ��ᱻ�ı��ˡ�
		 * 
		 */
		stringDemo2();
	}

	private static void stringDemo2()
	{
		// TODO Auto-generated method stub
		String s = "abc";
		
		String s1 = new String("abc"); // ���ڴ�����������ʵ����һ������  �ڶ��ڴ���
		
		System.out.println(s == s1); // false
		
		System.out.println(s.equals(s1)); // true 
		// string ���е�equals��кobject�е�equals������string���Լ����ж��ַ��������Ƿ���ͬ������
		// ��ʵ���ǱȽ��ַ������ݡ�
	}

	/**
	 * ��ʾ�ַ�������ĵ�һ�ַ�ʽ������ȷ�ַ��������ص��ص㡣
	 * ����û�оͽ����������о�ֱ����
	 * */
	private static void stringDemo1()
	{
		String s = "abc"; // abc �洢���ַ����������С�
//		s = "nba";
		String s1 = "abc";
		System.out.println(s == s1); // true
		//�ַ��������صĻ��ƣ�����Ϊ��
//		System.out.println("s="+s);
	}

}
