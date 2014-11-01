package cn.p1.string.demo;

public class StringMethodDemo
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		/*
		 * ������������˼����ַ������й��ܷ��ࡣ
		 * ��abcd��
		 * 
		 * 1. ��ȡ��
		 * 1.1 ��ȡ�ַ����е��ַ��ĸ��������ȣ���
		 *      int length();
		 * 1.2 ����λ�û�ȡ�ַ�
		 * 		char charAt (int index);
		 * 1.3 �����ַ���ȡ���ַ����е�λ�á�
		 * 		int indexOf(int ch);
		 * 		int indexOf(int ch, int fromIndex);
		 * 		int indexOf(String str);
		 * 		int indexOf(String str, int fromIndex);
		 * 		
		 * 		int lastIndexOf(int ch);
		 * 		int lastIndexOf(int ch, int fromIndex);
		 * 		int lastIndexOf(String str);
		 * 		int lastIndexOf(String str, int fromIndex);
		 * 1.4 ��ȡ�ַ����е�һ�����ַ�����Ҳ���Ӵ���
		 * 		String subString(int beginIndex, int endIndex);//����begin��������end
		 * 		String subString(int beginIndex);
		 * 
		 * 2. ת��
		 * 2.1 ���ַ�������ַ������飨�ַ������и
		 * 		String[] split(String regex); �漰��������ʽ
		 * 2.2 ���ַ�������ַ����顣
		 * 		char[] toCharArray();
		 * 2.3 ���ַ�������ֽ����顣
		 * 		byte[] getBytes();
		 * 2.4 ���ַ����е���ĸת���ɴ�Сд
		 * 		String toUperCase()
		 * 		String toLowerCase()
		 * 2.5 ���ַ�����ָ���ַ��滻
		 * 		String replace(char,char);
		 * 		String replace(String s1,String s2);
		 * 2.6 ���ַ������˵Ŀո�ȥ��
		 * 		String trim();
		 * 2.7 ���ַ����������ӡ�
		 * 		String concat(string);
		 * 2.8 �������������ͱ���ַ���
		 * 		String valueOf(�ܶ����������͵�����)
		 * 
		 * 3. �ж�
		 * 3.1 �����ַ��������Ƿ���ͬ
		 * 		boolean equals(Object obj)
		 * 3.2 �Ƿ����  contains
		 * 3.3 ��ʲô��ͷ���߽�β  startWith()  endWith()
		 * 
		 * 4. �Ƚ�
		 * 4.1 compareTo������ĸ���ֵ�˳����бȽ�
		 * 
		 */
		stringMethodDemo_4();

	}

	private static void stringMethodDemo_4()
	{
		// TODO Auto-generated method stub
		System.out.println("a".compareTo("A"));
		
	}

	private static void stringMethodDemo_3()
	{
		// TODO Auto-generated method stub
		String s = "abc";
		System.out.println(s.equals("ABC".toLowerCase()));
		System.out.println();
		
		System.out.println(s.contains("cc"));
		
	}

	private static void stringMethodDemo_2()
	{
		// TODO Auto-generated method stub
		String s = "����,����,����";
		String[] arr = s.split(",");
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		String s1 = "����.����.����";
		String[] arr1 = s1.split("\\.");
		for (int i = 0; i < arr1.length; i++)
		{
			System.out.println(arr1[i]);
		}
		
		char[] chs = s.toCharArray();
		for (int i = 0; i < chs.length; i++)
		{
			System.out.println(chs[i]);
		}
		
		s = "ab��";
		byte[] bytes = s.getBytes();
		for (int i = 0; i < bytes.length; i++)
		{
			System.out.println(bytes[i]);
		}
		
		String s2 = "java";
		String s3 = s1.replace('q', 'z');
		System.out.println(s2==s3);
		
		System.out.println("-"+"   ab     c     ".trim()+"-");
		
		System.out.println("abc".concat("kk"));
		
		System.out.println(String.valueOf(true));
	}

	private static void stringMethodDemo_1()
	{
		// TODO Auto-generated method stub
		String s = "abcdae";
		System.out.println("length:"+s.length()); // 6
		System.out.println("char:"+s.charAt(2)); // c
		System.out.println("index:"+s.indexOf('k')); // -1
		System.out.println("index:"+s.lastIndexOf('a')); // 4
		
		System.out.println("substring:"+s.substring(2,4));
	}

}
