package cn.p1.string.demo;

public class StringTest_2
{

	/*
	 * 2.ͳ���ַ�������ĸ���ַ������ֵĴ��� 
	 * ˼·�� 
	 * 1.Ҫ�ҵ��ַ����Ƿ���ڣ�������ڻ�ȡ����ֵ�λ�á��������ʹ��indexOf��ɡ�
	 * 2.����ҵ��ˣ���ô�ͼ�¼���ֵ�λ�ò���ʣ����ַ����м������Ҹ��ַ�������ʣ���ַ�������ʼλ���ǳ���λ��+���ַ����ĳ��ȡ�
	 * 3.�Դ����ƣ�ͨ��ѭ����ɲ��ң�����Ҳ�������-1������ÿ���ҵ����ü�������¼��
	 */
	public static void main(String[] args)
	{
		String str = "nbaasdifoajsnbadiiinbajsdfinbajsdionbanba";
		String key = "nba";

		int count = getKeyStringCount_2(str, key);
		System.out.println("count=" + count);
	}

	private static int getKeyStringCount_2(String str, String key)
	{
		int count = 0;
		int index = 0;
		while ((index = str.indexOf(key,index))!=-1)
		{
			index = index + key.length();
			count++;
		}
		return count;
	}

	private static int getKeyStringCount(String str, String key)
	{
		// 1.�����������
		int count = 0;

		// 2.���������¼key���ֵ�λ�á�
		int index = 0;

		while ((index = str.indexOf(key)) != -1)
		{
			str = str.substring(index + key.length());
			count++;
		}
		return count;
	}

}
