package cn.p1.string.demo;

/*
 * 4.ģ��һ��trim����
 * ˼·��
 * 1.������������
 * һ��������Ϊ��ͷ��ʼ�ж��ַ����ո�Ľűꡣ����++
 * һ��������Ϊ��β��ʼ�ж��ַ����ո�Ľűꡣ����--
 * 2.�жϵ����ǿո�Ϊֹ��ȡͷβ֮����ַ������ɡ�
 */
public class StringTest_4
{
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		String s = "    ab    c      ";

		s = myTrim(s);
		System.out.println("-" + s + "-");

	}

	private static String myTrim(String s)
	{
		int start = 0, end = s.length() - 1;
		while (start <= end && s.charAt(start) == ' ')
		{
			start++;
		}
		while (start <= end && s.charAt(end) == ' ')
		{
			end--;
		}
		return s.substring(start, end + 1);
	}

}
